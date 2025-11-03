package com.pluralsight.models;

import java.util.List;

public class Portfolio {
    private String name, owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void addAsset(Valuable asset) {
        assets.add(asset);
    }

    // method below should be void instead of double
    // need to figure out how to implement Valuable Object into class
    public void getValue() {
        for (int i = 0; i < assets.size(); i++) {
            System.out.println("soup");
        }
    }

    public double getMostValuable() {
        return 0;
    }

    public double getLeastValuable() {
        return 0;
    }

}
