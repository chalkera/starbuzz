package com.example.achalker.starbuzz;

public class Store {
    private String name;
    private String location;

    public  static final Store[] stores = {
            new Store("Home", "Right in your backdoor"),
            new Store("Near your work", "Still convenient"),
            new Store("But Why?", "Why is this even here")
    };

    private Store (String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
