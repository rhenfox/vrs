/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vrs.data;


/**
 *
 * @author Aldrin
 */
public class LoginUser {

    private static com.vrs.model.User user;

    /**
     * @return the user
     */
    public static com.vrs.model.User getUser() {
        return user;
    }

    /**
     * @param aUser the user to set
     */
    public static void setUser(com.vrs.model.User aUser) {
        user = aUser;
    }

   

}
