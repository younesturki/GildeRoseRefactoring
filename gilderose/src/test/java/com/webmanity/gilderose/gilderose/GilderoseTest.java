package com.webmanity.gilderose.gilderose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;

class GildedRoseTest {
	
	Item[] items;
	GildedRose app;
	
	@BeforeEach
	void init() {
		items = new Item[] {
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
		};
		
		app = new GildedRose(items);
		app.updateQuality();
	}

    @Test
    void items0_when_applying_updateQuality_quality_equals_to_1() {
        assertEquals(1, app.items[0].quality);
    }
    
    @Test
    void items1_when_applying_updateQuality_quality_equals_to_6() {
        assertEquals(6, app.items[1].quality);
    }
    
    @Test
    void items3_when_applying_updateQuality_quality_equals_to_80() {
        assertEquals(80, app.items[3].quality);
    }
    
    @Test
    void items4_when_applying_updateQuality_quality_equals_to_21() {
        assertEquals(21, app.items[4].quality);
    }
    
    @Test
    void items5_when_applying_updateQuality_quality_equals_to_50() {
        assertEquals(50, app.items[5].quality);
    }
	
	 @Test
	 void items6_when_applying_updateQuality_sellIn_equals_to_50() {
	        assertEquals(50, app.items[6].quality);
	    }
	
	 @Test
	  void items0_when_applying_updateQuality_sellIn_equals_to_1() {
        assertEquals(1, app.items[0].sellIn);
    }
	
	 @Test
	  void items4_when_applying_updateQuality_sellIn_equals_to_14() {
       assertEquals(14, app.items[4].sellIn);
   }
	
	 @Test
	  void items5_when_applying_updateQuality_sellIn_equals_to_9() {
       assertEquals(9, app.items[5].sellIn);
   }
	
   

}
