package com.example.heather.musicshop;

import java.util.ArrayList;

/**
 * Created by heather on 09/09/2017.
 */

public class Shop {
    String name;
    ArrayList<Sellable> stock;

    public Shop(String name, ArrayList<Sellable> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    //getter
    public ArrayList<Sellable> getStock() {
        return stock;
    }


    //methods
    public void addItem(Sellable sellable) { //I haven't been able to make a working test for this???
        stock.add(sellable);
    }

    public void removeItemByIndex(int index) {
        stock.remove(index);
    }
}
