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
        drumSticks = new DrumSticks( "Drum Sticks", 20.00, 39.99 );
        shop.addItem(drumSticks);
        assertEquals( 3, stock.size() );
    }

    @Test
    public void canRemoveByIndex() {
        drumSticks = new DrumSticks( "Drum Sticks", 20.00, 39.99 );
        shop.removeItemByIndex(0);
        assertEquals( 2, stock.size() );
    }


}