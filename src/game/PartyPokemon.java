//Dayle Chapman 
//Created: 10/12/2012 10:06am
//Last time edited: 11/12/2012 9:13am
//Version: 1.0.0

/*Change log
 * V. 1.0.0
 * Made it.
 */
package game;
public class PartyPokemon {
	public static int[][] partypkmn = new int[7][22];
	public static int[][] oppParty = new int[7][22];
	/* Layout
	 * [position in party][stat position]
	 * [x][1] = Species # 
	 * [x][2] = Lvl
	 * [x][3] = Max Hp
	 * [x][4] = Current Hp
	 * [x][5] = Attack
	 * [x][6] = Defence
	 * [x][7] = Sp. Attack
	 * [x][8] = Sp. Defence
	 * [x][9] = Exp
	 * [x][10] = Status 
	 * [x][11] = Move 1
	 * [x][12] = Move 2
	 * [x][13] = Move 3
	 * [x][14] = Move 4
	 * [x][15] = Exists (1 = yes, 0 = no)
	 * [x][16] = Speed
	 * [x][17] = Ability
	 * [x][18] = Type 1
	 * [x][19] = Type 2
	 * [x][20] = Wild or Trainer Owned (0 = Wild, 1 = Owned)
	 * [x][21] = Exp until lvl up
	 */
	public static void activate(){
		for(int c = 1; c <= 6; c++){
			for(int cc = 1; cc <=21; cc++){
				partypkmn[c][cc] = 1;
				oppParty[c][cc] = 1;
			}
		}
                partypkmn[1][1]=25;
                partypkmn[1][2]=5;
                partypkmn[1][3]=20;
                partypkmn[1][4]=20;
                partypkmn[1][5]=5;
                partypkmn[1][6]=5;
                partypkmn[1][7]=5;
                partypkmn[1][8]=5;
                partypkmn[1][9]=0;
                partypkmn[1][10]=0;
                partypkmn[1][11]=1;
                partypkmn[1][12]=0;
                partypkmn[1][13]=0;
                partypkmn[1][14]=0;
                partypkmn[1][15]=1;
                partypkmn[1][16]=5;
                partypkmn[1][17]=20;
                partypkmn[1][18]=4;
                partypkmn[1][19]=0;
                partypkmn[1][20]=1;
                partypkmn[1][21]=25;

	}
}
