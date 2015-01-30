package game;
import java.awt.Image;
import java.util.ArrayList;
/**
 *
 * @author Mark
 */
public class Animation {

    private ArrayList scenes;
    private int sceneIndex;
    private long movieTime; //actual time of animation
    private long totalTime; //total time of animation
    
    //CONSTRUCTOR
    public Animation(){
        scenes= new ArrayList();
        totalTime=0;
        start();
    }
    
    public synchronized void addScene(Image i, long t){
        totalTime += t;
        scenes.add(new Animation.OneScene(i, totalTime));
    }
    
    //Start animation from begining
    public synchronized void start(){
        movieTime=0;
        sceneIndex=0;
    }
    
    //Change scenes
    public synchronized void update(long timePassed){
        if(scenes.size()>1){
            movieTime+= timePassed;
            if(movieTime>= totalTime){
                movieTime =0;
                sceneIndex=0;
            }
            while(movieTime > getScene(sceneIndex).endTime){
                sceneIndex++;
            }
        }
    }
    
    //get animations current scene(aka image)
    public synchronized Image getImage(){
        if(scenes.size()==0){
            return null;
        }
        else{
            return getScene(sceneIndex).pic;
        }
    }
    
    //get scene
    private Animation.OneScene getScene(int x){
        return (Animation.OneScene)scenes.get(x);
    }
    
    //private inner class
    
    private class OneScene{
        Image pic;
        long endTime;
        
        public OneScene(Image pic, long endTime){
            this.pic=pic;
            this.endTime=endTime;
        }
    }
}