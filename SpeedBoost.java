import greenfoot.*; 
public class SpeedBoost extends Actor{
    public SpeedBoost(){
        getImage().scale(getImage().getWidth()/12, getImage().getHeight()/12);
    }
    public SpeedBoost(boolean w){
        getImage().scale(getImage().getWidth()/16, getImage().getHeight()/16);
    }
    public SpeedBoost(boolean w,boolean x){
        getImage().scale(getImage().getWidth()/25, getImage().getHeight()/25);
    }
    public void act(){
    }    
}
