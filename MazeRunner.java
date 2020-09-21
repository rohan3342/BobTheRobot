import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
// Lives Problem ***
// Reset Boost & Runner Problem ***
/**
 * Write a description of class MazeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeRunner extends Players 
{
    int mazeRunnerLives = 3;
    //Create Constructor Method
    public MazeRunner(int lives){
        getImage().scale(getImage().getWidth()/10, getImage().getHeight()/10);
        mazeRunnerLives = lives;
    }

    public MazeRunner(int lives, boolean w){
        getImage().scale(getImage().getWidth()/14, getImage().getHeight()/14);
        mazeRunnerLives = lives;
    }

    public MazeRunner(int lives, boolean w,boolean x){
        getImage().scale(getImage().getWidth()/30, getImage().getHeight()/30);
        mazeRunnerLives = lives;
    }

    public void act() 
    {   
        slideAround();
        collectBoost();
        maxSpeed();
        loseLife();
        mazeRunnerHit();
        youWin();
        youLose();

    }    

    public void mazeRunnerHit(){
        Movers SpeedObject = new Movers();
        if(hitEnemy()){
            if(this.getWorld().getClass() == Level1.class){
                SpeedObject.speed=1;
                setLocation(20,550);
                SpeedBoost SP1 = new SpeedBoost();
                getWorld().addObject(SP1,250,450);
                SpeedBoost SP2 = new SpeedBoost();
                getWorld().addObject(SP2,450,350);
                SpeedBoost SP3 = new SpeedBoost();
                getWorld().addObject(SP3,150,150);
                SpeedBoost SP4 = new SpeedBoost();
                getWorld().addObject(SP4,500,150);
                SpeedBoost SP5 = new SpeedBoost();
                getWorld().addObject(SP5,100,550);
            }
            if(this.getWorld().getClass() == Level2.class){
                SpeedObject.speed=1;
                setLocation(20,550);
                SpeedBoost SP1 = new SpeedBoost();
                getWorld().addObject(SP1,550,50);
                SpeedBoost SP2 = new SpeedBoost();
                getWorld().addObject(SP2,200,100);
                SpeedBoost SP3 = new SpeedBoost();
                getWorld().addObject(SP3,50,300);
                SpeedBoost SP4 = new SpeedBoost();
                getWorld().addObject(SP4,550,450);
            }
            if(this.getWorld().getClass() == Level3.class){
                SpeedObject.speed=1;
                setLocation(20,570);
                SpeedBoost SP1 = new SpeedBoost(true);
                getWorld().addObject(SP1,360,480);
                SpeedBoost SP2 = new SpeedBoost(true);
                getWorld().addObject(SP2,390,30);
                SpeedBoost SP3 = new SpeedBoost(true);
                getWorld().addObject(SP3,120,510);
                SpeedBoost SP4 = new SpeedBoost(true);
                getWorld().addObject(SP4,420,270);
            }
            if(this.getWorld().getClass() == Level4.class){
                SpeedObject.speed=1;
                setLocation(10,570);
                SpeedBoost SP1 = new SpeedBoost(true);
                getWorld().addObject(SP1,360,30);
                SpeedBoost SP2 = new SpeedBoost(true);
                getWorld().addObject(SP2,390,360);
                SpeedBoost SP3 = new SpeedBoost(true);
                getWorld().addObject(SP3,120,120);
                SpeedBoost SP4 = new SpeedBoost(true);
                getWorld().addObject(SP4,30,360);
                SpeedBoost SP5 = new SpeedBoost(true);
                getWorld().addObject(SP5,450,210);
            }
            if(this.getWorld().getClass() == Level5.class){
                SpeedObject.speed=1;
                setLocation(10,585);
            }

        }
    }

    public void loseLife(){
        if(hitEnemy()){
            //Limited Lives
            mazeRunnerLives--;
        }
    }

    public void youLose(){
        if(mazeRunnerLives == 0){
            getWorld().addObject(new YouLose(),getWorld().getWidth()/2, 
                getWorld().getHeight()/2);
            Greenfoot.stop();
            Greenfoot.setWorld(new Start());
            Greenfoot.start();
        }
    }
}
