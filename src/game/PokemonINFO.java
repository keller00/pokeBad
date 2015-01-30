package game;
public class PokemonINFO {
    public static int[][] pokemonStats = new int[649][10];
    /* POKEMON TYPE VALUES ([x][6] and [x][7]):
     * 0 = No secondary type
     * 1 = Normal
     * 2 = Fire
     * 3 = Water
     * 4 = Electric
     * 5 = Grass
     * 6 = Ice
     * 7 = Fighting
     * 8 = Poison
     * 9 = Ground
     * 10 = Flying
     * 11 = Psychic
     * 12 = Bug
     * 13 = Rock
     * 14 = Ghost
     * 15 = Dragon
     * 16 = Dark
     * 17 = Steel
     */
    /** pokemonStats matrix info:
     ** [x][0] = Base HP
     ** [x][1] = Base Attack
     ** [x][2] = Base Special Attack
     ** [x][3] = Base Defense
     ** [x][4] = Base Special Defense
     ** [x][5] = Base Speed
     ** [x][6] = Primary Type
     ** [x][7] = Secondary Type
     ** [x][8] = Evolution Level (0 = Fully Evolved)
     ** [x][9] = EXP Value
     ** [ROW][x]
     ** ROW IS EQUAL TO POKEMON ID (1-649)
     **/
    public static void activate(){
    	int c = 1;
    	
    	//1
    	pokemonStats[c][0] = 45;//Hp
    	pokemonStats[c][1] = 49;//Attk
    	pokemonStats[c][2] = 65;//Sp Attk
    	pokemonStats[c][3] = 49;//Def
    	pokemonStats[c][4] = 65;//Sp Def
    	pokemonStats[c][5] = 45;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32; //Evo Stage
    	pokemonStats[c][9] = 0; //Exp
    	c++;
    	
    	//2
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 62;//Atk
    	pokemonStats[c][2] = 80;//Sp Atk
    	pokemonStats[c][3] = 63;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 60;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 8;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//3
    	pokemonStats[c][0] = 80;//Hp
    	pokemonStats[c][1] = 82;//Atk
    	pokemonStats[c][2] = 100;//Sp Atk
    	pokemonStats[c][3] = 83;//Def
    	pokemonStats[c][4] = 100;//Sp Def
    	pokemonStats[c][5] = 80;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 8;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//4
    	pokemonStats[c][0] = 39;//Hp
    	pokemonStats[c][1] = 52;//Atk
    	pokemonStats[c][2] = 60;//Sp Atk
    	pokemonStats[c][3] = 43;//Def
    	pokemonStats[c][4] = 65;//Sp Def
    	pokemonStats[c][5] = 80;//Speed
    	pokemonStats[c][6] = 2;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//5
    	pokemonStats[c][0] = 58;//Hp
    	pokemonStats[c][1] = 64;//Atk
    	pokemonStats[c][2] = 80;//Sp Atk
    	pokemonStats[c][3] = 58;//Def
    	pokemonStats[c][4] = 50;//Sp Def
    	pokemonStats[c][5] = 80;//Speed
    	pokemonStats[c][6] = 2;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//6
    	pokemonStats[c][0] = 78;//Hp
    	pokemonStats[c][1] = 84;//Atk
    	pokemonStats[c][2] = 109;//Sp Atk
    	pokemonStats[c][3] = 78;//Def
    	pokemonStats[c][4] = 85;//Sp Def
    	pokemonStats[c][5] = 100;//Speed
    	pokemonStats[c][6] = 2;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//7
    	pokemonStats[c][0] = 44;//Hp
    	pokemonStats[c][1] = 48;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 65;//Def
    	pokemonStats[c][4] = 64;//Sp Def
    	pokemonStats[c][5] = 43;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//8
    	pokemonStats[c][0] = 59;//Hp
    	pokemonStats[c][1] = 63;//Atk
    	pokemonStats[c][2] = 65;//Sp Atk
    	pokemonStats[c][3] = 80;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 58;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//9
    	pokemonStats[c][0] = 79;//Hp
    	pokemonStats[c][1] = 83;//Atk
    	pokemonStats[c][2] = 85;//Sp Atk
    	pokemonStats[c][3] = 100;//Def
    	pokemonStats[c][4] = 105;//Sp Def
    	pokemonStats[c][5] = 78;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    
    	//10
    	pokemonStats[c][0] = 45;//Hp
    	pokemonStats[c][1] = 30;//Atk
    	pokemonStats[c][2] = 20;//Sp Atk
    	pokemonStats[c][3] = 35;//Def
    	pokemonStats[c][4] = 20;//Sp Def
    	pokemonStats[c][5] = 45;//Speed
    	pokemonStats[c][6] = 12;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//11
    	pokemonStats[c][0] = 50;//Hp
    	pokemonStats[c][1] = 20;//Atk
    	pokemonStats[c][2] = 25;//Sp Atk
    	pokemonStats[c][3] = 55;//Def
    	pokemonStats[c][4] = 25;//Sp Def
    	pokemonStats[c][5] = 30;//Speed
    	pokemonStats[c][6] = 12;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//12
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 45;//Atk
    	pokemonStats[c][2] = 80;//Sp Atk
    	pokemonStats[c][3] = 50;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 70;//Speed
    	pokemonStats[c][6] = 12;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//13
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 35;//Atk
    	pokemonStats[c][2] = 20;//Sp Atk
    	pokemonStats[c][3] = 30;//Def
    	pokemonStats[c][4] = 20;//Sp Def
    	pokemonStats[c][5] = 50;//Speed
    	pokemonStats[c][6] = 12;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	//14
    	pokemonStats[c][0] = 45;//Hp
    	pokemonStats[c][1] = 25;//Atk
    	pokemonStats[c][2] = 25;//Sp Atk
    	pokemonStats[c][3] = 50;//Def
    	pokemonStats[c][4] = 25;//Sp Def
    	pokemonStats[c][5] = 35;//Speed
    	pokemonStats[c][6] = 12;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//15
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 80;//Atk
    	pokemonStats[c][2] = 45;//Sp Atk
    	pokemonStats[c][3] = 40;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 75;//Speed
    	pokemonStats[c][6] = 12;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//16
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 45;//Atk
    	pokemonStats[c][2] = 35;//Sp Atk
    	pokemonStats[c][3] = 40;//Def
    	pokemonStats[c][4] = 35;//Sp Def
    	pokemonStats[c][5] = 56;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//17
    	pokemonStats[c][0] = 63;//Hp
    	pokemonStats[c][1] = 60;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 55;//Def
    	pokemonStats[c][4] = 50;//Sp Def
    	pokemonStats[c][5] = 71;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//18
    	pokemonStats[c][0] = 83;//Hp
    	pokemonStats[c][1] = 80;//Atk
    	pokemonStats[c][2] = 70;//Sp Atk
    	pokemonStats[c][3] = 75;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 91;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//19
    	pokemonStats[c][0] = 30;//Hp
    	pokemonStats[c][1] = 56;//Atk
    	pokemonStats[c][2] = 70;//Sp Atk
    	pokemonStats[c][3] = 35;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 72;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//20
    	pokemonStats[c][0] = 55;//Hp
    	pokemonStats[c][1] = 81;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 60;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 97;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//21
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 60;//Atk
    	pokemonStats[c][2] = 31;//Sp Atk
    	pokemonStats[c][3] = 30;//Def
    	pokemonStats[c][4] = 31;//Sp Def
    	pokemonStats[c][5] = 70;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//22
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 90;//Atk
    	pokemonStats[c][2] = 61;//Sp Atk
    	pokemonStats[c][3] = 65;//Def
    	pokemonStats[c][4] = 61;//Sp Def
    	pokemonStats[c][5] = 100;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//23
    	pokemonStats[c][0] = 35;//Hp
    	pokemonStats[c][1] = 60;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 44;//Def
    	pokemonStats[c][4] = 54;//Sp Def
    	pokemonStats[c][5] = 55;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//24
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 85;//Atk
    	pokemonStats[c][2] = 65;//Sp Atk
    	pokemonStats[c][3] = 69;//Def
    	pokemonStats[c][4] = 79;//Sp Def
    	pokemonStats[c][5] = 80;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//25
    	pokemonStats[c][0] = 35;//Hp
    	pokemonStats[c][1] = 55;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 30;//Def
    	pokemonStats[c][4] = 40;//Sp Def
    	pokemonStats[c][5] = 90;//Speed
    	pokemonStats[c][6] = 4;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//26
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 90;//Atk
    	pokemonStats[c][2] = 90;//Sp Atk
    	pokemonStats[c][3] = 55;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 100;//Speed
    	pokemonStats[c][6] = 4;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//27
    	pokemonStats[c][0] = 50;//Hp
    	pokemonStats[c][1] = 75;//Atk
    	pokemonStats[c][2] = 20;//Sp Atk
    	pokemonStats[c][3] = 85;//Def
    	pokemonStats[c][4] = 30;//Sp Def
    	pokemonStats[c][5] = 40;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//28
    	pokemonStats[c][0] = 75;//Hp
    	pokemonStats[c][1] = 100;//Atk
    	pokemonStats[c][2] = 45;//Sp Atk
    	pokemonStats[c][3] = 110;//Def
    	pokemonStats[c][4] = 55;//Sp Def
    	pokemonStats[c][5] = 65;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//29
    	pokemonStats[c][0] = 55;//Hp
    	pokemonStats[c][1] = 47;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 52;//Def
    	pokemonStats[c][4] = 40;//Sp Def
    	pokemonStats[c][5] = 41;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//30
    	pokemonStats[c][0] = 70;//Hp
    	pokemonStats[c][1] = 62;//Atk
    	pokemonStats[c][2] = 55;//Sp Atk
    	pokemonStats[c][3] = 67;//Def
    	pokemonStats[c][4] = 55;//Sp Def
    	pokemonStats[c][5] = 56;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//31
    	pokemonStats[c][0] = 90;//Hp
    	pokemonStats[c][1] = 82;//Atk
    	pokemonStats[c][2] = 75;//Sp Atk
    	pokemonStats[c][3] = 87;//Def
    	pokemonStats[c][4] = 85;//Sp Def
    	pokemonStats[c][5] = 76;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 9;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//32
    	pokemonStats[c][0] = 46;//Hp
    	pokemonStats[c][1] = 57;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 40;//Def
    	pokemonStats[c][4] = 40;//Sp Def
    	pokemonStats[c][5] = 50;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//33
    	pokemonStats[c][0] = 61;//Hp
    	pokemonStats[c][1] = 72;//Atk
    	pokemonStats[c][2] = 55;//Sp Atk
    	pokemonStats[c][3] = 57;//Def
    	pokemonStats[c][4] = 55;//Sp Def
    	pokemonStats[c][5] = 65;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//34
    	pokemonStats[c][0] = 81;//Hp
    	pokemonStats[c][1] = 92;//Atk
    	pokemonStats[c][2] = 85;//Sp Atk
    	pokemonStats[c][3] = 77;//Def
    	pokemonStats[c][4] = 75;//Sp Def
    	pokemonStats[c][5] = 85;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 9;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//35
    	pokemonStats[c][0] = 70;//Hp
    	pokemonStats[c][1] = 45;//Atk
    	pokemonStats[c][2] = 60;//Sp Atk
    	pokemonStats[c][3] = 48;//Def
    	pokemonStats[c][4] = 65;//Sp Def
    	pokemonStats[c][5] = 35;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//36
    	pokemonStats[c][0] = 95;//Hp
    	pokemonStats[c][1] = 70;//Atk
    	pokemonStats[c][2] = 85;//Sp Atk
    	pokemonStats[c][3] = 73;//Def
    	pokemonStats[c][4] = 90;//Sp Def
    	pokemonStats[c][5] = 60;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//37
    	pokemonStats[c][0] = 38;//Hp
    	pokemonStats[c][1] = 41;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 40;//Def
    	pokemonStats[c][4] = 65;//Sp Def
    	pokemonStats[c][5] = 65;//Speed
    	pokemonStats[c][6] = 2;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//38
    	pokemonStats[c][0] = 73;//Hp
    	pokemonStats[c][1] = 76;//Atk
    	pokemonStats[c][2] = 81;//Sp Atk
    	pokemonStats[c][3] = 75;//Def
    	pokemonStats[c][4] = 100;//Sp Def
    	pokemonStats[c][5] = 100;//Speed
    	pokemonStats[c][6] = 2;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//39
    	pokemonStats[c][0] = 115;//Hp
    	pokemonStats[c][1] = 45;//Atk
    	pokemonStats[c][2] = 45;//Sp Atk
    	pokemonStats[c][3] = 20;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 20;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//40
    	pokemonStats[c][0] = 140;//Hp
    	pokemonStats[c][1] = 70;//Atk
    	pokemonStats[c][2] = 75;//Sp Atk
    	pokemonStats[c][3] = 45;//Def
    	pokemonStats[c][4] = 40;//Sp Def
    	pokemonStats[c][5] = 45;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//41
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 45;//Atk
    	pokemonStats[c][2] = 30;//Sp Atk
    	pokemonStats[c][3] = 35;//Def
    	pokemonStats[c][4] = 40;//Sp Def
    	pokemonStats[c][5] = 55;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//42
    	pokemonStats[c][0] = 75;//Hp
    	pokemonStats[c][1] = 80;//Atk
    	pokemonStats[c][2] = 65;//Sp Atk
    	pokemonStats[c][3] = 70;//Def
    	pokemonStats[c][4] = 75;//Sp Def
    	pokemonStats[c][5] = 90;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//43
    	pokemonStats[c][0] = 45;//Hp
    	pokemonStats[c][1] = 50;//Atk
    	pokemonStats[c][2] = 75;//Sp Atk
    	pokemonStats[c][3] = 55;//Def
    	pokemonStats[c][4] = 65;//Sp Def
    	pokemonStats[c][5] = 30;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 8;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//44
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 65;//Atk
    	pokemonStats[c][2] = 85;//Sp Atk
    	pokemonStats[c][3] = 70;//Def
    	pokemonStats[c][4] = 75;//Sp Def
    	pokemonStats[c][5] = 40;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 8;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//45
    	pokemonStats[c][0] = 75;//Hp
    	pokemonStats[c][1] = 80;//Atk
    	pokemonStats[c][2] = 100;//Sp Atk
    	pokemonStats[c][3] = 85;//Def
    	pokemonStats[c][4] = 90;//Sp Def
    	pokemonStats[c][5] = 50;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 8;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//46
    	pokemonStats[c][0] = 35;//Hp
    	pokemonStats[c][1] = 70;//Atk
    	pokemonStats[c][2] = 45;//Sp Atk
    	pokemonStats[c][3] = 55;//Def
    	pokemonStats[c][4] = 55;//Sp Def
    	pokemonStats[c][5] = 25;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 12;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//47
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 95;//Atk
    	pokemonStats[c][2] = 60;//Sp Atk
    	pokemonStats[c][3] = 80;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 30;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 12;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//48
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 55;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 50;//Def
    	pokemonStats[c][4] = 55;//Sp Def
    	pokemonStats[c][5] = 45;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 12;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//49
    	pokemonStats[c][0] = 70;//Hp
    	pokemonStats[c][1] = 65;//Atk
    	pokemonStats[c][2] = 90;//Sp Atk
    	pokemonStats[c][3] = 60;//Def
    	pokemonStats[c][4] = 75;//Sp Def
    	pokemonStats[c][5] = 90;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 12;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//50
    	pokemonStats[c][0] = 10;//Hp
    	pokemonStats[c][1] = 55;//Atk
    	pokemonStats[c][2] = 35;//Sp Atk
    	pokemonStats[c][3] = 25;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 95;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//51
    	pokemonStats[c][0] = 35;//Hp
    	pokemonStats[c][1] = 80;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 50;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 120;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//52
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 45;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 35;//Def
    	pokemonStats[c][4] = 40;//Sp Def
    	pokemonStats[c][5] = 90;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//53
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 70;//Atk
    	pokemonStats[c][2] = 65;//Sp Atk
    	pokemonStats[c][3] = 60;//Def
    	pokemonStats[c][4] = 65;//Sp Def
    	pokemonStats[c][5] = 115;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//54
    	pokemonStats[c][0] = 50;//Hp
    	pokemonStats[c][1] = 52;//Atk
    	pokemonStats[c][2] = 65;//Sp Atk
    	pokemonStats[c][3] = 48;//Def
    	pokemonStats[c][4] = 50;//Sp Def
    	pokemonStats[c][5] = 55;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 11;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//55
    	pokemonStats[c][0] = 80;//Hp
    	pokemonStats[c][1] = 82;//Atk
    	pokemonStats[c][2] = 95;//Sp Atk
    	pokemonStats[c][3] = 78;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 85;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 11;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//56
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 80;//Atk
    	pokemonStats[c][2] = 35;//Sp Atk
    	pokemonStats[c][3] = 35;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 70;//Speed
    	pokemonStats[c][6] = 7;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//57
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 105;//Atk
    	pokemonStats[c][2] = 60;//Sp Atk
    	pokemonStats[c][3] = 60;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 95;//Speed
    	pokemonStats[c][6] = 7;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//58
    	pokemonStats[c][0] = 55;//Hp
    	pokemonStats[c][1] = 70;//Atk
    	pokemonStats[c][2] = 70;//Sp Atk
    	pokemonStats[c][3] = 45;//Def
    	pokemonStats[c][4] = 50;//Sp Def
    	pokemonStats[c][5] = 60;//Speed
    	pokemonStats[c][6] = 2;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//59
    	pokemonStats[c][0] = 90;//Hp
    	pokemonStats[c][1] = 110;//Atk
    	pokemonStats[c][2] = 100;//Sp Atk
    	pokemonStats[c][3] = 80;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 95;//Speed
    	pokemonStats[c][6] = 2;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//60
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 50;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 40;//Def
    	pokemonStats[c][4] = 40;//Sp Def
    	pokemonStats[c][5] = 90;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//61
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 65;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 65;//Def
    	pokemonStats[c][4] = 50;//Sp Def
    	pokemonStats[c][5] = 90;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//62
    	pokemonStats[c][0] = 90;//Hp
    	pokemonStats[c][1] = 85;//Atk
    	pokemonStats[c][2] = 70;//Sp Atk
    	pokemonStats[c][3] = 95;//Def
    	pokemonStats[c][4] = 90;//Sp Def
    	pokemonStats[c][5] = 70;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 7;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//63
    	pokemonStats[c][0] = 25;//Hp
    	pokemonStats[c][1] = 20;//Atk
    	pokemonStats[c][2] = 105;//Sp Atk
    	pokemonStats[c][3] = 15;//Def
    	pokemonStats[c][4] = 55;//Sp Def
    	pokemonStats[c][5] = 90;//Speed
    	pokemonStats[c][6] = 11;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//64
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 35;//Atk
    	pokemonStats[c][2] = 120;//Sp Atk
    	pokemonStats[c][3] = 30;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 105;//Speed
    	pokemonStats[c][6] = 11;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//65
    	pokemonStats[c][0] = 55;//Hp
    	pokemonStats[c][1] = 50;//Atk
    	pokemonStats[c][2] = 135;//Sp Atk
    	pokemonStats[c][3] = 45;//Def
    	pokemonStats[c][4] = 85;//Sp Def
    	pokemonStats[c][5] = 120;//Speed
    	pokemonStats[c][6] = 11;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//66
    	pokemonStats[c][0] = 70;//Hp
    	pokemonStats[c][1] = 80;//Atk
    	pokemonStats[c][2] = 35;//Sp Atk
    	pokemonStats[c][3] = 50;//Def
    	pokemonStats[c][4] = 35;//Sp Def
    	pokemonStats[c][5] = 35;//Speed
    	pokemonStats[c][6] = 7;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//67
    	pokemonStats[c][0] = 80;//Hp
    	pokemonStats[c][1] = 100;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 70;//Def
    	pokemonStats[c][4] = 60;//Sp Def
    	pokemonStats[c][5] = 45;//Speed
    	pokemonStats[c][6] = 7;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//68
    	pokemonStats[c][0] = 90;//Hp
    	pokemonStats[c][1] = 130;//Atk
    	pokemonStats[c][2] = 65;//Sp Atk
    	pokemonStats[c][3] = 80;//Def
    	pokemonStats[c][4] = 85;//Sp Def
    	pokemonStats[c][5] = 55;//Speed
    	pokemonStats[c][6] = 7;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//69
    	pokemonStats[c][0] = 50;//Hp
    	pokemonStats[c][1] = 75;//Atk
    	pokemonStats[c][2] = 70;//Sp Atk
    	pokemonStats[c][3] = 35;//Def
    	pokemonStats[c][4] = 30;//Sp Def
    	pokemonStats[c][5] = 40;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 8;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//70
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 90;//Atk
    	pokemonStats[c][2] = 85;//Sp Atk
    	pokemonStats[c][3] = 50;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 55;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 8;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//71
    	pokemonStats[c][0] = 80;//Hp
    	pokemonStats[c][1] = 105;//Atk
    	pokemonStats[c][2] = 100;//Sp Atk
    	pokemonStats[c][3] = 65;//Def
    	pokemonStats[c][4] = 60;//Sp Def
    	pokemonStats[c][5] = 70;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 8;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//72
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 40;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 35;//Def
    	pokemonStats[c][4] = 100;//Sp Def
    	pokemonStats[c][5] = 70;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 8;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//73
    	pokemonStats[c][0] = 80;//Hp
    	pokemonStats[c][1] = 70;//Atk
    	pokemonStats[c][2] = 80;//Sp Atk
    	pokemonStats[c][3] = 65;//Def
    	pokemonStats[c][4] = 120;//Sp Def
    	pokemonStats[c][5] = 100;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 8;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//74
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 80;//Atk
    	pokemonStats[c][2] = 30;//Sp Atk
    	pokemonStats[c][3] = 100;//Def
    	pokemonStats[c][4] = 30;//Sp Def
    	pokemonStats[c][5] = 20;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 13;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//75
    	pokemonStats[c][0] = 55;//Hp
    	pokemonStats[c][1] = 95;//Atk
    	pokemonStats[c][2] = 45;//Sp Atk
    	pokemonStats[c][3] = 115;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 35;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 13;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//76
    	pokemonStats[c][0] = 80;//Hp
    	pokemonStats[c][1] = 110;//Atk
    	pokemonStats[c][2] = 55;//Sp Atk
    	pokemonStats[c][3] = 130;//Def
    	pokemonStats[c][4] = 65;//Sp Def
    	pokemonStats[c][5] = 45;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 13;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//77
    	pokemonStats[c][0] = 50;//Hp
    	pokemonStats[c][1] = 85;//Atk
    	pokemonStats[c][2] = 65;//Sp Atk
    	pokemonStats[c][3] = 55;//Def
    	pokemonStats[c][4] = 65;//Sp Def
    	pokemonStats[c][5] = 90;//Speed
    	pokemonStats[c][6] = 2;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//78
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 100;//Atk
    	pokemonStats[c][2] = 80;//Sp Atk
    	pokemonStats[c][3] = 70;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 105;//Speed
    	pokemonStats[c][6] = 2;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//79
    	pokemonStats[c][0] = 90;//Hp
    	pokemonStats[c][1] = 65;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 65;//Def
    	pokemonStats[c][4] = 40;//Sp Def
    	pokemonStats[c][5] = 15;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 11;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//80
    	pokemonStats[c][0] = 95;//Hp
    	pokemonStats[c][1] = 75;//Atk
    	pokemonStats[c][2] = 100;//Sp Atk
    	pokemonStats[c][3] = 110;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 30;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 11;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//81
    	pokemonStats[c][0] = 25;//Hp
    	pokemonStats[c][1] = 35;//Atk
    	pokemonStats[c][2] = 95;//Sp Atk
    	pokemonStats[c][3] = 35;//Def
    	pokemonStats[c][4] = 55;//Sp Def
    	pokemonStats[c][5] = 45;//Speed
    	pokemonStats[c][6] = 4;//Type 1
    	pokemonStats[c][7] = 17;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//82
    	pokemonStats[c][0] = 50;//Hp
    	pokemonStats[c][1] = 60;//Atk
    	pokemonStats[c][2] = 120;//Sp Atk
    	pokemonStats[c][3] = 95;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 70;//Speed
    	pokemonStats[c][6] = 4;//Type 1
    	pokemonStats[c][7] = 17;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//83
    	pokemonStats[c][0] = 52;//Hp
    	pokemonStats[c][1] = 65;//Atk
    	pokemonStats[c][2] = 58;//Sp Atk
    	pokemonStats[c][3] = 55;//Def
    	pokemonStats[c][4] = 62;//Sp Def
    	pokemonStats[c][5] = 60;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//84
    	pokemonStats[c][0] = 35;//Hp
    	pokemonStats[c][1] = 85;//Atk
    	pokemonStats[c][2] = 35;//Sp Atk
    	pokemonStats[c][3] = 45;//Def
    	pokemonStats[c][4] = 35;//Sp Def
    	pokemonStats[c][5] = 75;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//85
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 110;//Atk
    	pokemonStats[c][2] = 60;//Sp Atk
    	pokemonStats[c][3] = 70;//Def
    	pokemonStats[c][4] = 60;//Sp Def
    	pokemonStats[c][5] = 100;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//86
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 45;//Atk
    	pokemonStats[c][2] = 45;//Sp Atk
    	pokemonStats[c][3] = 55;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 45;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//87
    	pokemonStats[c][0] = 90;//Hp
    	pokemonStats[c][1] = 70;//Atk
    	pokemonStats[c][2] = 70;//Sp Atk
    	pokemonStats[c][3] = 80;//Def
    	pokemonStats[c][4] = 95;//Sp Def
    	pokemonStats[c][5] = 70;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 6;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//88
    	pokemonStats[c][0] = 80;//Hp
    	pokemonStats[c][1] = 80;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 50;//Def
    	pokemonStats[c][4] = 50;//Sp Def
    	pokemonStats[c][5] = 25;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//89
    	pokemonStats[c][0] = 105;//Hp
    	pokemonStats[c][1] = 105;//Atk
    	pokemonStats[c][2] = 65;//Sp Atk
    	pokemonStats[c][3] = 75;//Def
    	pokemonStats[c][4] = 100;//Sp Def
    	pokemonStats[c][5] = 50;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//90
    	pokemonStats[c][0] = 30;//Hp
    	pokemonStats[c][1] = 65;//Atk
    	pokemonStats[c][2] = 45;//Sp Atk
    	pokemonStats[c][3] = 100;//Def
    	pokemonStats[c][4] = 25;//Sp Def
    	pokemonStats[c][5] = 50;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//91
    	pokemonStats[c][0] = 50;//Hp
    	pokemonStats[c][1] = 95;//Atk
    	pokemonStats[c][2] = 85;//Sp Atk
    	pokemonStats[c][3] = 180;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 70;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 6;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//92
    	pokemonStats[c][0] = 30;//Hp
    	pokemonStats[c][1] = 35;//Atk
    	pokemonStats[c][2] = 100;//Sp Atk
    	pokemonStats[c][3] = 30;//Def
    	pokemonStats[c][4] = 35;//Sp Def
    	pokemonStats[c][5] = 80;//Speed
    	pokemonStats[c][6] = 14;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//93
    	pokemonStats[c][0] = 45;//Hp
    	pokemonStats[c][1] = 50;//Atk
    	pokemonStats[c][2] = 115;//Sp Atk
    	pokemonStats[c][3] = 45;//Def
    	pokemonStats[c][4] = 55;//Sp Def
    	pokemonStats[c][5] = 95;//Speed
    	pokemonStats[c][6] = 14;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//94
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 65;//Atk
    	pokemonStats[c][2] = 130;//Sp Atk
    	pokemonStats[c][3] = 60;//Def
    	pokemonStats[c][4] = 75;//Sp Def
    	pokemonStats[c][5] = 110;//Speed
    	pokemonStats[c][6] = 14;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//95
    	pokemonStats[c][0] = 35;//Hp
    	pokemonStats[c][1] = 45;//Atk
    	pokemonStats[c][2] = 30;//Sp Atk
    	pokemonStats[c][3] = 160;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 70;//Speed
    	pokemonStats[c][6] = 13;//Type 1
    	pokemonStats[c][7] = 9;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//96
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 48;//Atk
    	pokemonStats[c][2] = 43;//Sp Atk
    	pokemonStats[c][3] = 45;//Def
    	pokemonStats[c][4] = 90;//Sp Def
    	pokemonStats[c][5] = 42;//Speed
    	pokemonStats[c][6] = 11;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//97
    	pokemonStats[c][0] = 85;//Hp
    	pokemonStats[c][1] = 73;//Atk
    	pokemonStats[c][2] = 73;//Sp Atk
    	pokemonStats[c][3] = 70;//Def
    	pokemonStats[c][4] = 115;//Sp Def
    	pokemonStats[c][5] = 67;//Speed
    	pokemonStats[c][6] = 11;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//98
    	pokemonStats[c][0] = 30;//Hp
    	pokemonStats[c][1] = 105;//Atk
    	pokemonStats[c][2] = 25;//Sp Atk
    	pokemonStats[c][3] = 90;//Def
    	pokemonStats[c][4] = 25;//Sp Def
    	pokemonStats[c][5] = 50;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//99
    	pokemonStats[c][0] = 55;//Hp
    	pokemonStats[c][1] = 130;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 115;//Def
    	pokemonStats[c][4] = 50;//Sp Def
    	pokemonStats[c][5] = 75;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//100
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 30;//Atk
    	pokemonStats[c][2] = 55;//Sp Atk
    	pokemonStats[c][3] = 50;//Def
    	pokemonStats[c][4] = 55;//Sp Def
    	pokemonStats[c][5] = 100;//Speed
    	pokemonStats[c][6] = 4;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//101
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 50;//Atk
    	pokemonStats[c][2] = 80;//Sp Atk
    	pokemonStats[c][3] = 70;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 140;//Speed
    	pokemonStats[c][6] = 4;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//102
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 40;//Atk
    	pokemonStats[c][2] = 60;//Sp Atk
    	pokemonStats[c][3] = 80;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 40;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//103
    	pokemonStats[c][0] = 95;//Hp
    	pokemonStats[c][1] = 95;//Atk
    	pokemonStats[c][2] = 125;//Sp Atk
    	pokemonStats[c][3] = 85;//Def
    	pokemonStats[c][4] = 65;//Sp Def
    	pokemonStats[c][5] = 55;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//104
    	pokemonStats[c][0] = 50;//Hp
    	pokemonStats[c][1] = 50;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 95;//Def
    	pokemonStats[c][4] = 50;//Sp Def
    	pokemonStats[c][5] = 35;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//105
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 80;//Atk
    	pokemonStats[c][2] = 50;//Sp Atk
    	pokemonStats[c][3] = 110;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 45;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//106
    	pokemonStats[c][0] = 50;//Hp
    	pokemonStats[c][1] = 120;//Atk
    	pokemonStats[c][2] = 35;//Sp Atk
    	pokemonStats[c][3] = 53;//Def
    	pokemonStats[c][4] = 110;//Sp Def
    	pokemonStats[c][5] = 87;//Speed
    	pokemonStats[c][6] = 7;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//107
    	pokemonStats[c][0] = 50;//Hp
    	pokemonStats[c][1] = 105;//Atk
    	pokemonStats[c][2] = 35;//Sp Atk
    	pokemonStats[c][3] = 79;//Def
    	pokemonStats[c][4] = 110;//Sp Def
    	pokemonStats[c][5] = 76;//Speed
    	pokemonStats[c][6] = 7;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//108
    	pokemonStats[c][0] = 90;//Hp
    	pokemonStats[c][1] = 55;//Atk
    	pokemonStats[c][2] = 60;//Sp Atk
    	pokemonStats[c][3] = 75;//Def
    	pokemonStats[c][4] = 75;//Sp Def
    	pokemonStats[c][5] = 30;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//109
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 65;//Atk
    	pokemonStats[c][2] = 60;//Sp Atk
    	pokemonStats[c][3] = 95;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 35;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//110
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 90;//Atk
    	pokemonStats[c][2] = 85;//Sp Atk
    	pokemonStats[c][3] = 120;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 60;//Speed
    	pokemonStats[c][6] = 8;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//111
    	pokemonStats[c][0] = 80;//Hp
    	pokemonStats[c][1] = 85;//Atk
    	pokemonStats[c][2] = 30;//Sp Atk
    	pokemonStats[c][3] = 95;//Def
    	pokemonStats[c][4] = 30;//Sp Def
    	pokemonStats[c][5] = 25;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 13;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//112
    	pokemonStats[c][0] = 105;//Hp
    	pokemonStats[c][1] = 130;//Atk
    	pokemonStats[c][2] = 45;//Sp Atk
    	pokemonStats[c][3] = 120;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 40;//Speed
    	pokemonStats[c][6] = 9;//Type 1
    	pokemonStats[c][7] = 13;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//113
    	pokemonStats[c][0] = 250;//Hp
    	pokemonStats[c][1] = 5;//Atk
    	pokemonStats[c][2] = 35;//Sp Atk
    	pokemonStats[c][3] = 5;//Def
    	pokemonStats[c][4] = 105;//Sp Def
    	pokemonStats[c][5] = 50;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//114
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 55;//Atk
    	pokemonStats[c][2] = 100;//Sp Atk
    	pokemonStats[c][3] = 115;//Def
    	pokemonStats[c][4] = 40;//Sp Def
    	pokemonStats[c][5] = 60;//Speed
    	pokemonStats[c][6] = 5;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//115
    	pokemonStats[c][0] = 105;//Hp
    	pokemonStats[c][1] = 95;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 80;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 90;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//116
    	pokemonStats[c][0] = 30;//Hp
    	pokemonStats[c][1] = 40;//Atk
    	pokemonStats[c][2] = 70;//Sp Atk
    	pokemonStats[c][3] = 70;//Def
    	pokemonStats[c][4] = 25;//Sp Def
    	pokemonStats[c][5] = 60;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//117
    	pokemonStats[c][0] = 55;//Hp
    	pokemonStats[c][1] = 65;//Atk
    	pokemonStats[c][2] = 95;//Sp Atk
    	pokemonStats[c][3] = 95;//Def
    	pokemonStats[c][4] = 45;//Sp Def
    	pokemonStats[c][5] = 85;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//118
    	pokemonStats[c][0] = 45;//Hp
    	pokemonStats[c][1] = 67;//Atk
    	pokemonStats[c][2] = 35;//Sp Atk
    	pokemonStats[c][3] = 60;//Def
    	pokemonStats[c][4] = 50;//Sp Def
    	pokemonStats[c][5] = 63;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//119
    	pokemonStats[c][0] = 80;//Hp
    	pokemonStats[c][1] = 92;//Atk
    	pokemonStats[c][2] = 65;//Sp Atk
    	pokemonStats[c][3] = 65;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 68;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//120
    	pokemonStats[c][0] = 30;//Hp
    	pokemonStats[c][1] = 45;//Atk
    	pokemonStats[c][2] = 70;//Sp Atk
    	pokemonStats[c][3] = 55;//Def
    	pokemonStats[c][4] = 55;//Sp Def
    	pokemonStats[c][5] = 85;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//121
    	pokemonStats[c][0] = 60;//Hp
    	pokemonStats[c][1] = 75;//Atk
    	pokemonStats[c][2] = 100;//Sp Atk
    	pokemonStats[c][3] = 85;//Def
    	pokemonStats[c][4] = 85;//Sp Def
    	pokemonStats[c][5] = 115;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//122
    	pokemonStats[c][0] = 40;//Hp
    	pokemonStats[c][1] = 45;//Atk
    	pokemonStats[c][2] = 100;//Sp Atk
    	pokemonStats[c][3] = 65;//Def
    	pokemonStats[c][4] = 120;//Sp Def
    	pokemonStats[c][5] = 90;//Speed
    	pokemonStats[c][6] = 11;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//123
    	pokemonStats[c][0] = 70;//Hp
    	pokemonStats[c][1] = 110;//Atk
    	pokemonStats[c][2] = 55;//Sp Atk
    	pokemonStats[c][3] = 80;//Def
    	pokemonStats[c][4] = 80;//Sp Def
    	pokemonStats[c][5] = 105;//Speed
    	pokemonStats[c][6] = 12;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//124
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 50;//Atk
    	pokemonStats[c][2] = 115;//Sp Atk
    	pokemonStats[c][3] = 35;//Def
    	pokemonStats[c][4] = 95;//Sp Def
    	pokemonStats[c][5] = 95;//Speed
    	pokemonStats[c][6] = 11;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//125
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 83;//Atk
    	pokemonStats[c][2] = 95;//Sp Atk
    	pokemonStats[c][3] = 57;//Def
    	pokemonStats[c][4] = 85;//Sp Def
    	pokemonStats[c][5] = 105;//Speed
    	pokemonStats[c][6] = 4;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//126
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 95;//Atk
    	pokemonStats[c][2] = 100;//Sp Atk
    	pokemonStats[c][3] = 57;//Def
    	pokemonStats[c][4] = 85;//Sp Def
    	pokemonStats[c][5] = 93;//Speed
    	pokemonStats[c][6] = 2;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 42;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//127
    	pokemonStats[c][0] = 65;//Hp
    	pokemonStats[c][1] = 125;//Atk
    	pokemonStats[c][2] = 55;//Sp Atk
    	pokemonStats[c][3] = 100;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 85;//Speed
    	pokemonStats[c][6] = 12;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//128
    	pokemonStats[c][0] = 75;//Hp
    	pokemonStats[c][1] = 100;//Atk
    	pokemonStats[c][2] = 40;//Sp Atk
    	pokemonStats[c][3] = 95;//Def
    	pokemonStats[c][4] = 70;//Sp Def
    	pokemonStats[c][5] = 110;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//129
    	pokemonStats[c][0] = 9001;//Hp
    	pokemonStats[c][1] = 9001;//Atk
    	pokemonStats[c][2] = 9001;//Sp Atk
    	pokemonStats[c][3] = 9001;//Def
    	pokemonStats[c][4] = 9001;//Sp Def
    	pokemonStats[c][5] = 9001;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//130
    	pokemonStats[c][0] = 95;//Hp
    	pokemonStats[c][1] = 125;//Atk
    	pokemonStats[c][2] = 60;//Sp Atk
    	pokemonStats[c][3] = 79;//Def
    	pokemonStats[c][4] = 100;//Sp Def
    	pokemonStats[c][5] = 81;//Speed
    	pokemonStats[c][6] = 3;//Type 1
    	pokemonStats[c][7] = 10;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//131
    	pokemonStats[c][0] = 48;//Hp
    	pokemonStats[c][1] = 48;//Atk
    	pokemonStats[c][2] = 48;//Sp Atk
    	pokemonStats[c][3] = 48;//Def
    	pokemonStats[c][4] = 48;//Sp Def
    	pokemonStats[c][5] = 48;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//132
    	pokemonStats[c][0] = 55;//Hp
    	pokemonStats[c][1] = 55;//Atk
    	pokemonStats[c][2] = 45;//Sp Atk
    	pokemonStats[c][3] = 50;//Def
    	pokemonStats[c][4] = 65;//Sp Def
    	pokemonStats[c][5] = 55;//Speed
    	pokemonStats[c][6] = 1;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 32;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	//133
    	pokemonStats[c][0] = 0;//Hp
    	pokemonStats[c][1] = 0;//Atk
    	pokemonStats[c][2] = 0;//Sp Atk
    	pokemonStats[c][3] = 0;//Def
    	pokemonStats[c][4] = 0;//Sp Def
    	pokemonStats[c][5] = 0;//Speed
    	pokemonStats[c][6] = 0;//Type 1
    	pokemonStats[c][7] = 0;//Type 2
    	pokemonStats[c][8] = 0;//Evo Stage
    	pokemonStats[c][9] = 0;//Exp
    	c++;
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        pokemonStats[304][0] = 50;
        pokemonStats[304][1] = 70;
        pokemonStats[304][2] = 100;
        pokemonStats[304][3] = 40;
        pokemonStats[304][4] = 40;
        pokemonStats[304][5] = 30;
        pokemonStats[304][6] = 17;  //STEEL
        pokemonStats[304][7] = 13;  //ROCK
        pokemonStats[304][8] = 32;
        
        pokemonStats[305][0] = 60;
        pokemonStats[305][1] = 90;
        pokemonStats[305][2] = 140;
        pokemonStats[305][3] = 50;
        pokemonStats[305][4] = 50;
        pokemonStats[305][5] = 40;
        pokemonStats[305][6] = 17;  //STEEL
        pokemonStats[305][7] = 13;  //ROCK
        pokemonStats[305][8] = 42;
        
        pokemonStats[306][0] = 70;
        pokemonStats[306][1] = 110;
        pokemonStats[306][2] = 180;
        pokemonStats[306][3] = 60;
        pokemonStats[306][4] = 60;
        pokemonStats[306][5] = 50;
        pokemonStats[306][6] = 17;  //STEEL
        pokemonStats[306][7] = 13;  //ROCK
        pokemonStats[306][8] = 0;   //NULL
        
        pokemonStats[328][0] = 45;
        pokemonStats[328][1] = 100;
        pokemonStats[328][2] = 45;
        pokemonStats[328][3] = 45;
        pokemonStats[328][4] = 45;
        pokemonStats[328][5] = 10;
        pokemonStats[328][6] = 9;   //GROUND
        pokemonStats[328][7] = 0;
        pokemonStats[328][8] = 35;
        
        pokemonStats[328][0] = 50;
        pokemonStats[328][1] = 70;
        pokemonStats[328][2] = 50;
        pokemonStats[328][3] = 50;
        pokemonStats[328][4] = 50;
        pokemonStats[328][5] = 70;
        pokemonStats[328][6] = 9;   //GROUND
        pokemonStats[328][7] = 15;  //DRAGON
        pokemonStats[328][8] = 45;
        
        pokemonStats[328][0] = 80;
        pokemonStats[328][1] = 100;
        pokemonStats[328][2] = 80;
        pokemonStats[328][3] = 80;
        pokemonStats[328][4] = 80;
        pokemonStats[328][5] = 100;
        pokemonStats[328][6] = 9;   //GROUND
        pokemonStats[328][7] = 15;  //DRAGON
        pokemonStats[328][8] = 0;   //NULL
        
        pokemonStats[582][0] = 36;
        pokemonStats[582][1] = 50;
        pokemonStats[582][2] = 50;
        pokemonStats[582][3] = 65;
        pokemonStats[582][4] = 60;
        pokemonStats[582][5] = 44;
        pokemonStats[582][6] = 6;   //ICE
        pokemonStats[582][7] = 0;
        pokemonStats[582][8] = 35;
        
        pokemonStats[583][0] = 51;
        pokemonStats[583][1] = 65;
        pokemonStats[583][2] = 65;
        pokemonStats[583][3] = 80;
        pokemonStats[583][4] = 75;
        pokemonStats[583][5] = 59;
        pokemonStats[583][6] = 6;   //ICE
        pokemonStats[583][7] = 0;
        pokemonStats[583][8] = 47;
        
        pokemonStats[584][0] = 71;
        pokemonStats[584][1] = 95;
        pokemonStats[584][2] = 85;
        pokemonStats[584][3] = 110;
        pokemonStats[584][4] = 95;
        pokemonStats[584][5] = 79;
        pokemonStats[584][6] = 6;   //ICE
        pokemonStats[584][7] = 0;
        pokemonStats[584][8] = 47;
    }
}
