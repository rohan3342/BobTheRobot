import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyFlyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyFlyer extends Enemy
{
    /**
     * Act - do whatever the EnemyFlyer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyFlyer(){
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);

    }
    
    public EnemyFlyer(boolean w){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    
    public EnemyFlyer(boolean w,boolean x){
        getImage().scale(getImage().getWidth()/6, getImage().getHeight()/6);
    }
    
    
    public void act() 
    {
       move(1);
       wrapAtEdge();// Add your action code here.
    }    
}
