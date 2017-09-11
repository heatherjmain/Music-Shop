package com.example.heather.musicshop;

/**
 * Created by heather on 09/09/2017.
 */

public class Trumpet extends Instrument {
    private int numberOfValves;

    //constructor
    public Trumpet(
            String instrument,
            int quantity,
            String colour,
            String material,
            double buyingPrice,
            double sellingPrice,
            InstrumentType type,
            int numberOfValves) {
        super(instrument, quantity, colour, material, buyingPrice, sellingPrice, type);
        this.numberOfValves = numberOfValves;
    }


    //getters
    public int getNumberOfValves() {
        return numberOfValves;
    }


    //methods
    public String play() {
        return "TOOT";
    }





}
