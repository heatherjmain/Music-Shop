package com.example.heather.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 09/09/2017.
 */
public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks( "Drum Sticks", 5.00, 11.99 );
    }

    @Test
    public void canGetAccessory() {
        assertEquals( "Drum Sticks", drumSticks.getAccessory() );
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals( 5.00, drumSticks.getBuyingPrice(), 0.01 );
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals( 11.99, drumSticks.getSellingPrice(), 0.01 );
    }

    @Test
    public void profitOnItem() {
        assertEquals( 6.99, drumSticks.calculateMarkup(), 0.01 );
    }

    @Test
    public void percentageProfitOnItem() {
        assertEquals( 139.80, drumSticks.calculateMarkupPercentage(), 0.01 );
    }
}