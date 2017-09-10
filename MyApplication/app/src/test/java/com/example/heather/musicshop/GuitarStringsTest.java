package com.example.heather.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 09/09/2017.
 */
public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings( "Guitar Strings", 2.50, 4.75 );
    }

    @Test
    public void canGetAccessory() {
        assertEquals( "Guitar Strings", guitarStrings.getAccessory() );
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals( 2.50, guitarStrings.getBuyingPrice(), 0.01 );
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals( 4.75, guitarStrings.getSellingPrice(), 0.01 );
    }

    @Test
    public void profitOnItem() {
        assertEquals( 2.25, guitarStrings.calculateMarkup(), 0.01 );
    }

    @Test
    public void percentageProfitOnItem() {
        assertEquals( 90.00, guitarStrings.calculateMarkupPercentage(), 0.01 );
    }
}