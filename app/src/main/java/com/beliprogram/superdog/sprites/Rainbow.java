/**
 * Rainbow tail for the nyan cat
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

public class Rainbow extends Sprite {
    
    /**
     * Static bitmap to reduce memory usage.
     */
    public static Bitmap globalBitmap;
    
    public Rainbow(GameView view, Game game) {
        super(view, game);
        if(globalBitmap == null){
            globalBitmap = Util.getScaledBitmapAlpha8(game, R.drawable.rainbow);
        }
        this.bitmap = globalBitmap;
        this.width = this.bitmap.getWidth()/(colNr = 4);
        this.height = this.bitmap.getHeight()/3;
    }

    @Override
    public void move() {
        changeToNextFrame();
        super.move();
    }
    
    
}
