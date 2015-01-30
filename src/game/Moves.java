//Dayle Chapman 
//Created: 11/12/2012 9:13am
//Last time edited: 11/12/2012 9:13am
//Version: 1.0.0

/*Change log
 * V. 1.0.0
 * 
 */
package game;
public class Moves {
	public static int[][] moves=new int[21][9];
	public static String[] names=new String[21];
	/* Info
	 * [move #][info]
	 * [x][1] = Power
	 * [x][2] = Type
	 * [x][3] = Sp. or Phys (1 = phys, 2 = sp.)
	 * [x][4] = Power Points
	 * [x][5] = Accuracy
	 * [x][6] = Is Explosion (0 = no, 1 = yes) 
	 * [x][7] = Is 1HKO (0 = no, 1 = yes)
	 * [x][8] = Crit stage
	 */
	public static void activate(){
		moves[1][1] = 40;
		moves[1][2] = 1;
		moves[1][3] = 1;
		moves[1][4] = 35;
		moves[1][5] = 100;
		moves[1][6] = 0;
		moves[1][7] = 0;
		moves[1][8] = 1;
		names[1] = "Pound";
		
		moves[2][1] = 50;
		moves[2][2] = 7;
		moves[2][3] = 1;
		moves[2][4] = 25;
		moves[2][5] = 100;
		moves[2][6] = 0;
		moves[2][7] = 0;
		moves[2][8] = 1;
		names[2] = "Karate Chop";
		
		moves[3][1] = 15;//Power
		moves[3][2] = 1;//Element
		moves[3][3] = 1;//Phys = 1 Sp = 2
		moves[3][4] = 10;//PP
		moves[3][5] = 85;//Acc
		moves[3][6] = 0;//Explo
		moves[3][7] = 0;//OHKO
		moves[3][8] = 1;//Crit lvl
		names[3] = "Double Slap";
		
		moves[4][1] = 18;//Power
		moves[4][2] = 1;//Element
		moves[4][3] = 1;//Phys = 1 Sp = 2
		moves[4][4] = 15;//PP
		moves[4][5] = 85;//Acc
		moves[4][6] = 0;//Explo
		moves[4][7] = 0;//OHKO
		moves[4][8] = 1;//Crit lvl
		names[4] = "Comet Punch";
		
		moves[5][1] = 80;//Power
		moves[5][2] = 1;//Element
		moves[5][3] = 1;//Phys = 1 Sp = 2
		moves[5][4] = 20;//PP
		moves[5][5] = 85;//Acc
		moves[5][6] = 0;//Explo
		moves[5][7] = 0;//OHKO
		moves[5][8] = 1;//Crit lvl
		names[5] = "Mega Punch";
		
		moves[6][1] = 40;//Power
		moves[6][2] = 1;//Element
		moves[6][3] = 1;//Phys = 1 Sp = 2
		moves[6][4] = 20;//PP
		moves[6][5] = 100;//Acc
		moves[6][6] = 0;//Explo
		moves[6][7] = 0;//OHKO
		moves[6][8] = 1;//Crit lvl
		names[6] = "Pay Day";
	
		moves[7][1] = 75;//Power
		moves[7][2] = 2;//Element
		moves[7][3] = 1;//Phys = 1 Sp = 2
		moves[7][4] = 15;//PP
		moves[7][5] = 100;//Acc
		moves[7][6] = 0;//Explo
		moves[7][7] = 0;//OHKO
		moves[7][8] = 1;//Crit lvl
		names[7] = "Fire Punch";	
		
		moves[8][1] = 75;//Power
		moves[8][2] = 6;//Element
		moves[8][3] = 1;//Phys = 1 Sp = 2
		moves[8][4] = 15;//PP
		moves[8][5] = 100;//Acc
		moves[8][6] = 0;//Explo
		moves[8][7] = 0;//OHKO
		moves[8][8] = 1;//Crit lvl
		names[8] = "Ice Punch";
		
		moves[9][1] = 75;//Power
		moves[9][2] = 4;//Element
		moves[9][3] = 1;//Phys = 1 Sp = 2
		moves[9][4] = 15;//PP
		moves[9][5] = 100;//Acc
		moves[9][6] = 0;//Explo
		moves[9][7] = 0;//OHKO
		moves[9][8] = 1;//Crit lvl
		names[9] = "Thunder Punch";
		
		moves[10][1] = 40;//Power
		moves[10][2] = 1;//Element
		moves[10][3] = 1;//Phys = 1 Sp = 2
		moves[10][4] = 35;//PP
		moves[10][5] = 100;//Acc
		moves[10][6] = 0;//Explo
		moves[10][7] = 0;//OHKO
		moves[10][8] = 1;//Crit lvl
		names[10] = "Scratch";
		
		moves[11][1] = 55;//Power
		moves[11][2] = 1;//Element
		moves[11][3] = 1;//Phys = 1 Sp = 2
		moves[11][4] = 30;//PP
		moves[11][5] = 100;//Acc
		moves[11][6] = 0;//Explo
		moves[11][7] = 0;//OHKO
		moves[11][8] = 1;//Crit lvl
		names[11] = "Vice Grip";
		
		moves[12][1] = 999999999;//Power
		moves[12][2] = 1;//Element
		moves[12][3] = 1;//Phys = 1 Sp = 2
		moves[12][4] = 5;//PP
		moves[12][5] = 100000000;//Acc
		moves[12][6] = 0;//Explo
		moves[12][7] = 1;//OHKO
		moves[12][8] = 1;//Crit lvl
		names[12] = "Guillotine";
		
		moves[13][1] = 80;//Power
		moves[13][2] = 1;//Element
		moves[13][3] = 2;//Phys = 1 Sp = 2
		moves[13][4] = 10;//PP
		moves[13][5] = 100;//Acc
		moves[13][6] = 0;//Explo
		moves[13][7] = 0;//OHKO
		moves[13][8] = 1;//Crit lvl
		names[13] = "Razor Wind";
		
		moves[14][1] = 50;//Power
		moves[14][2] = 1;//Element
		moves[14][3] = 1;//Phys = 1 Sp = 2
		moves[14][4] = 30;//PP
		moves[14][5] = 100;//Acc
		moves[14][6] = 0;//Explo
		moves[14][7] = 0;//OHKO
		moves[14][8] = 1;//Crit lvl
		names[14] = "Cut";
		
		moves[15][1] = 40;//Power
		moves[15][2] = 10;//Element
		moves[15][3] = 2;//Phys = 1 Sp = 2
		moves[15][4] = 35;//PP
		moves[15][5] = 100;//Acc
		moves[15][6] = 0;//Explo
		moves[15][7] = 0;//OHKO
		moves[15][8] = 1;//Crit lvl
		names[15] = "Gust";
		
		moves[16][1] = 60;//Power
		moves[16][2] = 10;//Element
		moves[16][3] = 1;//Phys = 1 Sp = 2
		moves[16][4] = 35;//PP
		moves[16][5] = 100;//Acc
		moves[16][6] = 0;//Explo
		moves[16][7] = 0;//OHKO
		moves[16][8] = 1;//Crit lvl
		names[16] = "Wing Attack";
		
		moves[17][1] = 90;//Power
		moves[17][2] = 10;//Element
		moves[17][3] = 1;//Phys = 1 Sp = 2
		moves[17][4] = 15;//PP
		moves[17][5] = 95;//Acc
		moves[17][6] = 0;//Explo
		moves[17][7] = 0;//OHKO
		moves[17][8] = 1;//Crit lvl
		names[17] = "Fly";
		
		moves[18][1] = 15;//Power
		moves[18][2] = 1;//Element
		moves[18][3] = 1;//Phys = 1 Sp = 2
		moves[18][4] = 20;//PP
		moves[18][5] = 85;//Acc
		moves[18][6] = 0;//Explo
		moves[18][7] = 0;//OHKO
		moves[18][8] = 1;//Crit lvl
		names[18] = "Bind";
		
		moves[19][1] = 80;//Power
		moves[19][2] = 1;//Element
		moves[19][3] = 1;//Phys = 1 Sp = 2
		moves[19][4] = 20;//PP
		moves[19][5] = 75;//Acc
		moves[19][6] = 0;//Explo
		moves[19][7] = 0;//OHKO
		moves[19][8] = 1;//Crit lvl
		names[19] = "Slam";
		
		moves[20][1] = 35;//Power
		moves[20][2] = 5;//Element
		moves[20][3] = 1;//Phys = 1 Sp = 2
		moves[20][4] = 15;//PP
		moves[20][5] = 100;//Acc
		moves[20][6] = 0;//Explo
		moves[20][7] = 0;//OHKO
		moves[20][8] = 1;//Crit lvl
		names[20] = "Vine Whip";
	}
	public static double stab(int move){
		double stabmulti;
		if(moves[move][2] == Active.activePkmnStats[9] || moves[move][2] == Active.activePkmnStats[10]){
			stabmulti = 1.5;
		}
		else{
			stabmulti = 1; 
		}
		return stabmulti;
	}
}
