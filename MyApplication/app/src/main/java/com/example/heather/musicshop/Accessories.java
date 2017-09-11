package com.example.heather.musicshop;

/**
 * Created by heather on 09/09/2017.
 */

public abstract class Accessories implements Sellable {
    private String accessory;
    private double buyingPrice;
    private double sellingPrice;

    //constructor
    public Accessories(String accessory, double buyingPrice, double sellingPrice) {
        this.accessory = accessory;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }


    //getters
    public String getAccessory() {
        return accessory;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    //methods
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    public double calculateMarkupPercentage() {
        return (calculateMarkup() / buyingPrice) * 100;
    }
}
