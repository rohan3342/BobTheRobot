import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Movers
{

    static int win = 0;
    public void act()     {
          }
    public void youWin(){
        Movers SpeedObject = new Movers();
        if(isTouching(YouWinPlatform.class)){
            Greenfoot.stop();
            getWorld().addObject(new YouWinScreen(),getWorld().getWidth()/2, 
                getWorld().getHeight()/2);
            Greenfoot.start();    
            if(Greenfoot.isKeyDown("space")||Greenfoot.isKeyDown("enter")){ 
                // Change to youwinplatform
                getWorld().addObject(new Loading(),300,300);
                win++;
                if(win==1){
                Greenfoot.delay(10);
                SpeedObject.speed=1;
                Greenfoot.setWorld(new Level2());
                }
                else if(win==2){
                Greenfoot.delay(10);
                SpeedObject.speed=1;
                Greenfoot.setWorld(new Level3());
                }else if(win==3){
                Greenfoot.delay(10);
                SpeedObject.speed=1;
                Greenfoot.setWorld(new Level4());
                }
                else if(win==4){
                Greenfoot.delay(10);
                SpeedObject.speed=1;
                Greenfoot.setWorld(new Level5());
                }
                else if(win==5){
                win=0;
                Greenfoot.delay(10);
                SpeedObject.speed=1;
                Greenfoot.setWorld(new Start());
                }
            }   
        }
    }
}

