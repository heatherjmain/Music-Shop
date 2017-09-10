package com.example.heather.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 09/09/2017.
 */
public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Guitar", 5, "Brown", "Wood", 99.00, 149.99, InstrumentType.STRING, 6);
    }

    @Test
    public void canGetInstrument() {
        assertEquals( "Guitar", guitar.getInstrument() );
    }

    @Test
    public void canGetQuantity() {
        assertEquals( 5, guitar.getQuantity() );
    }

    @Test
    public void canGetColour() {
        assertEquals( "Brown", guitar.getColour() );
    }

    @Test
    public void canGetMaterial() {
        assertEquals( "Wood", guitar.getMaterial() );
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals( 99.00, guitar.getBuyingPrice(), 0.01 );
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals( 149.99, guitar.getSellingPrice(), 0.01 );
    }

    @Test
    public void canGetType() {
        assertEquals( InstrumentType.STRING, guitar.getType() );
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals( 6, guitar.getNumberOfStrings() );
    }

    @Test
    public void canPlay() {
        assertEquals( "STRUM", guitar.play() );
    }

    @Test
    public void profitOnItem() {
        assertEquals( 50.99, guitar.calculateMarkup(), 0.01 );
    }

    @Test
    public void percentageProfitOnItem() {
        assertEquals( 51.50, guitar.calculateMarkupPercentage(), 0.01 );
    }
}