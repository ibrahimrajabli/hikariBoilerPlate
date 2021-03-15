package com.vnasibov.model;

public class User {
    private int id;
    private String uname;
    private String surname;
    private String age;
    private String facebookUrl;

    private String username;
    private String password;

    public User(int id, String uname, String surname, String age, String facebookUrl, String username, String password) {
        this.id = id;
        this.uname = uname;
        this.surname = surname;
        this.age = age;
        this.facebookUrl = facebookUrl;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
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
}
