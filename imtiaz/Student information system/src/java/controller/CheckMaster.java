/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Master;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


public class CheckMaster extends Person {
   
    private Master master;
    private StudentChecker studentChecker;
    private InitialiazerHibernateSession initializer;
    public CheckMaster(String userName,String password,InitialiazerHibernateSession initializer)
    {
        super.setUserName(userName);
        super.setPassword(password);
        super.setInitializer(initializer);
        setStudentChecker(new StudentChecker(super.getUserName(),super.getPassword(),super.getInitializer()));
        
    }//end of constructor
    
    public boolean isMaster(){
        if(!isMasterKey())
        {
            System.out.println("user is not master");
            return false;
        }
        else{
//            System.out.println("username="+studentChecker.getUserName());
//            System.out.println("name="+studentChecker.getStudent());
            System.out.println("after loader initialization");
            if(getStudentChecker().isUsernameOk() & isSameDepartment())
            {
                System.out.println("isMaster true");
                return true;
            }else{
                return false;
            }
        }//end of else if
    }
    
    private boolean isSameDepartment()
    {
        try
        {
            boolean isOk = getStudentChecker().getStudent().getDepartment().equals(getMaster().getDepart());
        if(isOk)
        {
            super.getInitializer().getRequest().getServletContext().setAttribute("studentChecker", getStudentChecker());
            return true;
        }
        else
            return false;
        }catch(NullPointerException e)
        {
            System.out.println("Exception in CheckMaster's method isSameDepartment():"+e.getMessage());
        }
        return false;
    }//end of isSameDepartment
    private boolean isMasterKey()  {
      try{
       Criteria c = getInitializer().getSession().createCriteria(Master.class);
       c.add(Restrictions.eq("masterKey", getPassword()));
          System.out.println("masterKey="+getPassword());
       List result = c.list();
       setMaster((Master)result.get(0));
       return true;
      }catch( IndexOutOfBoundsException e)
      {
          System.out.println("Exception in isMasterKey="+e.getMessage());
          return false;
      }
      
  }//end of isMasterKey method

    /**
     * @return the master
     */
    public Master getMaster() {
        return master;
    }

    /**
     * @param master the master to set
     */
    public void setMaster(Master master) {
        this.master = master;
    }

    /**
     * @return the studentChecker
     */
    public StudentChecker getStudentChecker() {
        return studentChecker;
    }

    /**
     * @param studentChecker the studentChecker to set
     */
    public void setStudentChecker(StudentChecker studentChecker) {
        this.studentChecker = studentChecker;
    }

}
