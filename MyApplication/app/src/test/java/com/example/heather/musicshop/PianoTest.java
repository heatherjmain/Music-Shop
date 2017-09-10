package com.example.heather.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 09/09/2017.
 */
public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Piano", 2, "Black", "Wood", 1000.00, 1799.99, InstrumentType.KEYBOARD, 42);
    }

    @Test
    public void canGetInstrument() {
        assertEquals( "Piano", piano.getInstrument() );
    }

    @Test
    public void canGetQuantity() {
        assertEquals( 2, piano.getQuantity() );
    }

    @Test
    public void canGetColour() {
        assertEquals( "Black", piano.getColour() );
    }

    @Test
    public void canGetMaterial() {
        assertEquals( "Wood", piano.getMaterial() );
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals( 1000.00, piano.getBuyingPrice(), 0.01 );
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals( 1799.99, piano.getSellingPrice(), 0.01 );
    }

    @Test
    public void canGetType() {
        assertEquals( InstrumentType.KEYBOARD, piano.getType() );
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals( 42, piano.getNumberOfKeys() );
    }

    @Test
    public void canPlay() {
        assertEquals( "PLONK", piano.play() );
    }

    @Test
    public void profitOnItem() {
        assertEquals( 799.99, piano.calculateMarkup(), 0.01 );
    }

    @Test
    public void percentageProfitOnItem() {
        assertEquals( 80.00, piano.calculateMarkupPercentage(), 0.01 );
    }
}