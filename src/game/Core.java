package game;
import java.awt.*;
import javax.swing.*;

public abstract class Core{
    
    private static DisplayMode modes[]={
        new DisplayMode(1366,768,32,0),
        new DisplayMode(1280,720,32,0),
    };
    private boolean running;
    protected ScreenManager s;
    protected Animation a;
    protected Sprite sprite;
    
    
    //stop method
    public void stop(){
        running=false;
    }
    
    //call init and gameloop
    public void run(){
        PokeImages.loadImages();
        PokemonINFO.activate();
        Moves.activate();
        PartyPokemon.activate();
        try{
            init();
            gameLoop();
        }finally{
            s.restoreScreen();
        }
    }
    
    //set to full screen
    public void init(){
        s=new ScreenManager();
        DisplayMode dm=s.findFirstCompatibleMode(modes);
        s.setFullScreen(dm);
        
        Window w=s.getFullScreenWindow();
        w.setFont(new Font("Arial",Font.PLAIN, 20));
        w.setBackground(Color.BLACK);
        w.setForeground(Color.WHITE);
        running=true;
    }
    
    //main gameLoop
    public void gameLoop(){
        long startTime=System.currentTimeMillis();
        long cumTime=startTime;
        
        while(running){
            /*long timePassed=System.currentTimeMillis()-cumTime;
            cumTime+=timePassed;*/
            update();
            Graphics2D g=s.getGraphics();
            draw(g);
            g.dispose();
            s.update();
            try{
                Thread.sleep(20);
            }catch(Exception ex){}
       }
    }
    //update animation
    public abstract void update();
    
    //draws to the screen
    public abstract void draw(Graphics2D g);
}