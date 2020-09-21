import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Movers extends Actor{
    static int speed = 1;
    public void act(){
        maxSpeed();
        moveAndTurn();
    }    
    public void maxSpeed(){
        if(speed>=5){
            speed = 5;
        }
    }
    public void moveAndTurn(){
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(1);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(1);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(2);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(2);
        }
    }

    public void slideAround(){
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d")){
            setLocation(x + speed , y);
            if(hitWalls()){
                setLocation(x - speed , y);
            }
        }
        if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a")){
            setLocation(x - speed , y);
            if(hitWalls()){
                setLocation(x + speed , y);
            }
        }
        if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w")){
            setLocation(x , y - speed);
            if(hitWalls()){
                setLocation(x , y + speed);
            }
        }
        if(Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s")){
            setLocation(x, y + speed);
            if(hitWalls()){
                setLocation(x , y - speed);
            }
        } 
    }

    public boolean hitWalls(){
        if((isTouching(MazeBlock.class))||(isTouching(MazeBlock1.class))||(isTouching(MazeBlockSmallBlack.class))||
            (isTouching(MazeBlockSmall.class))||(isTouching(MazeBlockSmallWhite.class))){
            return true;
        }
        else{
            return false;
        }
    }
    public void collectBoost(){
        if(isTouching(SpeedBoost.class)){
            speed++;
            removeTouching(SpeedBoost.class);
        }
    }
    public boolean hitEnemy(){
        if(isTouching(Enemy.class)){
            //speed--;
            return true;
        }
        else {
            //--;
            return false;
        }
    }
}
