package game;

public class LevelUp {
	public static void Lvlup(int species){
		int expUntillNextLvl, leftoverexp, attack, defence, spattack, spdefence, hp, speed, attiv, hpiv, defiv, spaiv, spdiv, speeiv, attev, defev, spaev, spdev, speeev, hpev;
		leftoverexp = PartyPokemon.partypkmn[1][9] - PartyPokemon.partypkmn[1][21];
		PartyPokemon.partypkmn[1][9] = leftoverexp;
		expUntillNextLvl = (int) ((Math.pow(PartyPokemon.partypkmn[1][2], 3) * 4) / 5);
		PartyPokemon.partypkmn[1][21] = expUntillNextLvl;
		hpiv = 0;
		hpev = 0;
		attiv = 0;
		attev = 0;
		defiv = 0;
		defev = 0; //<----- Change to pull in iv's and ev's
		spaiv = 0;
		spaev = 0;
		spdiv = 0;
		spdev = 0;
		speeiv = 0;
		speeev = 0;
		hp = (int) (((hpiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(hpev) / 8) + 50) * PartyPokemon.partypkmn[1][2]) / 50) + 10;
		attack = (int) (((attiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(attev) / 8)) * PartyPokemon.partypkmn[1][2]) / 50) + 5;
		defence = (int) (((defiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(defev) / 8)) * PartyPokemon.partypkmn[1][2]) / 50) + 5;
		spattack = (int) (((spaiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(spaev) / 8)) * PartyPokemon.partypkmn[1][2]) / 50) + 5;
		spdefence = (int) (((spdiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(spdev) / 8)) * PartyPokemon.partypkmn[1][2]) / 50) + 5;
		speed = (int) (((speeiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(speeev) / 8)) * PartyPokemon.partypkmn[1][2]) / 50) + 5;
		PartyPokemon.partypkmn[1][3] = hp;
		PartyPokemon.partypkmn[1][5] = attack;
		PartyPokemon.partypkmn[1][6] = defence;
		PartyPokemon.partypkmn[1][7] = spattack;
		PartyPokemon.partypkmn[1][8] = spdefence;
		PartyPokemon.partypkmn[1][16] = speed;
		//Evolution
		if(PartyPokemon.partypkmn[1][2] == PokemonINFO.pokemonStats[PartyPokemon.partypkmn[1][1]][8]){
			PartyPokemon.partypkmn[1][1]++;
		}
	}
	public static void opplvlup(int species){
		int expUntillNextLvl, leftoverexp, attack, defence, spattack, spdefence, hp, speed, attiv, hpiv, defiv, spaiv, spdiv, speeiv, attev, defev, spaev, spdev, speeev, hpev;
		leftoverexp = PartyPokemon.oppParty[1][9] - PartyPokemon.oppParty[1][21];
		PartyPokemon.oppParty[1][9] = leftoverexp;
		expUntillNextLvl = (int) ((Math.pow(PartyPokemon.oppParty[1][2], 3) * 4) / 5);
		PartyPokemon.oppParty[1][21] = expUntillNextLvl;
		hpiv = 1;
		hpev = 1;
		attiv = 1;
		attev = 1;
		defiv = 1;
		defev = 1; //<----- Change to pull in iv's and ev's
		spaiv = 1;
		spaev = 1;
		spdiv = 1;
		spdev = 1;
		speeiv = 1;
		speeev = 1;
		hp = (int) (((hpiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(hpev) / 8) + 50) * PartyPokemon.oppParty[1][2]) / 50) + 10;
		attack = (int) (((attiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(attev) / 8)) * PartyPokemon.oppParty[1][2]) / 50) + 5;
		defence = (int) (((defiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(defev) / 8)) * PartyPokemon.oppParty[1][2]) / 50) + 5;
		spattack = (int) (((spaiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(spaev) / 8)) * PartyPokemon.oppParty[1][2]) / 50) + 5;
		spdefence = (int) (((spdiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(spdev) / 8)) * PartyPokemon.oppParty[1][2]) / 50) + 5;
		speed = (int) (((speeiv + PokemonINFO.pokemonStats[species][0] + (Math.sqrt(speeev) / 8)) * PartyPokemon.oppParty[1][2]) / 50) + 5;
		PartyPokemon.oppParty[1][3] = hp;
		PartyPokemon.oppParty[1][5] = attack;
		PartyPokemon.oppParty[1][6] = defence;
		PartyPokemon.oppParty[1][7] = spattack;
		PartyPokemon.oppParty[1][8] = spdefence;
		PartyPokemon.oppParty[1][16] = speed;
	}
}
