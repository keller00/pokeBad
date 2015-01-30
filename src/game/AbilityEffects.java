//Dayle Chapman
//Created: 3/12/2012 9:50am
//Last time edited: 12/12/2012 10:20am
//Version 1.0.4

/*Change log
 * V. 1.0.0
 * Shit all, made the public void, thats it
 * V. 1.0.1
 * Added drizzle, speed boost, limber and sand veil
 * V. 1.0.2
 * Added a few more abilities that were missing along with a few new ones
 * V. 1.0.3
 * Added functionality with GlobalStats
 * V. 1.0.4
 * Added more abilities to the list
 */
package game;
public class AbilityEffects {
	public static void abilityMods(int move,int oppmove, boolean crit){
		//Drizzle
		if (Active.activePkmnStats[8] == 2){
			BattleSim.weatherstate = 2;
		}
		//Speed Boost
		if (Active.activePkmnStats[8] == 3){
			Active.activePkmnStats[5] = (int) (Active.activePkmnStats[5] * 1.5);
		}
		//Battle Armor
		if(Active.activePkmnStats[8] == 4){
			if (crit == true){
				crit = false;
			}
		}
		//Sturdy
		if(Active.activePkmnStats[8] == 5){
			if (Moves.moves[oppmove][7] == 1){
				Moves.moves[oppmove][7] = 0;
			}
		}
		//Damp
		if(Active.activePkmnStats[8] == 6){
			if(Moves.moves[oppmove][6] == 1){
				BattleSim.oppdmg = 0;
			}
		}
		//Limber
		if (Active.activePkmnStats[8] == 7){
			if (Active.activePkmnStats[7] == 1){
				Active.activePkmnStats[7] = 0;
			}
		}
		//Sand Veil
		if (Active.activePkmnStats[8] == 8){
			if(BattleSim.weatherstate == 4){ 
				Active.activePkmnStats[12] = (int) (Active.activePkmnStats[12] * 1.2);
			}
		}
		//Static
		if (Active.activePkmnStats[8] == 9){
			int rnd = (int)((100 - 1 + 1) * Math.random() + 1);
			if (rnd <= 30 && Active.activeOppStats[7] == 0){
				Active.activeOppStats[7] = 1;
			}
		}
		//Volt Absorb
		if (Active.activePkmnStats[8] == 10){
			if (Moves.moves[oppmove][2] == 4){
				Active.activePkmnStats[0] += .25 * Active.activePkmnStats[6];
			}
		}
		//Water Absorb
		if (Active.activePkmnStats[8] == 11){
			if(Moves.moves[oppmove][2] == 3){
				Active.activePkmnStats[0] += .25 * Active.activePkmnStats[6];
			}
		}
		//Oblivious
		if (Active.activePkmnStats[8] == 12){
			if (Active.activePkmnStats[7] == 6){
				Active.activePkmnStats[7] = 0;
			}
		}
		//Cloud Nine
		if(Active.activePkmnStats[8] == 13){
			if (BattleSim.weatherstate != 0){
				BattleSim.weatherstate = 0;
			}
		}
		//Compound Eyes
		if(Active.activePkmnStats[8] == 14){
			Active.activePkmnStats[11] = (int) (Active.activePkmnStats[11] * 1.3);
		}
		//Insomnia
		if(Active.activePkmnStats[8] == 15){
			if(Active.activePkmnStats[7] == 7){
				Active.activePkmnStats[7] = 0;
			}
		}
		//Colour Change
		if (Active.activePkmnStats[8] == 16){
			Active.activePkmnStats[9] = Moves.moves[oppmove][2];
			Active.activePkmnStats[10] = 0;
		}
		//Immunity
		if (Active.activePkmnStats[8] == 17){
			if(Active.activePkmnStats[7] == 2){
				Active.activePkmnStats[7] = 0;
			}
		}
		//Flash Fire
		if (Active.activePkmnStats[8] == 18){
			if(Moves.moves[oppmove][2] == 2){
				BattleSim.dmg = 0;
				for(int c = 0; c<=4; c++){
					//ADD DMG INCREASE
				}
			}
		}
		//Own Tempo
		if (Active.activePkmnStats[8] == 20){
			if(Active.activePkmnStats[7] == 3){
				Active.activePkmnStats[7] = 0;
			}
		}
		//
	}
}
