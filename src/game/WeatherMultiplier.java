//Dayle Chapman
//Created: 30/11/2012 10:39am
//Last time edited: 7/12/2012 4:49pm
//Version 1.1.1

/*Change log
 * V. 1.0.0
 * Added damage multipliers for rain and sun
 * V. 1.1.0
 * Added stat multipliers for sandstorm, wonder room and trick room
 * Added damage over time for sandstorm and hail
 * V. 1.1.1
 * Edited to work with GlobalStats class
 */
package game;
public class WeatherMultiplier {
	/*Conditions
	 * Sunny = 1
	 * Rain = 2
	 * Hail = 3
	 * Sandstorm = 4
	 * Wonder room = 5
	 * Trick room = 6
	 */
	public static double weatherDamageMultiplier(int condition, int attack){
		double multiplier = 0;
		
		//Sunny
		if (condition == 1){
			if (attack == 2){
				multiplier = 1.5;
			}
			else if(attack == 3){
				multiplier = 0.5;
			}
		}
			
		//Rain
		if(condition == 2){
			if(attack == 2){
				multiplier = 0.5;
			}
			else if (attack == 3){
				multiplier = 1.5;
			}
		}
		return multiplier;
	}
	public static int conditionStatModifier(int condition, int type, int SPdef, int def){
		//Sandstorm
		if(condition == 4){
			if(type == 13){
				Active.activePkmnStats[4] *= 1.5;
				return Active.activePkmnStats[4];
			}
		}
		return SPdef;
	}
	public static void roomEffects( int condition){
		//Wonder Room
		if (condition == 5){
			int temp = Active.activePkmnStats[3];
			Active.activePkmnStats[3] = Active.activePkmnStats[4];
			Active.activePkmnStats[4] = temp;
		}
		
		//Trick Room
		if (condition == 6){
			int temp = Active.activePkmnStats[5];
			Active.activePkmnStats[5] = Active.activeOppStats[3];
			Active.activeOppStats[3] = temp;
		}
	}
	public static int weatherDOT(int condition, int type){
		//Sandstorm
		if(condition == 4){
			if(type != 9 && type != 13 && type != 17){
				Active.activePkmnStats[0] = Active.activePkmnStats[0] - ((1 / 16) * Active.activePkmnStats[6]);
			}
		}
		
		//Hail
		if (condition == 3){
			if (type != 6){
				Active.activePkmnStats[0] = Active.activePkmnStats[0] - ((1 / 16) * Active.activePkmnStats[6]);
			}
		}
		return Active.activePkmnStats[0];
	}
}
