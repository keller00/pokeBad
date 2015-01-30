//Dayle Chapman 
//Created: 3/12/2012 3:45pm
//Last time edited: 7/12/2012 4:49pm
//Version: 1.0.1

/*Change log
 * V. 1.0.0
 * Added all status effects that will be used
 * v. 1.0.1
 * Added functionality with GlobalStats class
 */
package game;
public class StatusEffects {
	public static void burn(){
		Active.activePkmnStats[1] = (int) (Active.activePkmnStats[1] * .5);
		Active.activePkmnStats[0] -= Active.activePkmnStats[6] * (1/8); 
	}
	public static boolean para(int dmg){
		Active.activePkmnStats[5] = (int) (Active.activePkmnStats[5] * 0.25);
		int rnd = (int)((100 - 1 + 1) * Math.random() + 1);
		if (rnd <= 25){
			BattleSim.dmg = 0;
			return true;
		}
		return false;
	}
	public static void frzn(int dmg){
		int rnd = (int)((100 - 1 + 1) * Math.random() + 1);
		if (rnd <= 20){
			Active.activePkmnStats[7] = 0;
		}
		else{
			dmg = 0;
		}
	}
	public static void slp(int dmg){
		dmg = 0;
	}
	public static void pois(int hp, int max){
		Active.activePkmnStats[0] -= Active.activePkmnStats[6] * (1/8);
	}
	public static boolean infat(int hp, int dmg){
		int rnd = (int)((100 - 1 + 1) * Math.random() + 1);
		if (rnd <= 50){
			dmg = 0;
			return true;
		}
		return false;
	}
	public static boolean confu(int dmg){
		int rnd = (int)((100 - 1 + 1) * Math.random() + 1);
		if (rnd <= 50){
			Active.activePkmnStats[0] = Active.activePkmnStats[0] - dmg;
			return true;
		}
		return false;
	}
}
