//Dayle Chapman
//Created: 14/12/2012 10:13am
//Last time edited: 14/12/2012 10:13am
//Version 1.0.0
package game;
public class SwitchPkmn {
	public static void Switch(int target){
		Active.activePkmnStats[0] = PartyPokemon.partypkmn[target][4];
		Active.activePkmnStats[1] = PartyPokemon.partypkmn[target][5];
		Active.activePkmnStats[2] = PartyPokemon.partypkmn[target][7];
		Active.activePkmnStats[3] = PartyPokemon.partypkmn[target][6];
		Active.activePkmnStats[4] = PartyPokemon.partypkmn[target][8];
		Active.activePkmnStats[5] = PartyPokemon.partypkmn[target][6];
		Active.activePkmnStats[6] = PartyPokemon.partypkmn[target][3];
		Active.activePkmnStats[7] = PartyPokemon.partypkmn[target][10];
		Active.activePkmnStats[8] = PartyPokemon.partypkmn[target][17];
		Active.activePkmnStats[9] = PartyPokemon.partypkmn[target][18];
		Active.activePkmnStats[10] = PartyPokemon.partypkmn[target][19];
		Active.activePkmnStats[11] = 1;
		Active.activePkmnStats[12] = 1;
	}
	public static void oppSwitch(){
		int target = (int)((6 - 2 + 1) * Math.random() + 2);;
		Active.activeOppStats[0] = PartyPokemon.oppParty[target][4];
		Active.activeOppStats[1] = PartyPokemon.oppParty[target][5];
		Active.activeOppStats[2] = PartyPokemon.oppParty[target][7];
		Active.activeOppStats[3] = PartyPokemon.oppParty[target][6];
		Active.activeOppStats[4] = PartyPokemon.oppParty[target][8];
		Active.activeOppStats[5] = PartyPokemon.oppParty[target][16];
		Active.activeOppStats[6] = PartyPokemon.oppParty[target][3];
		Active.activeOppStats[7] = PartyPokemon.oppParty[target][10];
		Active.activeOppStats[8] = PartyPokemon.oppParty[target][17];
		Active.activeOppStats[9] = PartyPokemon.oppParty[target][18];
		Active.activeOppStats[10] = PartyPokemon.oppParty[target][19];
		Active.activeOppStats[11] = 1;
		Active.activeOppStats[12] = 1;
	}
}
