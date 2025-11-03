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

    public double getValue() {
        return 0;
    }

    public double getMostValuable() {
        return 0;
    }

    public double getLeastValuable() {
        return 0;
    }

}
