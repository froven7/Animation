package com.example.mw;

public class Items {
    String ID;
    String name;
    String email;

    public Items(String ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
