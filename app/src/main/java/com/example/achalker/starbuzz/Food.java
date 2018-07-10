package com.example.achalker.starbuzz;

public class Food {
    private String name;
    private String description;

    public  static final Food[] foods = {
        new Food("Croissant", "Light fluffy pastry"),
        new Food("Banana Nut Bread", "Walnut warm slice of bread"),
        new Food("Muffin", "Comfort food")
    };

    private Food (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
