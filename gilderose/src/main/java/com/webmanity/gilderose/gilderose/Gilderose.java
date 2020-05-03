package com.webmanity.gilderose.gilderose;

class GildedRose {
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";
	Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
			if (!item.name.equals(AGED_BRIE)
                    && !item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
				if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
					if (item.quality > 0) {
                    	item.quality = item.quality - 1;
                    } 
					else {
                   	 item.quality = 0;
                    }
                }
            } else {
                if (item.quality < 50) {
                	item.quality = item.quality + 1;
                	item.sellIn = item.sellIn - 1;

                    if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                            	item.quality = item.quality + 1;
                            }
                        }
                    }
                }
            }
        }
    }
}

