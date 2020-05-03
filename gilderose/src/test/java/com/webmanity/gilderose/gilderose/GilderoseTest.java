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
    void items1_when_applying_updateQuality_quality_equals_to_1() {
        assertEquals(6, app.items[1].quality);
    }
	
	
    
   

}
