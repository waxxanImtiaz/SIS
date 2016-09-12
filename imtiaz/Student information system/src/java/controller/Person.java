/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


public class Person {
     private String userName;
     private String password;
     private InitialiazerHibernateSession initializer;
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the initializer
     */
    public InitialiazerHibernateSession getInitializer() {
        return initializer;
    }

    /**
     * @param initializer the initializer to set
     */
    public void setInitializer(InitialiazerHibernateSession initializer) {
        this.initializer = initializer;
    }

}
