/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.cfg.Configuration;
public class InitialiazerHibernateSession {
     private SessionFactory sessionFactory;
     private Session session;
     private HttpServletRequest request;
     private HttpServletResponse response;
     public InitialiazerHibernateSession(HttpServletRequest request,HttpServletResponse response){
         try{
         setSessionFactory((SessionFactory)request.getServletContext().getAttribute("sessionFactory"));
         setSession(getSessionFactory().openSession());
         setRequest(request);
         setResponse(response);
         
        }catch(NullPointerException e)
        {
          System.out.println("not initialized");
        }
     }//end of constructor
    /**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

   
    /**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * @return the session
     */
    public Session getSession() {
        return session;
    }

    /**
     * @param session the session to set
     */
    public void setSession(Session session) {
        this.session = session;
    }

    /**
     * @return the request
     */
    public HttpServletRequest getRequest() {
        return request;
    }

    /**
     * @param request the request to set
     */
    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    /**
     * @return the response
     */
    public HttpServletResponse getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }
}
