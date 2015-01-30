package game;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import javax.swing.ImageIcon;
/**
 *
 * @author Mark
 */
public class Main extends Core implements KeyListener{
    public static void main(String[] args){
        new Main().run();
    }
    Random r=new Random();
    
    //inits also calls init from superclass
    public void init(){
        super.init();
        Window w=s.getFullScreenWindow();
        w.setCursor( w.getToolkit().createCustomCursor( new BufferedImage( 1, 1, BufferedImage.TYPE_INT_ARGB ), new Point(), null ) );
        w.setFocusTraversalKeysEnabled(false);
        w.addKeyListener(this);
        loadImages();
        mainMenu();
    }
    
    //show main menu
    public void mainMenu(){
        FileWriter out;
	BufferedWriter writeFile;
	File Save = new File("Save.txt");
        if(Save.exists()){
            save=true;
        }
        menuS=1;
        scene="mMenu";
    }
    
    //key pressed
    public void keyPressed(KeyEvent e){
        int keyCode=0;
        keyCode=e.getKeyCode();
        if(scene=="mMenu"){
            if(creds==true && (keyCode==KeyEvent.VK_ESCAPE || keyCode==KeyEvent.VK_Y || keyCode==KeyEvent.VK_X || keyCode==KeyEvent.VK_ENTER)){creds=false;}
            else{
            if(keyCode==KeyEvent.VK_UP && menuS!=1){
                menuS--;
            }
            else if(keyCode==KeyEvent.VK_DOWN && menuS!=3){
                menuS++;
            }
            else if((keyCode==KeyEvent.VK_X || keyCode==KeyEvent.VK_ENTER) && menuS==1){
                SaveLoad.load();
            }
            else if((keyCode==KeyEvent.VK_X || keyCode==KeyEvent.VK_ENTER) && menuS==2){
                Maps.newGame();
            }
            else if((keyCode==KeyEvent.VK_X || keyCode==KeyEvent.VK_ENTER) && menuS==3){
                creds=true;
            }
            else if(keyCode==KeyEvent.VK_ESCAPE){
            stop();
            }
            }
        }
        else if(bDial==true){
            if(keyCode==KeyEvent.VK_X || keyCode==KeyEvent.VK_Z){
                if(out.equals(Dialogue.kitchen1)){
                sDialogue(Dialogue.kitchen2);
                }
                else if(out.equals(Dialogue.kitchen2)){
                sDialogue(Dialogue.kitchen3);
                }
                else{
                    bDial=false;
                }
            }
        }
        //Battle screen 1 movement
        else if(scene=="battle"){
            //Battle Screen 1 movement
            if(bSScreen==1){
                if(bSSelect==1 && keyCode==KeyEvent.VK_RIGHT){
                    bSSelect=2;
                }
                else if(bSSelect==2 && keyCode==KeyEvent.VK_LEFT){
                    bSSelect=1;
                }
                //Battle screen selected
                if(bSSelect==1 && keyCode==KeyEvent.VK_X){
                    movesS=1;
                    bSScreen=2;
                }
                else if(bSSelect==2 && keyCode==KeyEvent.VK_X){
                    scene="move";
                }
                //moves
            }else if(bSScreen==2){
                //moves
                if(movesS==1 && keyCode==KeyEvent.VK_RIGHT){
                    movesS=2;
                }
                else if(movesS==2 && keyCode==KeyEvent.VK_LEFT){
                    movesS=1;
                }
                else if(movesS==2 && keyCode==KeyEvent.VK_RIGHT){
                    movesS=3;
                }
                else if(movesS==3 && keyCode==KeyEvent.VK_LEFT){
                    movesS=2;
                }
                else if(movesS==3 && keyCode==KeyEvent.VK_RIGHT){
                    movesS=4;
                }
                else if(movesS==4 && keyCode==KeyEvent.VK_LEFT){
                    movesS=3;
                }
                //selected
                if(movesS==1 && keyCode==KeyEvent.VK_X){
                    int rnd=(int)((4-1+1)*Math.random()+1);
                    BattleSim.calculate_dmg(PartyPokemon.partypkmn[1][movesS+10], rnd);
                    bSScreen=1;
                }
                else if(movesS==2 && keyCode==KeyEvent.VK_X){
                    int rnd=(int)((4-1+1)*Math.random()+1);
                    BattleSim.calculate_dmg(PartyPokemon.partypkmn[1][movesS+10], rnd);
                    bSScreen=1;
                }
                if(movesS==3 && keyCode==KeyEvent.VK_X){
                    int rnd=(int)((4-1+1)*Math.random()+1);
                    BattleSim.calculate_dmg(PartyPokemon.partypkmn[1][movesS+10], rnd);
                    bSScreen=1;
                }
                else if(movesS==4 && keyCode==KeyEvent.VK_X){
                    int rnd=(int)((4-1+1)*Math.random()+1);
                    BattleSim.calculate_dmg(PartyPokemon.partypkmn[1][movesS+10], rnd);
                    bSScreen=1;
                }
            }
        }
        else if(igm==true){
            //move
            if(keyCode==KeyEvent.VK_ESCAPE){
                igm=false;
            }
            else if(igms==1 && keyCode==KeyEvent.VK_DOWN){
                igms=2;
            }
            else if(igms==2 && keyCode==KeyEvent.VK_DOWN){
                igms=3;
            }
            else if(igms==2 && keyCode==KeyEvent.VK_UP){
                igms=1;
            }
            else if(igms==3 && keyCode==KeyEvent.VK_UP){
                igms=2;
            }
            //selected
            if(igms==1 && keyCode==KeyEvent.VK_X){
                SaveLoad.save();
            }
            else if(igms==2 && keyCode==KeyEvent.VK_X){
                scene="mMenu";
                igms=1;
                igm=false;
            }
            else if(igms==3 && keyCode==KeyEvent.VK_X){
                igm=false;
            }
            
        }
        else if(scene=="move" && bDial==false){
            if(keyCode==KeyEvent.VK_ESCAPE){
                igm=true;
                igms=1;
            }
            else if(igm==false && keyCode==KeyEvent.VK_X && scene=="move" && Maps.m=="room" && Maps.pX==6 && Maps.pY==2 && pS=="u1"){sDialogue(Dialogue.compDial);}
            else if(igm==false && keyCode==KeyEvent.VK_UP && kR==true){  //Up arrow
                if(pS=="u1" && kR==true && kR2==true && Maps.map[Maps.pX][Maps.pY-1]!=0){
                kR=false;
                kR2=false;
                    Maps.pY-=1;
                    pS="u2";
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    pS="u3";
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    pS="u2";
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY+=3;
                    pS="u1";
                    try{Thread.sleep(10);}catch(Exception ex){}
                    kR=true;
                    Maps.checkAction();
                }
                else{
                    pS="u1";
                    kR=true;
                }
            }
            else if(igm==false && keyCode==KeyEvent.VK_DOWN && kR==true){  //Down arrow
            if(pS=="d1" && kR==true && kR2==true && Maps.map[Maps.pX][Maps.pY+1]!=0){
                kR=false;
                kR2=false;
                    Maps.pY+=1;
                    pS="d2";
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    pS="d3";
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    pS="d2";
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgY-=3;
                    pS="d1";
                    try{Thread.sleep(10);}catch(Exception ex){}
                    kR=true;
                    Maps.checkAction();
                }
                else{
                    pS="d1";
                    kR=true;
                }
        }
            else if(igm==false && keyCode==KeyEvent.VK_LEFT && kR==true){  //Left arrow
            if(pS=="l1" && kR==true && kR2==true && Maps.map[Maps.pX-1][Maps.pY]!=0){
                kR=false;
                kR2=false;
                    Maps.pX-=1;
                    pS="l2";
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    pS="l3";
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    pS="l2";
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){} 
                   bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX+=3;
                    pS="l1";
                    try{Thread.sleep(10);}catch(Exception ex){}
                    kR=true;
                    Maps.checkAction();
                }
                else{
                    pS="l1";
                    kR=true;
                }
        }
            else if(igm==false && keyCode==KeyEvent.VK_RIGHT && kR==true){  //Right arrow
            if(pS=="r1" && kR==true && kR2==true && Maps.map[Maps.pX+1][Maps.pY]!=0){
                kR=false;
                kR2=false;
                    Maps.pX+=1;
                    pS="r2";
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    pS="r3";
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    pS="r2";
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    try{Thread.sleep(41);}catch(Exception ex){}
                    bgX-=3;
                    pS="r1";
                    try{Thread.sleep(10);}catch(Exception ex){}
                    kR=true;
                    Maps.checkAction();
                }
                else{
                    pS="r1";
                    kR=true;
                }
        }
        }
        else{
            e.consume();
        }
    }
    
    public static void battleScreen(){
        scene="battle";
        bSScreen=1;
        bSSelect=1;
        BattleSim.generateActiveStats();
    }
    
    public static void sDialogue(String in){
        bDial=true;
        out="";
        out=in;
    }
    
    //key released
    public void keyReleased(KeyEvent e){
        int keyCode=e.getKeyCode();
        kR2=true;
        e.consume();
    }
    
    //last method from interface
    public void keyTyped(KeyEvent e){
        e.consume();
    }
    
    private Image down1, down2, down3, up1, up2, up3, left1, left2, left3, right1, right2, right3, bg, mMenuBG, blank, menu1, menu2, menu3, dial, battlebg, selectP, battlebgE, miss, igm1, igm2,igm3,sfound, credits, blankm;
    
    //loads images
    public void loadImages(){
        blankm=new ImageIcon("images\\blankm.png").getImage();
        credits=new ImageIcon("images\\creds.png").getImage();
        sfound=new ImageIcon("images\\found.png").getImage();
        igm1=new ImageIcon("images\\igm1.png").getImage();
        igm2=new ImageIcon("images\\igm2.png").getImage();
        igm3=new ImageIcon("images\\igm3.png").getImage();
        miss=new ImageIcon("images\\miss.png").getImage();
        battlebgE=new ImageIcon("images\\battleE.png").getImage();
        selectP=new ImageIcon("images\\select.png").getImage();
        battlebg=new ImageIcon("images\\battle.png").getImage();
        dial=new ImageIcon("images\\dialogue.png").getImage();
        menu1=new ImageIcon("images\\menu.jpg").getImage();
        menu2=new ImageIcon("images\\menu2.jpg").getImage();
        menu3=new ImageIcon("images\\menu3.jpg").getImage();
        blank=new ImageIcon("images\\blank.png").getImage();
        mMenuBG=new ImageIcon("images\\BGpokeBad.png").getImage();
        down1=new ImageIcon("images\\down1.png").getImage();
        down2=new ImageIcon("images\\down2.png").getImage();
        down3=new ImageIcon("images\\down3.png").getImage();
        up1=new ImageIcon("images\\up1.png").getImage();
        up2=new ImageIcon("images\\up2.png").getImage();
        up3= new ImageIcon("images\\up3.png").getImage();
        left1=new ImageIcon("images\\left1.png").getImage();
        left2=new ImageIcon("images\\left2.png").getImage();
        left3=new ImageIcon("images\\left3.png").getImage();
        right1=new ImageIcon("images\\right1.png").getImage();
        right2=new ImageIcon("images\\right2.png").getImage();
        right3=new ImageIcon("images\\right3.png").getImage();
    }
    
    public static boolean kR=true, kR2=true, bDial, igm=false, save=false, creds=false;
    public static String pS="d1", bS="", scene;
    public static int bgX, bgY, bSSelect, bSScreen, upc, movesS, igms;
    private int menuS;
    Maps Maps=new Maps();
    private static String out;
    
    public synchronized void update(){
    }
    
    
    //draw
    public synchronized void draw(Graphics2D g){
        Window w= s.getFullScreenWindow();
        g.drawImage(blank, 0, 0, null);
        if(scene=="mMenu"){
            if(creds==true){g.drawImage(blankm, 0, 0, null); g.drawImage(credits, s.getWidth()/2-(credits.getWidth(null)/2), s.getHeight()/2-(credits.getHeight(null)/2), null);}
            else{
            if(menuS==1){g.drawImage(menu1, 0, 0, null);}
            else if(menuS==2){g.drawImage(menu2, 0, 0, null);}
            else if(menuS==3){g.drawImage(menu3, 0, 0, null);}
            if(save==true){g.drawImage(sfound, 663, 220,null);}}
        }
        if(scene=="move"){
            g.drawImage(Maps.mI, bgX, bgY, null);
            if(pS=="d1"){g.drawImage(down1, s.getWidth()/2 - down1.getWidth(w)/2, s.getHeight()/2 - down1.getHeight(w)/2,null);}
            else if(pS=="d2"){g.drawImage(down2, s.getWidth()/2 - down2.getWidth(w)/2, s.getHeight()/2 - down2.getHeight(w)/2,null);}
            else if(pS=="d3"){g.drawImage(down3, s.getWidth()/2 - down3.getWidth(w)/2, s.getHeight()/2 - down3.getHeight(w)/2,null);}
            else if(pS=="u1"){g.drawImage(up1, s.getWidth()/2 - up1.getWidth(w)/2, s.getHeight()/2 - up1.getHeight(w)/2,null);}
            else if(pS=="u2"){g.drawImage(up2, s.getWidth()/2 - up2.getWidth(w)/2, s.getHeight()/2 - up2.getHeight(w)/2,null);}
            else if(pS=="u3"){g.drawImage(up3, s.getWidth()/2 - up3.getWidth(w)/2, s.getHeight()/2 - up3.getHeight(w)/2,null);}
            else if(pS=="l1"){g.drawImage(left1, s.getWidth()/2 - left1.getWidth(w)/2, s.getHeight()/2 - left1.getHeight(w)/2,null);}
            else if(pS=="l2"){g.drawImage(left2, s.getWidth()/2 - left2.getWidth(w)/2, s.getHeight()/2 - left2.getHeight(w)/2,null);}
            else if(pS=="l3"){g.drawImage(left3, s.getWidth()/2 - left3.getWidth(w)/2, s.getHeight()/2 - left3.getHeight(w)/2,null);}
            else if(pS=="r1"){g.drawImage(right1, s.getWidth()/2 - right1.getWidth(w)/2, s.getHeight()/2 - right1.getHeight(w)/2,null);}
            else if(pS=="r2"){g.drawImage(right2, s.getWidth()/2 - right2.getWidth(w)/2, s.getHeight()/2 - right2.getHeight(w)/2,null);}
            else if(pS=="r3"){g.drawImage(right3, s.getWidth()/2 - right3.getWidth(w)/2, s.getHeight()/2 - right3.getHeight(w)/2,null);}
            if(igm==true && igms==1){g.drawImage(igm1, s.getWidth()/2 - igm1.getWidth(w)/2, s.getHeight()/2 - igm1.getHeight(w)/2,null);}
            else if(igm==true && igms==2){g.drawImage(igm2, s.getWidth()/2 - igm2.getWidth(w)/2, s.getHeight()/2 - igm2.getHeight(w)/2,null);}
            else if(igm==true && igms==3){g.drawImage(igm3, s.getWidth()/2 - igm3.getWidth(w)/2, s.getHeight()/2 - igm3.getHeight(w)/2,null);}
        }
        else if(scene=="battle"){
            if(bSScreen==1){g.drawImage(battlebg,0,468,null);}
            if(bSScreen==2){g.drawImage(battlebgE, 0, 468, null);}
            g.drawImage(PokeImages.pmb[PartyPokemon.partypkmn[1][1]], 0, s.getHeight()-300-PokeImages.pmb[PartyPokemon.partypkmn[1][1]].getHeight(null), null);
            g.drawImage(PokeImages.pmf[gVariables.opponent], s.getWidth()-PokeImages.pmf[gVariables.opponent].getWidth(null), 0, null);
            g.drawString("Opponent's hp: "+String.valueOf(Active.activeOppStats[0])+" Last dmg: "+BattleSim.oppdmg, 100,100);
            if(BattleSim.oppisHit==false){g.drawImage(miss,100, 150,null);}
            g.drawString("Player's hp: "+String.valueOf(Active.activePkmnStats[0])+" Last dmg: "+BattleSim.dmg,1000, 268);
            if(BattleSim.isHit==false){g.drawImage(miss,1000, 318,null);}
            if(bSScreen==1){
                if(bSSelect==1){
                    g.drawImage(selectP,125,583,null);
                }
                else if(bSSelect==2){
                    g.drawImage(selectP,958,583,null);
                }
            }
        }
        if(bDial==true){g.drawImage(dial,0,568,null);g.drawString(out, 50, 618);}
    }
    }