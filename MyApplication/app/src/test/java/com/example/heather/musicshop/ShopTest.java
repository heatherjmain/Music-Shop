package com.example.heather.musicshop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by heather on 09/09/2017.
 */
public class ShopTest {

    Shop shop;
    ArrayList<Sellable> stock;
    DrumSticks drumSticks;
    Guitar guitar;



    @Before
    public void before() {
        shop = new Shop( "Rays Music Exchange", stock );
        stock = new ArrayList<>();
        stock.add(new Guitar("Guitar", 1, "White", "Plastic", 135.00, 199.99, InstrumentType.STRING, 8 ));
        stock.add(new SheetMusic( "Sheet Music", 12.00, 19.99 ));
    }

    @Test
    public void canGetStock() {
        //arrange
        shop = new Shop( "Rays Music Exchange", stock );
        //act
        ArrayList<Sellable> result = shop.getStock();
        //assert
        assertEquals( "Guitar", ((Guitar)result.get(0)).getInstrument() );
        assertEquals( "Sheet Music", ((SheetMusic)result.get(1)).getAccessory() );

    }

    @Test
    public void canGetName() {
        assertEquals( "Rays Music Exchange", shop.getName() );
    }

    @Test
    public void canAddItem() {
        Shop newShop = new Shop("Test Shop", new ArrayList<Sellable>());
        drumSticks = new DrumSticks( "Drum Sticks", 20.00, 39.99 );

        ArrayList<Sellable> expectedStock = new ArrayList<>();
        expectedStock.add(drumSticks);

        newShop.addItem(drumSticks);

        assertEquals( 1, newShop.getStock().size() );
        assertEquals( expectedStock, newShop.getStock() );
    }

    @Test
    public void canRemoveByIndex() {
        //make a new shop, some drumsticks and a guitar
        Shop newShop = new Shop("Test Shop", new ArrayList<Sellable>());
        drumSticks = new DrumSticks( "Drum Sticks", 20.00, 39.99 );
        guitar = new Guitar( "Guitar", 1, "White", "Plastic", 135.00, 199.99, InstrumentType.STRING, 8);

        //create a new arraylist to compare to.
        //This should equate to what is expected by using the method
        ArrayList<Sellable> expectedStock = new ArrayList<>();
        expectedStock.add(drumSticks);

        //add items into the stock array using addItem method(tested above)
        newShop.addItem(guitar);
        newShop.addItem(drumSticks);

        //remove item from shop by index(method being tested here)
        newShop.removeItemByIndex(0);

        //assert there is only 1 item in the array as 2 added and 1 removed
        assertEquals( 1, newShop.getStock().size() );
        //assert that the test ArrayList matches the test ArrayList
        assertEquals( expectedStock, newShop.getStock() );
    }


}