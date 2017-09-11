package com.example.heather.musicshop;


/**
 * Created by heather on 09/09/2017.
 */

public abstract class Instrument implements Playable, Sellable {
    private String instrument;
    private int quantity;
    private String colour;
    private String material;
    private double buyingPrice;
    private double sellingPrice;
    private InstrumentType type;


    //constructor
    public Instrument(
            String instrument,
            int quantity,
            String colour,
            String material,
            double buyingPrice,
            double sellingPrice,
            InstrumentType type) {
        this.instrument = instrument;
        this.quantity = quantity;
        this.colour = colour;
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.type = type;
    }

    //getters
    public String getInstrument() {
        return instrument;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public InstrumentType getType() {
        return type;
    }


    //methods
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    public double calculateMarkupPercentage() {
        return (calculateMarkup() / buyingPrice) * 100;
    }


}
