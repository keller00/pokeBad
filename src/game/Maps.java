package game;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
/**
 *
 * @author Mark
 * Images has to be resized to 300% and then 130%
 */
public class Maps {
    
    public static int map[][];
    public static Image mI, world=new ImageIcon("images\\worldmap.jpg").getImage(), kitchen=new ImageIcon("images\\kitchen.png").getImage(), room=new ImageIcon("images\\room.png").getImage();;
    public static String m;
    public static int pX, pY, mcode;
    private Random r=new Random();
    public void loadMap(int in){
        if(in==1){
            room();
        }
        if(in==2){
            kitchen();
        }
        if(in==3){
            world();
        }
    }
    
    public static void room(){
        mcode=1;
        m="room";
        map=new int[12][8];
        mI=room;
        for(int X=0; X<11; X++){
            for(int Y=0; Y<7; Y++){
                map[X][Y]=1;
            }
        }
        //trim
        for(int X=0; X<11; X++){
            map[X][0]=0;
            map[X][7]=0;
        }
        for(int Y=0; Y<8; Y++){
            map[0][Y]=0;
            map[11][Y]=0;
        }
        //objects
        map[1][1]=2;
        map[2][1]=0;
        map[2][2]=0;
        map[5][1]=0;
        map[6][1]=0;
        map[7][2]=0;
        map[8][2]=0;
        map[8][2]=0;
        map[5][1]=0;
        map[4][4]=0;
        map[5][4]=0;
        map[4][5]=0;
        map[5][5]=0;
    }
    
    public static void world(){
        mcode=3;
        m="world";
        map=new int[81][102];
        mI=world;
        //base
        for (int intC=0; intC<81; intC++){
            for (int intCo=0; intCo<101; intCo++){
                map[intC][intCo]=1;
            }
        }
        //trim
        for (int intC=0; intC<81; intC++){
            map[intC][0]=0;
            map[intC][101]=0;
        }
        for (int intC=0; intC<101; intC++){
            map[0][intC]=0;
            map[80][intC]=0;
        }
        //Lake 1
        for(int X=45;X<49; X++){
            for (int Y=85; Y<101; Y++){
                map[X][Y]=0;
            }
        }
        //stuff
        for(int Y=84; Y<90; Y++){
            map[49][Y]=0;
        }
        for(int Y=84; Y<90; Y++){
            map[52][Y]=0;
        }
        //lake 2
        for(int X=53; X<67; X++){
            for(int Y=85;Y<89; Y++){
                map[X][Y]=0;
            }
        }
        //lake 3
        for(int X=63;X<67;X++){
            for(int Y=79;Y<84;Y++){
                map[X][Y]=0;
            }
        }
        //lake 4
        for(int X=67;X<80;X++){
            for(int Y=79;Y<81;Y++){
                map[X][Y]=0;
            }
        }
        //lake 5
        for(int X=73;X<80;X++){
            for(int Y=95;Y<100;Y++){
                map[X][Y]=0;
            }
        }
        //tree
        for(int X=67;X<69;X++){
            for(int Y=94;Y<96;Y++){
                map[X][Y]=0;
            }
        }
        //house 2
        for(int X=70;X<77;X++){
            for(int Y=84;Y<88;Y++){
                map[X][Y]=0;
            }
        }
        //fence
        for(int X=68;X<80;X++){
                map[X][90]=0;
        }
        //house 1
        for(int X=56;X<61;X++){
            for(int Y=91;Y<96;Y++){
                map[X][Y]=0;
            }
        }
        map[57][95]=1;
        map[55][95]=0;
        //block
        map[50][84]=0;
        map[51][84]=0;
        //grass
        map[50][85]=2;
        map[51][85]=2;
        map[50][86]=2;
        map[51][86]=2;
        map[50][87]=2;
        map[51][87]=2;
        map[51][88]=2;
    }
    
    public static void houseWorld(){
        Main.bgX=-3335;
        Main.bgY=-6930;
        pX=57;pY=96;
        world();
    }
    
    public static void kitchen(){
        mcode=2;
        gVariables.kCounter++;
        if(gVariables.kCounter==1){Main.sDialogue(Dialogue.kitchen1);}
        m="kitchen";
        map=new int[18][10];
        mI=kitchen;
        //base
        for (int X=0; X<17; X++){
            for(int Y=0; Y<9; Y++){
                map[X][Y]=1;
            }
        }
        //trim
        for(int X=0; X<18; X++){
            map[X][0]=0;
            map[X][8]=0;
        }
        for(int Y=0; Y<9; Y++){
            map[0][Y]=0;
            map[17][Y]=0;
        }
        //objects
        map[7][3]=0;
        map[8][3]=0;
        map[9][3]=0;
        map[10][3]=0;
        map[7][4]=0;
        map[8][4]=0;
        map[9][4]=0;
        map[10][4]=0;
        map[15][2]=0;
        map[16][2]=0;
        
    }
    
    public static void newGame(){
        Main.scene="move";
        Main.bgX=548;
        Main.bgY=78;
        pX=2; pY=3;
        gVariables.kCounter=0;
        room();
    }
    

    public void Grass(){
        int atk=0;
        int chance=r.nextInt(100);
        if(chance<40){
        atk=r.nextInt(3);
        if(atk==0){gVariables.opponent=1;}
        else if(atk==1){gVariables.opponent=4;}
        else if(atk==2){gVariables.opponent=7;}
        gVariables.oplvl=3;
        RndGenPokemon.RndGenPokemon();
        Main.battleScreen();
        }
    }
    
    public synchronized void checkAction(){
        if(m=="room"){
            if(pX==8 && pY==1){
                pX=14;pY=1;
                kitchen();
                Main.bgX=-150;
                Main.bgY=243;
            }
        }
        else if(m=="kitchen"){
            if(pX==15 && pY==1){
                pX=9;pY=1;
                room();
                Main.bgX=107;
                Main.bgY=204;
            }
            if((pX== 9 && pY==7) || (pX== 10 && pY==7)){
                houseWorld();
            }
        }
        else if(m=="world"){
            if(pX==57 && pY==95){
                kitchen();
                Main.bgX=165;
                Main.bgY=-135;
                pX=9;pY=7;
            }
            if(map[pX][pY]==2){
                Grass();
            }
        }
    }
}
