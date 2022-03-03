/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xprodswing.principal.model;

/**
 *
 * @author Paul EDIDE
 */
public class Users {
    private int idUser;
    private String username;
    private String password;
    private String authorization;

    public Users() {
    }

    public Users(int idUser, String username, String password, String authorization) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.authorization = authorization;
    }
    
    

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
    
    
}
