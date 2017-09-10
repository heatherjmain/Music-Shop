package com.example.heather.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 09/09/2017.
 */
public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic( "Sheet Music", 16.00, 24.99 );
    }

    @Test
    public void canGetAccessory() {
        assertEquals( "Sheet Music", sheetMusic.getAccessory() );
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals( 16.00, sheetMusic.getBuyingPrice(), 0.01 );
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals( 24.99, sheetMusic.getSellingPrice(), 0.01 );
    }

    @Test
    public void profitOnItem() {
        assertEquals( 8.99, sheetMusic.calculateMarkup(), 0.01 );
    }

    @Test
    public void percentageProfitOnItem() {
        assertEquals( 56.18, sheetMusic.calculateMarkupPercentage(), 0.01 );
    }
}