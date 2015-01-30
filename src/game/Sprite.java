package game;
import java.awt.Image;
/**
 *
 * @author Mark
 */
public class Sprite {
    private Animation a;
    private float x;
    private float y;
    private float vx;
    private float vy;
    
    //constructor
    public Sprite(Animation a){
        this.a=a;
    }
    
    //change position
    public void update(long timePassed){
        x+=vx*timePassed;
        y+=vy*timePassed;
        a.update(timePassed);
    }
    
    //get x position
    public float getX(){
        return x;
    }
    
    //get x position
    public float getY(){
        return y;
    }
    
    //setSprite x position
    public void setX(float x){
        this.x =x;
    }
    
    //setSprite y position
    public void setY(float x){
        this.y =y;
    }
    
    //get sprite width
    public int getWidth(){
        return a.getImage().getWidth(null);
    }
    
    //get sprite height
    public int getHeight(){
        return a.getImage().getHeight(null);
    }
    
    //get horizontal velocity
    public float getVelocityX(){
        return vx;
    }
    
    //get vertical velocity
    public float getVelocityY(){
        return vy;
    }
    
    //set horizontal velocity
    public void setVelocityX(float vx){
        this.vx = vx;
    }
    
    //set vertical velocity
    public void setVelocityY(float vy){
        this.vy = vy;
    }
    
    //get sprites image
    public Image getImage(){
        return a.getImage();
    }
}