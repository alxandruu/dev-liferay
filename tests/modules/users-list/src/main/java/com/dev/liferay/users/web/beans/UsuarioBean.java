package com.dev.liferay.users.web.beans;

public class UsuarioBean {
    long id;
    String username;
    String email;
    String name;
    String surname1;
    String surname2;

    public UsuarioBean(long id, String username, String email, String name, String surname1, String surname2) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }
}
