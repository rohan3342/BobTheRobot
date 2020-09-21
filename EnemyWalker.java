import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyWalker extends Enemy
{
    boolean upDown;
    int speed = 1;
    public EnemyWalker(boolean upAndDown){
        getImage().scale(getImage().getWidth(), getImage().getHeight());
        upDown = upAndDown;

    }
    public EnemyWalker(boolean upAndDown,boolean w){
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
        upDown = upAndDown;

    }
    public EnemyWalker(boolean upAndDown,boolean w,boolean x){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
        upDown = upAndDown;

    }

    public void act() 
    {
        moveAround();  
        enemyHitWalls();
        
    }    
    public void enemyHitWalls(){
        if(hitWalls() || isAtEdge()){
            speed = - speed;
        }
    }

    public void moveAround(){
        int x = getX(), y = getY();
        if(upDown){
            setLocation(x,y + speed);
        }
        else if(!upDown){
            setLocation(x + speed, y);
        }
    }
}
