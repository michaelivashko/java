package com.maivashko.movieland.entity;

public class User2 {
    private String name;
    private String email;
    private int id;

/*    public User2(String userName, String userEmail) {
        this.name = userName;
        this.email = userEmail;
    }*/

   /* public User2() {
    }*/

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
}
