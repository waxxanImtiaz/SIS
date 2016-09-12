/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.*;
import java.util.List;
import java.util.*;
import beans.*;

public class Client {
    public static void main(String[] args) {
          try{
                   
              System.out.println("Main  is called");
              Configuration cf = new Configuration();
              cf.configure("xmlFiles/hibernate.cfg.xml");
              SessionFactory sf = cf.buildSessionFactory();
              Session ses = sf.openSession();
//                 System.out.println("Session is created");
//               System.out.println("Master table");
//
//               System.out.println("after master table");
////              
//              beans.DepartAndBatches db = (beans.DepartAndBatches)ses.get(beans.DepartAndBatches.class, "13");
           //   Master m = (Master)ses.get(Master.class, "computer");
              
           
              
               
//               System.out.println("Main is called");
//              System.out.println("depart="+m.getDepart());
//              System.out.println("depart="+m.getMasterKey());
      
              Criteria c = ses.createCriteria(Master.class);
              c.add( Restrictions.eq("masterKey", "computer"));
              List result = c.list();
              for(Iterator itr = result.iterator(); itr.hasNext();)
              {
                   Master mn = (Master)itr.next();
                   System.out.println("depart="+mn.getDepart());
                   System.out.println("depart="+mn.getMasterKey());
              }
//              
//              c.add(se);
              
//             Master mn = (Master)c.uniqueResult();
//              System.out.println("depart="+mn.getDepart());
//              System.out.println("depart="+mn.getMasterKey());
//        
        
//        
//        List<Object> obj = q.list();
//        
//        for(Object ob: obj)
//        {
//            Object object[] = (Object[])ob; 
//            System.out.println(object[0]);
//            System.out.println(object[1]);
//        }
////        
//        
//        Master m = (Master)q.uniqueResult();
              
            
          
              ses.close();
              sf.close();;
          }catch(Exception e)
          {
              
          }
          
      
    }
}
