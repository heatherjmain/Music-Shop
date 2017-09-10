package com.example.heather.musicshop;



/**
 * Created by heather on 09/09/2017.
 */

public class Guitar extends Instrument {
    int numberOfStrings;

    //constructor
    public Guitar(
            String instrument,
            int quantity,
            String colour,
            String material,
            double buyingPrice,
            double sellingPrice,
            InstrumentType type,
            int numberOfStrings) {
        super(instrument, quantity, colour, material, buyingPrice, sellingPrice, type);
        this.numberOfStrings = numberOfStrings;
    }

    //getters
    public int getNumberOfStrings() {
        return numberOfStrings;
    }


    //methods
    public String play() {
        return "STRUM";
    }




}
