import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Movers 
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public void wrapAtEdge(){
        int x = getX() , y = getY();
        int worldWidth = getWorld().getWidth() - 1; 
        int worldHeight = getWorld().getHeight() - 1;
        
        
        if(x >= worldWidth){
            setRotation(180);
        }
        if(x <= 0){
            setRotation(360);
        }
        if(y >= worldHeight){
            setRotation(90);
        }
        if(y <= 0){
            setRotation(270);
        } 
    }
}
