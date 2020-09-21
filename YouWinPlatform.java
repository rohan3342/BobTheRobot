import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWinPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWinPlatform extends Actor
{
    public YouWinPlatform(){
     getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public YouWinPlatform(boolean w){
     getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4);
    }
    public YouWinPlatform(boolean w,boolean x){
     getImage().scale(getImage().getWidth()/6, getImage().getHeight()/7);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
