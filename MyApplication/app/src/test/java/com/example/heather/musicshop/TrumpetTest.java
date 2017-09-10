package com.example.heather.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 09/09/2017.
 */
public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Trumpet", 1, "Gold", "Brass", 150.00, 199.99, InstrumentType.BRASS, 7);
        }


    @Test
    public void canGetInstrument() {
        assertEquals( "Trumpet", trumpet.getInstrument() );
    }

    @Test
    public void canGetQuantity() {
        assertEquals( 1, trumpet.getQuantity() );
    }

    @Test
    public void canGetColour() {
        assertEquals( "Gold", trumpet.getColour() );
    }

    @Test
    public void canGetMaterial() {
        assertEquals( "Brass", trumpet.getMaterial() );
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals( 150.00, trumpet.getBuyingPrice(), 0.01 );
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals( 199.99, trumpet.getSellingPrice(), 0.01 );
    }

    @Test
    public void canGetType() {
        assertEquals( InstrumentType.BRASS, trumpet.getType() );
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals( 7, trumpet.getNumberOfValves() );
    }

    @Test
    public void canPlay(){
        assertEquals( "TOOT", trumpet.play() );
    }

    @Test
    public void profitOnItem() {
        assertEquals( 49.99, trumpet.calculateMarkup(), 0.01 );
    }

    @Test
    public void percentageProfitOnItem() {
        assertEquals( 33.33, trumpet.calculateMarkupPercentage(), 0.01 );
    }


}