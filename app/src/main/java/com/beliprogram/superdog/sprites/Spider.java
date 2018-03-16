/**
 * A spider with web
 * 
 * BTW Spiders have 8 eyes.
 * 
 * @author Lars Harmsen
 * Copyright (c) <2014> <Lars Harmsen - Quchen>
 */
package com.beliprogram.superdog.sprites;

import com.beliprogram.superdog.Game;
import com.beliprogram.superdog.GameView;
import com.beliprogram.superdog.R;
import com.beliprogram.superdog.Util;

import android.graphics.Bitmap;

public class Spider extends Sprite {
    
    /**
     * Static bitmap to reduce memory usage.
     */
    public static Bitmap globalBitmap;

    public Spider(GameView view, Game game) {
        super(view, game);
        if(globalBitmap == null){
            globalBitmap = Util.getScaledBitmapAlpha8(game, R.drawable.spider_full);
        }
        this.bitmap = globalBitmap;
        this.width = this.bitmap.getWidth();
        this.height = this.bitmap.getHeight();
    }
    
    /**
     * Sets the position
     * @param x
     * @param y
     */
    public void init(int x, int y){
        this.x = x;
        this.y = y;
    }

}
