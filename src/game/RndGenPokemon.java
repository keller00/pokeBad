package game;
public class RndGenPokemon {
	public static void RndGenPokemon() {
            PartyPokemon.oppParty[1][2] = gVariables.oplvl;
		for(int c = 1;c < gVariables.oplvl; c++){
                    PartyPokemon.oppParty[1][2] = c;
			LevelUp.opplvlup(gVariables.opponent);
		}
                PartyPokemon.oppParty[1][4] = PartyPokemon.oppParty[1][3];
	}
}
