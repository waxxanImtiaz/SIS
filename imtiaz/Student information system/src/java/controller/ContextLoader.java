/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Web application lifecycle listener.
 *
 * @author waxxan
 */
public class ContextLoader implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
               ServletContext sc = sce.getServletContext();
    	  try{
                   
              System.out.println("Listiner is called");
                Configuration cf = new Configuration();
                cf.configure("xmlFiles/hibernate.cfg.xml");
                SessionFactory sf = cf.buildSessionFactory();
                sc.setAttribute("sessionFactory", sf);
                sc.setAttribute("name", "imtiaz");
                
                
          }catch(Exception e)
          {
              
          }
 //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
