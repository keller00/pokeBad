//Dayle Chapman 
//Created: 10/12/2012 10:06am
//Last time edited: 12/12/2012 9:35am
//Version: 1.2.0

/*Change log
 * V. 1.0.0
 * Added equation
 * V. 1.1.0
 * Replaced psudo variables with existing variables and added equation for special type moves.
 * V. 1.2.0
 * Added acc, crit, and other calculations
 */
package game;
public class BattleSim {
        public static boolean isHit = true, oppisHit = true;
	public static int dmg;
	public static int oppdmg;
	public static int weatherstate;
	public static boolean isCrit = false, oppisCrit = false;
	public static int oppmove;
	public static int move;
	public static void generateActiveStats(){
		Active.activePkmnStats[0] = PartyPokemon.partypkmn[1][4];
		Active.activePkmnStats[1] = PartyPokemon.partypkmn[1][5];
		Active.activePkmnStats[2] = PartyPokemon.partypkmn[1][7];
		Active.activePkmnStats[3] = PartyPokemon.partypkmn[1][6];
		Active.activePkmnStats[4] = PartyPokemon.partypkmn[1][8];
		Active.activePkmnStats[5] = PartyPokemon.partypkmn[1][16];
		Active.activePkmnStats[6] = PartyPokemon.partypkmn[1][3];
		Active.activePkmnStats[7] = PartyPokemon.partypkmn[1][10];
		Active.activePkmnStats[8] = PartyPokemon.partypkmn[1][17];
		Active.activePkmnStats[9] = PartyPokemon.partypkmn[1][18];
		Active.activePkmnStats[10] = PartyPokemon.partypkmn[1][19];
		Active.activePkmnStats[11] = 1;
		Active.activePkmnStats[12] = 1;
		
		Active.activeOppStats[0] = PartyPokemon.oppParty[1][4];
		Active.activeOppStats[1] = PartyPokemon.oppParty[1][5];
		Active.activeOppStats[2] = PartyPokemon.oppParty[1][7];
		Active.activeOppStats[3] = PartyPokemon.oppParty[1][6];
		Active.activeOppStats[4] = PartyPokemon.oppParty[1][8];
		Active.activeOppStats[5] = PartyPokemon.oppParty[1][16];
		Active.activeOppStats[6] = PartyPokemon.oppParty[1][3];
		Active.activeOppStats[7] = PartyPokemon.oppParty[1][10];
		Active.activeOppStats[8] = PartyPokemon.oppParty[1][17];
		Active.activeOppStats[9] = PartyPokemon.oppParty[1][18];
		Active.activeOppStats[10] = PartyPokemon.oppParty[1][19];
		Active.activeOppStats[11] = 1;
		Active.activeOppStats[12] = 1;
	}
	@SuppressWarnings("unused")
	public static void calculate_dmg(int movenum, int oppmovenum){
		int rnd = (int)((100 - 85 + 1) * Math.random() + 85);
		double drnd = (double)((100 - 1 + 1) * Math.random() + 1);
		
		move = movenum;
		oppmove = oppmovenum;
		
		//Base dmg
		//Player Dmg
		//Player Phys Dmg
		if(Moves.moves[move][3] == 1){
			dmg = (int)(((((2 * PartyPokemon.partypkmn[1][2] / 5 + 2) * Active.activePkmnStats[1] * Moves.moves[move][1] / Active.activeOppStats[3]) / 50) + 2) * Moves.stab(move) * (MoveComparision.moveMultiplier(Moves.moves[move][2], Active.activeOppStats[9]) + MoveComparision.moveMultiplier(Moves.moves[move][2], Active.activeOppStats[10])) * rnd / 100); 
		}
		//Player Sp. Dmg
		else if(Moves.moves[move][3] == 2){
			dmg = (int)(((((2 * PartyPokemon.partypkmn[1][2] / 5 + 2) * Active.activePkmnStats[2] * Moves.moves[move][1] / Active.activeOppStats[4]) / 50) + 2) * Moves.stab(move) * (MoveComparision.moveMultiplier(Moves.moves[move][2], Active.activeOppStats[9]) + MoveComparision.moveMultiplier(Moves.moves[move][2], Active.activeOppStats[10])) * rnd / 100);
		}
		
		//Opp Dmg
		//Opp Phys Dmg
		if(Moves.moves[oppmove][3] == 1){
			oppdmg = (int)(((((2 * PartyPokemon.oppParty[1][2] / 5 + 2) * Active.activeOppStats[1] * Moves.moves[oppmove][1] / Active.activePkmnStats[3]) / 50) + 2) * Moves.stab(oppmove) * (MoveComparision.moveMultiplier(Moves.moves[oppmove][2], Active.activePkmnStats[9]) + MoveComparision.moveMultiplier(Moves.moves[oppmove][2], Active.activePkmnStats[10])) * rnd / 100); 
		}
		//Opp Sp. Dmg
		else if(Moves.moves[oppmove][3] == 2){
			oppdmg = (int)(((((2 * PartyPokemon.oppParty[1][2] / 5 + 2) * Active.activeOppStats[2] * Moves.moves[oppmove][1] / Active.activePkmnStats[4]) / 50) + 2) * Moves.stab(oppmove) * (MoveComparision.moveMultiplier(Moves.moves[oppmove][2], Active.activePkmnStats[9]) + MoveComparision.moveMultiplier(Moves.moves[oppmove][2], Active.activePkmnStats[10])) * rnd / 100);
		}
		
		//Crit calc
		//Player Crit
		drnd = (int)((100 - 1 + 1) * Math.random() + 1);
		if(Moves.moves[move][8] == 1){
			if(drnd <= 6.25){
				isCrit = true;
				dmg *= 2;
			}
		}else if(Moves.moves[move][8] == 2){
			if(drnd <= 12.5){
				isCrit = true;
				dmg *= 2;
			}
		}else if(Moves.moves[move][8] == 3){
			if(drnd <= 25){
				isCrit = true;
				dmg *= 2;
			}
		}
		else if(Moves.moves[move][8] == 4){
			if(drnd <= 33.3){
				isCrit = true;
				dmg *= 2;
			}
		}
		else if(Moves.moves[move][8] == 5){
			if(drnd <= 50){
				isCrit = true;
				dmg *= 2;
			}
		}
		//Opp crit
		rnd = (int)((100 - 1 + 1) * Math.random() + 1);
		if(Moves.moves[oppmove][8] == 1){
			if(drnd <= 6.25){
				oppisCrit = true;
				oppdmg *= 2;
			}
		}else if(Moves.moves[oppmove][8] == 2){
			if(drnd <= 12.5){
				oppisCrit = true;
				oppdmg *= 2;
			}
		}else if(Moves.moves[oppmove][8] == 3){
			if(drnd <= 25){
				oppisCrit = true;
				oppdmg *= 2;
			}
		}
		else if(Moves.moves[oppmove][8] == 4){
			if(drnd <= 33.3){
				oppisCrit = true;
				oppdmg *= 2;
			}
		}
		else if(Moves.moves[oppmove][8] == 5){
			if(drnd <= 50){
				oppisCrit = true;
				oppdmg *= 2;
			}
		}
		
		//Ability Stat Modification
		AbilityEffects.abilityMods(move, oppmove, isCrit);
		
		//Accuracy Check
                isHit=true; oppisHit=true;
		int hit, opphit;
		hit = (Moves.moves[move][5] / 100) * Active.activePkmnStats[11] / Active.activeOppStats[12];
		opphit = (Moves.moves[oppmove][5] / 100) * Active.activeOppStats[11] / Active.activePkmnStats[12];
		drnd = (double)((0.7 - 0 + 1) * Math.random() + 0);
		if(hit < drnd){
			isHit = false;
			dmg = 0;
		}
		drnd = (double)((0.7 - 0 + 1) * Math.random() + 0);
		if(opphit < drnd){
			oppisHit = false;
			oppdmg = 0;
		}
		
		//Speed Check
		boolean first; //true = player, false = opp
		if (Active.activePkmnStats[5] > Active.activeOppStats[5]){
			first = true;
		}
		else{
			first = false;
		}
		//PP usage
		Moves.moves[move][4] --;
		Moves.moves[oppmove][4] --;
		
		//Damage Application
		boolean canSwitch = false;
		if(first == true){
			Active.activeOppStats[0] -= dmg;
			if(Active.activeOppStats[0] <= 0){
				Active.activeOppStats[0] = 0;//KO
				
				double a = 1;
				if(PartyPokemon.oppParty[1][20] == 1){
					a = 1.5;
				}
				//Exp Gain
				int exp;
				exp = (int) ((int)(((a * PokemonINFO.pokemonStats[PartyPokemon.oppParty[1][1]][9] * PartyPokemon.oppParty[1][2]) / 5) * (Math.pow(2 * PartyPokemon.oppParty[1][2] + 10, 2.5) / Math.pow(2 * PartyPokemon.oppParty[1][2], 2.5)) + 1));				
				PartyPokemon.partypkmn[1][9] += exp;
				if(PartyPokemon.partypkmn[1][9] >= PartyPokemon.partypkmn[1][21]){
					PartyPokemon.partypkmn[1][2] ++;
					LevelUp.Lvlup(PartyPokemon.partypkmn[1][1]);
				}
				for(int c = 0; c <= 6; c++){
					if (PartyPokemon.oppParty[c][15] == 0 && PartyPokemon.oppParty[c][10] != 10){
						canSwitch = true;
						SwitchPkmn.oppSwitch();
					}
				}
				if(canSwitch == false){
					if(OppTrainer.opp[1] != 1){
						gVariables.gold += OppTrainer.opp[2];
						if(OppTrainer.opp[1] == 3){
							gVariables.badges ++;
						}
					}
				}
                                try{Thread.sleep(1000);}catch(Exception ex){}
                                isHit=true;
                                oppisHit=true;
                                Main.scene="move";
                                gVariables.opponent=0;
                                gVariables.oplvl=0;
                                dmg=0;
                                oppdmg=0;
			}
			Active.activePkmnStats[0] -= oppdmg;
			if(Active.activePkmnStats[0] <= 0){
				Active.activePkmnStats[0] = 0;//KO			
				for(int c = 0; c <= 6; c++){
					if (PartyPokemon.partypkmn[c][15] == 0 && PartyPokemon.partypkmn[c][10] != 10){
						canSwitch = true;
						//Assign New Pokemon**********
					}
				}
				if(canSwitch == false){
					gVariables.gold -= 500;
				}
			}
		}
		else{
			Active.activePkmnStats[0] -= oppdmg;
			if(Active.activePkmnStats[0] <= 0){
				Active.activePkmnStats[0] = 0;//KO			
				for(int c = 0; c <= 6; c++){
					if (PartyPokemon.partypkmn[c][15] == 0 && PartyPokemon.partypkmn[c][10] != 10){
						canSwitch = true;
						//Assign New Pokemon**********
					}
				}
				if(canSwitch == false){
					gVariables.gold -= 500;
				}
			}
			Active.activeOppStats[0] -= dmg;
			if(Active.activeOppStats[0] <= 0){
				Active.activeOppStats[0] = 0;//KO
				double a = 1;
				if(PartyPokemon.oppParty[1][20] == 1){
					a = 1.5;
				}
				//Exp Gain
				int exp;
				exp = (int) ((int)(((a * PokemonINFO.pokemonStats[PartyPokemon.oppParty[1][1]][9] * PartyPokemon.oppParty[1][2]) / 5) * (Math.pow(2 * PartyPokemon.oppParty[1][2] + 10, 2.5) / Math.pow(2 * PartyPokemon.oppParty[1][2], 2.5)) + 1));				
				PartyPokemon.partypkmn[1][9] += exp;
				if(PartyPokemon.partypkmn[1][9] >= PartyPokemon.partypkmn[1][21]){
					PartyPokemon.partypkmn[1][2] ++;
					LevelUp.Lvlup(PartyPokemon.partypkmn[1][1]);
				}
				for(int c = 0; c <= 6; c++){
					if (PartyPokemon.oppParty[c][15] == 0 && PartyPokemon.oppParty[c][10] != 10){
						canSwitch = true;
						//Assign New Pokemon***********
					}
				}
				if(canSwitch == false){
					if(OppTrainer.opp[1] != 1){
						gVariables.gold += OppTrainer.opp[2];
						if(OppTrainer.opp[1] == 3){
							gVariables.badges ++;
						}
					}
				}
                                try{Thread.sleep(1000);}catch(Exception ex){}
                                isHit=true;
                                oppisHit=true;
                                Main.scene="move";
                                gVariables.opponent=0;
                                gVariables.oplvl=0;
                                dmg=0;
                                oppdmg=0;
			}
		}
	}
}
