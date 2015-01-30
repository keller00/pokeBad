//Dayle Chapman 
//Created: 3/12/2012 4:06pm
//Last time edited: 3/12/2012 4:06pm
//Version: 1.0.0

/*Change log
 * V. 1.0.0
 * Added active stat arrays for both opponant and player
 */
package game;
public class Active {
	public static int[] activePkmnStats=new int[13];
	public static int[] activeOppStats=new int[13];
	/* Stats info:
     * [0] = HP
     * [1] = Attack
     * [2] = Special Attack
     * [3] = Defense
     * [4] = Special Defense
     * [5] = Speed
     * [6] = MaxHp
     * [7] = Status
     * [8] = Ability
     * [9] = Type 1
     * [10] = Type 2
     * [11] = Acc
     * [12] = Evade
     */
	public static void activate(){
		for(int c = 1; c <= 12; c++){
			activePkmnStats[c] = 0;
			activeOppStats[c] = 0;
		}
	}
	
}
