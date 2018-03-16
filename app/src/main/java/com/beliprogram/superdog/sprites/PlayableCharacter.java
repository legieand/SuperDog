
package com.beliprogram.superdog.sprites;

import com.beliprogram.superdog.Game;
import com.beliprogram.superdog.GameView;

public abstract class PlayableCharacter extends Sprite {
    
    protected boolean isDead = false;
    
    public PlayableCharacter(GameView view, Game game) {
        super(view, game);
        move();
    }

    @Override
    public void move(){
        this.x = this.view.getWidth() / 6;
        
        if(speedY < 0){
            // The character is moving up
            speedY = speedY * 2 / 3 + getSpeedTimeDecrease() / 2;
        }else{
            // the character is moving down
            this.speedY += getSpeedTimeDecrease();
        }
        
        if(this.speedY > getMaxSpeed()){
            // speed limit
            this.speedY = getMaxSpeed();
        }
        
        super.move();
    }

    public void dead(){
        this.isDead = true;
        this.speedY = getMaxSpeed()/2;
    }
    

    public void onTap(){
        this.speedY = getTabSpeed();
        this.y += getPosTabIncrease();
    }
    

    protected float getMaxSpeed(){
        return view.getHeight() / 51.2f;
    }
    

    protected float getSpeedTimeDecrease(){
        return view.getHeight() / 320;
    }

    protected float getTabSpeed(){
        return - view.getHeight() / 16f;
    }

    protected int getPosTabIncrease(){
        return - view.getHeight() / 100;
    }
    
    public void revive(){
        this.isDead = false;
        this.row = 0;
    }
    
    public void upgradeBitmap(int points){
    }
    
    public boolean isDead(){
        return this.isDead;
    }
}
