//Dayle Chapman 
//Created: 26/11/2012 10:15pm
//Last time edited: 30/11/2012 10:00am
//Version: 1.1.0 (Final)

/*Change log
 * V. 1.0.0
 * - Added Noraml through Rock charts
 * V. 1.1.0
 * - Finished Ghost through Steel charts
 * - Added titles for better orginization
 * - Changed to return a value... derp
 */
package game;
public class MoveComparision {
	public static double moveMultiplier(int attack, int type){
		double[][] comp = new double[18][18];
		//First - Attacking / Second - Defending
		
		//Normal
		comp[1][1] = 1;//Norm-Norm
		comp[1][2] = 1;//Norm-Fire
		comp[1][3] = 1;//Norm-Wtr
		comp[1][4] = 1;//Norm-Elec
		comp[1][5] = 1;//Norm-Grss
		comp[1][6] = 1;//Norm-Ice
		comp[1][7] = 1;//Norm-Fght
		comp[1][8] = 1;//Norm-Poi
		comp[1][9] = 1;//Norm-Grnd
		comp[1][10] = 1;//Norm-Fly
		comp[1][11] = 1;//Norm-Psy
		comp[1][12] = 1;//Norm-Bug
		comp[1][13] = .5;//Norm-Rock
		comp[1][14] = 0;//Norm-Ghst
		comp[1][15] = 1;//Norm-Drag
		comp[1][16] = 1;//Norm-Drk
		comp[1][17] = 1;//Norm-Stl
		
		//Fire
		comp[2][1] = 1;//Fire-Norm
		comp[2][2] = .5;//Fire-Fire
		comp[2][3] = .5;//Fire-Water
		comp[2][4] = 1;//Fire-Elec
		comp[2][5] = 2;//Fire-Grss
		comp[2][6] = 2;//Fire-Ice
		comp[2][7] = 1;//Fire-Fght
		comp[2][8] = 1;//Fire-Poi
		comp[2][9] = 1;//Fire-Grnd
		comp[2][10] = 1;//Fire-Fly
		comp[2][11] = 1;//Fire-Psy
		comp[2][12] = 2;//Fire-Bug
		comp[2][13] = .5;//Fire-Rock
		comp[2][14] = 1;//Fire-Ghst
		comp[2][15] = .5;//Fire-Drag
		comp[2][16] = 1;//Fire-Drk
		comp[2][17] = 2;//Fire-Stl
		
		//Water
		comp[3][1] = 1;//Wtr-Norm
		comp[3][2] = 2;//Wtr-Fire
		comp[3][3] = 0.5;//Wtr-Wtr
		comp[3][4] = 1;//Wtr-Elec
		comp[3][5] = 0.5;//Wtr-Grss
		comp[3][6] = 1;//Wtr-Ice
		comp[3][7] = 1;//Wtr-Fght
		comp[3][8] = 1;//Wtr-Poi
		comp[3][9] = 2;//Wtr-Grnd
		comp[3][10] = 1;//Wtr-Fly
		comp[3][11] = 1;//Wtr-Psy
		comp[3][12] = 1;//Wtr-Bug
		comp[3][13] = 2;//Wtr-Rock
		comp[3][14] = 1;//Wtr-Ghst
		comp[3][15] = .5;//Wtr-Drag
		comp[3][16] = 1;//Wtr-Drk
		comp[3][17] = 1;//Wtr-Stl
		
		//Electric
		comp[4][1] = 1;//Elec-Norm
		comp[4][2] = 1;//Elec-Fire
		comp[4][3] = 2;//Elec-Wtr
		comp[4][4] = .5;//Elec-Elec
		comp[4][5] = .5;//Elec-Grss
		comp[4][6] = 1;//Elec-Ice
		comp[4][7] = 1;//Elec-Fght
		comp[4][8] = 1;//Elec-Poi
		comp[4][9] = 0;//Elec-Grnd
		comp[4][10] = 2;//Elec-Fly
		comp[4][11] = 1;//Elec-Psy
		comp[4][12] = 1;//Elec-Bug
		comp[4][13] = 1;//Elec-Rock
		comp[4][14] = 1;//Elec-Ghst
		comp[4][15] = .5;//Elec-Drg
		comp[4][16] = 1;//Elec-Drk
		comp[4][17] = 1;//Elec-Stl
		
		//Grass
		comp[5][1] = 1;//Grss-Norm
		comp[5][2] = .5;//Grss-Fire
		comp[5][3] = 2;//Grss-Wtr
		comp[5][4] = 1;//Grss-Elec
		comp[5][5] = .5;//Grss-Grss
		comp[5][6] = 1;//Grss-Ice
		comp[5][7] = 1;//Grss-Fght
		comp[5][8] = 0.5;//Grss-Poi
		comp[5][9] = 2;//Grss-Grnd
		comp[5][10] = .5;//Grss-Fly
		comp[5][11] = 1;//Grss-Psy
		comp[5][12] = .5;//Grss-Bug
		comp[5][13] = 2;//Grss-Rock
		comp[5][14] = 1;//Grss-Ghst
		comp[5][15] = .5;//Grss-Drg
		comp[5][16] = 1;//Grss-Drk
		comp[5][17] = .5;//Grss-Stl
		
		//Ice
		comp[6][1] = 1;//Ice-Norm
		comp[6][2] = .5;//Ice-Fire
		comp[6][3] = .5;//Ice-Wtr
		comp[6][4] = 1;//Ice-Elec
		comp[6][5] = 2;//Ice-Grss
		comp[6][6] = .5;//Ice-Ice
		comp[6][7] = 1;//Ice-Fght
		comp[6][8] = 1;//Ice-Poi
		comp[6][9] = 2;//Ice-Grnd
		comp[6][10] = 2;//Ice-Fly
		comp[6][11] = 1;//Ice-Psy
		comp[6][12] = 1;//Ice-Bug
		comp[6][13] = 1;//Ice-Rock
		comp[6][14] = 1;//Ice-Ghst
		comp[6][15] = 2;//Ice-Drg
		comp[6][16] = 1;//Ice-Drk
		comp[6][17] = .5;//Ice-Stl
		
		//Fighting
		comp[7][1] = 2;//Fght-Norm
		comp[7][2] = 1;//Fght-Fire
		comp[7][3] = 1;//Fght-Wtr
		comp[7][4] = 1;//Fght-Elec
		comp[7][5] = 1;//Fght-Grss
		comp[7][6] = 2;//Fght-Ice
		comp[7][7] = 1;//Fght-Fght
		comp[7][8] = .5;//Fght-Poi
		comp[7][9] = 1;//Fght-Grnd
		comp[7][10] = .5;//Fght-Fly
		comp[7][11] = .5;//Fght-Psy
		comp[7][12] = .5;//Fght-Bug
		comp[7][13] = 2;//Fght-Rock
		comp[7][14] = 0;//Fght-Ghst
		comp[7][15] = 1;//Fght-Drg
		comp[7][16] = 2;//Fght-Drk
		comp[7][17] = 2;//Fght-Stl
	
		//Poison
		comp[8][1] = 1;//Poi-Norm
		comp[8][2] = 1;//Poi-Fire
		comp[8][3] = 1;//Poi-Wtr
		comp[8][4] = 1;//Poi-Elec
		comp[8][5] = 2;//Poi-Grss
		comp[8][6] = 1;//Poi-Ice
		comp[8][7] = 1;//Poi-Fght
		comp[8][8] = .5;//Poi-Poi
		comp[8][9] = .5;//Poi-Grnd
		comp[8][10] = 1;//Poi-Fly
		comp[8][11] = 1;//Poi-Psy
		comp[8][12] = 1;//Poi-Bug
		comp[8][13] = .5;//Poi-Rock
		comp[8][14] = .5;//Poi-Ghst
		comp[8][15] = 1;//Poi-Drg
		comp[8][16] = 1;//Poi-Drk
		comp[8][17] = .5;//Poi-Stl
		
		//Ground
		comp[9][1] = 1;//Grnd-Norm
		comp[9][2] = 2;//Grnd-Fire
		comp[9][3] = 1;//Grnd-Wtr
		comp[9][4] = 2;//Grnd-Elec
		comp[9][5] = .5;//Grnd-Grss
		comp[9][6] = 1;//Grnd-Ice
		comp[9][7] = 1;//Grnd-Fght
		comp[9][8] = 2;//Grnd-Poi
		comp[9][9] = 1;//Grnd-Grnd
		comp[9][10] = 0;//Grnd-Fly
		comp[9][11] = 1;//Grnd-Psy
		comp[9][12] = .5;//Grnd-Bug
		comp[9][13] = 2;//Grnd-Rock
		comp[9][14] = 1;//Grnd-Ghst
		comp[9][15] = 1;//Grnd-Drag
		comp[9][16] = 1;//Grnd-Drk
		comp[9][17] = 2;//Grnd-Stl
		
		//Flying
		comp[10][1] = 1;//Fly-Norm
		comp[10][2] = 1;//Fly-Fire
		comp[10][3] = 1;//Fly-Wtr
		comp[10][4] = .5;//Fly-Elec
		comp[10][5] = 2;//Fly-Grss
		comp[10][6] = 1;//Fly-Ice
		comp[10][7] = 2;//Fly-Fght
		comp[10][8] = 1;//Fly-Poi
		comp[10][9] = 1;//Fly-Grnd
		comp[10][10] = 1;//Fly-Fly
		comp[10][11] = 1;//Fly-Psy
		comp[10][12] = 2;//Fly-Bug
		comp[10][13] = .5;//Fly-Rock
		comp[10][14] = 1;//Fly-Ghst
		comp[10][15] = 1;//Fly-Drag
		comp[10][16] = 1;//Fly-Drk
		comp[10][17] = .5;//Fly-Stl
		
		//Psychic
		comp[11][1] = 1;//Psy-Norm
		comp[11][2] = 1;//Psy-Fire
		comp[11][3] = 1;//Psy-Wtr
		comp[11][4] = 1;//Psy-Elec
		comp[11][5] = 1;//Psy-Grss
		comp[11][6] = 1;//Psy-Ice
		comp[11][7] = 2;//Psy-Fght
		comp[11][8] = 2;//Psy-Poi
		comp[11][9] = 1;//Psy-Grnd
		comp[11][10] = 1;//Psy-Fly
		comp[11][11] = .5;//Psy-Psy
		comp[11][12] = 1;//Psy-Bug
		comp[11][13] = 1;//Psy-Rock
		comp[11][14] = 1;//Psy-Ghst
		comp[11][15] = 1;//Psy-Drag
		comp[11][16] = 0;//Psy-Drk
		comp[11][17] = .5;//Psy-Stl
		
		//Bug
		comp[12][1] = 1;//Bug-Norm
		comp[12][2] = .5;//Bug-Fire
		comp[12][3] = 1;//Bug-Wtr
		comp[12][4] = 1;//Bug-Elec
		comp[12][5] = 2;//Bug-Grss
		comp[12][6] = 1;//Bug-Ice
		comp[12][7] = .5;//Bug-Fght
		comp[12][8] = .5;//Bug-Poi
		comp[12][9] = 1;//Bug-Grnd
		comp[12][10] = .5;//Bug-Fly
		comp[12][11] = 2;//Bug-Psy
		comp[12][12] = 1;//Bug-Bug
		comp[12][13] = 1;//Bug-Rock
		comp[12][14] = .5;//Bug-Ghst
		comp[12][15] = 1;//Bug-Drag
		comp[12][16] = 2;//Bug-Drk
		comp[12][17] = .5;//Bug-Stl
		
		//Rock
		comp[13][1] = 1;//Rock-Norm
		comp[13][2] = 2;//Rock-Fire
		comp[13][3] = 1;//Rock-Wtr
		comp[13][4] = 1;//Rock-Elec
		comp[13][5] = 1;//Rock-Grss
		comp[13][6] = 2;//Rock-Ice
		comp[13][7] = .5;//Rock-Fght
		comp[13][8] = 1;//Rock-Poi
		comp[13][9] = .5;//Rock-Grnd
		comp[13][10] = 2;//Rock-Fly
		comp[13][11] = 1;//Rock-Psy
		comp[13][12] = 2;//Rock-Bug
		comp[13][13] = 1;//Rock-Rock
		comp[13][14] = 1;//Rock-Ghst
		comp[13][15] = 1;//Rock-Drag
		comp[13][16] = 1;//Rock-Drk
		comp[13][17] = .5;//Rock-Stl
		
		//Ghost
		comp[14][1] = 0;//Ghst-Norm
		comp[14][2] = 1;//Ghst-Fire
		comp[14][3] = 1;//Ghst-Wtr
		comp[14][4] = 1;//Ghst-Elec
		comp[14][5] = 1;//Ghst-Grss
		comp[14][6] = 1;//Ghst-Ice
		comp[14][7] = 1;//Ghst-Fght
		comp[14][8] = 1;//Ghst-Poi
		comp[14][9] = 1;//Ghst-Grnd
		comp[14][10] = 1;//Ghst-Fly
		comp[14][11] = 2;//Ghst-Psy
		comp[14][12] = 1;//Ghst-Bug
		comp[14][13] = 1;//Ghst-Rock
		comp[14][14] = 2;//Ghst-Ghst
		comp[14][15] = 1;//Ghst-Drag
		comp[14][16] = .5;//Ghst-Drk
		comp[14][17] = .5;//Ghst-Stl
		
		//Dragon
		comp[15][1] = 1;//Drag-Norm
		comp[15][2] = 1;//Drag-Fire
		comp[15][3] = 1;//Drag-Wtr
		comp[15][4] = 1;//Drag-Elec
		comp[15][5] = 1;//Drag-Grss
		comp[15][6] = 1;//Drag-Ice
		comp[15][7] = 1;//Drag-Fght
		comp[15][8] = 1;//Drag-Poi
		comp[15][9] = 1;//Drag-Grnd
		comp[15][10] = 1;//Drag-Fly
		comp[15][11] = 1;//Drag-Psy
		comp[15][12] = 1;//Drag-Bug
		comp[15][13] = 1;//Drag-Rock
		comp[15][14] = 1;//Drag-Ghst
		comp[15][15] = 2;//Drag-Drag
		comp[15][16] = 1;//Drag-Drk
		comp[15][17] = .5;//Drag-Stl
		
		//Dark
		comp[16][1] = 1;//Drk-Norm
		comp[16][2] = 1;//Drk-Fire
		comp[16][3] = 1;//Drk-Wtr
		comp[16][4] = 1;//Drk-Elec
		comp[16][5] = 1;//Drk-Grss
		comp[16][6] = 1;//Drk-Ice
		comp[16][7] = .5;//Drk-Fght
		comp[16][8] = 1;//Drk-Poi
		comp[16][9] = 1;//Drk-Grnd
		comp[16][10] = 1;//Drk-Fly
		comp[16][11] = 2;//Drk-Psy
		comp[16][12] = 1;//Drk-Bug
		comp[16][13] = 1;//Drk-Rock
		comp[16][14] = 2;//Drk-Ghst
		comp[16][15] = 1;//Drk-Drag
		comp[16][16] = .5;//Drk-Drk
		comp[16][17] = .5;//Drk-Stl
		
		//Steel
		comp[17][1] = 1;//Stl-Norm
		comp[17][2] = .5;//Stl-Fire
		comp[17][3] = .5;//Stl-Wtr
		comp[17][4] = .5;//Stl-Elec
		comp[17][5] = 1;//Stl-Grss
		comp[17][6] = 2;//Stl-Ice
		comp[17][7] = 1;//Stl-Fght
		comp[17][8] = 1;//Stl-Poi
		comp[17][9] = 1;//Stl-Grnd
		comp[17][10] = 1;//Stl-Fly
		comp[17][11] = 1;//Stl-Psy
		comp[17][12] = 1;//Stl-Bug
		comp[17][13] = 2;//Stl-Rock
		comp[17][14] = 1;//Stl-Ghst
		comp[17][15] = 1;//Stl-Drag
		comp[17][16] = 1;//Stl-Drk
		comp[17][17] = .5;//Stl-Stl
		
		return comp[type][attack];
	}
}
