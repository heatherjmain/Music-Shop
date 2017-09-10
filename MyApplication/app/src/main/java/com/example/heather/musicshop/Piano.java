package com.example.heather.musicshop;



/**
 * Created by heather on 09/09/2017.
 */

public class Piano extends Instrument {
    int numberOfKeys;


    //constructor
    public Piano(
            String instrument,
            int quantity,
            String colour,
            String material,
            double buyingPrice,
            double sellingPrice,
            InstrumentType type,
            int numberOfKeys) {
        super(instrument, quantity,colour, material, buyingPrice, sellingPrice, type);
        this.numberOfKeys = numberOfKeys;
    }

    //getters
    public int getNumberOfKeys() {
        return numberOfKeys;
    }



    //methods
    public String play() {
        return "PLONK";
    }




}
