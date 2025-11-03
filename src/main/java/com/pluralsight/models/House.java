package com.pluralsight.models;

public class House extends FixedAsset {
    private int yearBuilt, squareFeet, bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public void getValue(double value) {

    }
}
