/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import PokedexCore.Pokedex;
import PokemonInfo.Ability;
import DBPokedex.DBPokedex;
import PokemonInfo.Pokemon;
import PokemonInfo.Pokemon.Type;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author Sebastian
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException 
    {
        Pokedex pokedex = new Pokedex();
        pokedex.setAbilitiesList(DBPokedex.loadAbilitiesList());
        pokedex.setPokemonList(DBPokedex.loadPokemonList());
        
        System.out.print(pokedex.showAllPokemon());
        
        //================================================================================
        // Hard coding Abilities Data
        //================================================================================
            
        /*pokedex.addAbility(new Ability("Torrent","Powers up Water-type moves when the Pokémon's HP is low."));
        pokedex.addAbility(new Ability("Rain Dish","The Pokémon gradually regains HP in rain."));
        pokedex.addAbility(new Ability("Overgrow","Powers up Grass-type moves when the Pokémon's HP is low."));
        pokedex.addAbility(new Ability("Chlorophyll","Boosts the Pokémon's Speed stat in harsh sunlight."));
        pokedex.addAbility(new Ability("Blaze","Powers up Fire-type moves when the Pokémon's HP is low."));
        pokedex.addAbility(new Ability("Solar Power","Boosts the Sp. Atk stat in sunny weather, but HP decreases every turn."));
        pokedex.addAbility(new Ability("Shield Dust","Protects the Pokémon from additional effects."));
        pokedex.addAbility(new Ability("Run Away","Enables a sure getaway from wild Pokémon."));
        pokedex.addAbility(new Ability("Shed Skin","The Pokémon may heal its status condition."));
        pokedex.addAbility(new Ability("Compound Eye","Boosts the Pokémon's Accuracy stat."));
        pokedex.addAbility(new Ability("Tinted Lens","The Pokémon can use \"not very effective\" moves to deal regular damage."));
        pokedex.addAbility(new Ability("Swarm","Powers up Bug-type moves when the Pokémon's HP is low."));
        pokedex.addAbility(new Ability("Sniper","Powers up moves if they become critical hits."));
        pokedex.addAbility(new Ability("Keen Eye","The Pokémon's Accuracy stat cannot be lowered by other Pokémon."));
        pokedex.addAbility(new Ability("Tangled Feet","Raises evasion if the Pokémon is confused."));
        pokedex.addAbility(new Ability("Big Pecks","Protects the Pokémon from Defense-lowering effects."));
        pokedex.addAbility(new Ability("Guts","Boosts the Pokémon's Attack stat when it has a status condition."));
        pokedex.addAbility(new Ability("Hustle","Boosts the Pokémon's Attack stat but lowers the Pokémon's Accuracy stat."));
        pokedex.addAbility(new Ability("Intimidate","When the Pokémon enters battle, it lowers opposing Pokémon's Attack stats."));
        pokedex.addAbility(new Ability("Unnerve","Opponents cannot eat Berries."));
        pokedex.addAbility(new Ability("Static","Contact with the Pokémon may paralyze the attacker."));
        pokedex.addAbility(new Ability("Lightning Rod","The Pokémon draws in all Electric-type moves. Instead of receiving damage by Electric-type moves, it boosts the Pokémon's Sp. Atk."));
        pokedex.addAbility(new Ability("Sand Veil","Boosts the Pokémon's Evasion stat in a sandstorm."));
        pokedex.addAbility(new Ability("Sand Rush","Boosts the Pokémon's Speed stat in a sandstorm."));
        pokedex.addAbility(new Ability("Poison Point","Contact with the Pokémon may poison the attacker."));
        pokedex.addAbility(new Ability("Rivalry","Becomes competitive and deals more damage to Pokémon of the same gender, but deals less to Pokémon of the opposite gender."));
        pokedex.addAbility(new Ability("Hustle","Boosts the Pokémon's Attack stat but lowers the Pokémon's Accuracy stat."));
        pokedex.addAbility(new Ability("Sheer Force","Removes additional effects to increase the power of moves when attacking."));
        
        System.out.print(pokedex.showAllAbilities());
        
        //================================================================================
        // Hard coding Pokemon Basic Data
        //================================================================================
        
        pokedex.addPokemon(new Pokemon(1,true,"Bulbasaur",1,Type.Grass,Type.Poison,"Overgrow","Chlorophyll"));
        pokedex.addPokemon(new Pokemon(2,false,"Ivysaur",16,Type.Grass,Type.Poison,"Overgrow","Chlorophyll"));
        pokedex.addPokemon(new Pokemon(3,false,"Venusaur",32,Type.Grass,Type.Poison,"Overgrow","Chlorophyll"));
        pokedex.addPokemon(new Pokemon(4,false,"Charmander",1,Type.Fire,Type.None,"Blaze","Solar Power"));
        pokedex.addPokemon(new Pokemon(5,false,"Charmeleon",16,Type.Fire,Type.None,"Blaze","Solar Power"));
        pokedex.addPokemon(new Pokemon(6,false,"Charizard",36,Type.Fire,Type.None,"Blaze","Solar Power"));
        pokedex.addPokemon(new Pokemon(7,false,"Squirtle",1,Type.Water,Type.None,"Torrent","Rain Dish"));
        pokedex.addPokemon(new Pokemon(8,false,"Wartortle",16,Type.Water,Type.None,"Torrent","Rain Dish"));
        pokedex.addPokemon(new Pokemon(9,false,"Blastoise",32,Type.Water,Type.None,"Torrent","Rain Dish"));
        pokedex.addPokemon(new Pokemon(10,false,"Caterpie",1,Type.Bug,Type.None,"Shield Dust","Run Away"));
        pokedex.addPokemon(new Pokemon(11,false,"Metapod",7,Type.Bug,Type.None,"Shed Skin"));
        pokedex.addPokemon(new Pokemon(12,false,"Butterfree",10,Type.Bug,Type.Flying,"Compound Eye","Tinted Lens"));
        pokedex.addPokemon(new Pokemon(13,false,"Weedle",1,Type.Bug,Type.Poison,"Shield Dust","Run Away"));
        pokedex.addPokemon(new Pokemon(14,false,"Kakuna",7,Type.Bug,Type.Poison,"Shed Skin"));
        pokedex.addPokemon(new Pokemon(15,false,"Beedrill",10,Type.Bug,Type.Poison,"Swarm","Sniper"));
        pokedex.addPokemon(new Pokemon(16,false,"Pidgey",1,Type.Normal,Type.Flying,"Keen Eye","Tangled Feet","Big Pecks"));
        pokedex.addPokemon(new Pokemon(17,false,"Pidgeotto",18,Type.Normal,Type.Flying,"Keen Eye","Tangled Feet","Big Pecks"));
        pokedex.addPokemon(new Pokemon(18,false,"Pidgeot",36,Type.Normal,Type.Flying,"Keen Eye","Tangled Feet","Big Pecks"));
        pokedex.addPokemon(new Pokemon(19,false,"Rattata",1,Type.Normal,Type.None,"Run Away","Guts","Hustle"));
        pokedex.addPokemon(new Pokemon(20,false,"Raticate",20,Type.Normal,Type.None,"Run Away","Guts","Hustle"));
        pokedex.addPokemon(new Pokemon(21,false,"Spearow",1,Type.Normal,Type.Flying,"Keen Eye","Sniper"));
        pokedex.addPokemon(new Pokemon(22,false,"Fearow",20,Type.Normal,Type.Flying,"Keen Eye","Sniper"));
        pokedex.addPokemon(new Pokemon(23,false,"Ekans",1,Type.Poison,Type.None,"Intimidate","Shed Skin","Unnerve"));
        pokedex.addPokemon(new Pokemon(24,false,"Arbok",22,Type.Poison,Type.Poison,"Intimidate","Shed Skin","Unnerve"));
        pokedex.addPokemon(new Pokemon(25,false,"Pichu",1,Type.Electric,Type.None,"Static","Lightning Rod"));
        pokedex.addPokemon(new Pokemon(26,false,"Pikachu",0,Type.Electric,Type.None,"Static","Lightning Rod"));
        pokedex.addPokemon(new Pokemon(27,false,"Raichu",0,Type.Electric,Type.None,"Static","Lightning Rod"));
        pokedex.addPokemon(new Pokemon(28,false,"Sandshrew",1,Type.Ground,Type.None,"Sand Veil","Sand Rush"));
        pokedex.addPokemon(new Pokemon(29,false,"Sandslash",1,Type.Ground,Type.None,"Sand Veil","Sand Rush"));
        pokedex.addPokemon(new Pokemon(30,false,"Nidoran",1,Type.Poison,Type.None,"Poison Point","Rivalry","Hustle"));
        pokedex.addPokemon(new Pokemon(31,false,"Nidorino",16,Type.Poison,Type.None,"Poison Point","Rivalry","Hustle"));
        pokedex.addPokemon(new Pokemon(32,false,"Nidoking",0,Type.Poison,Type.Ground,"Poison Point","Rivalry","Sheer Force"));
        pokedex.addPokemon(new Pokemon(33,false,"Nidorina",16,Type.Poison,Type.Ground,"Poison Point","Rivalry","Sheer Force"));
        pokedex.addPokemon(new Pokemon(34,false,"Nidoqueen",0,Type.Poison,Type.Ground,"Poison Point","Rivalry","Sheer Force"));
        
      
        pokedex.addEvolution("Bulbasaur", "Ivysaur", "Level 16");
        
        pokedex.savePokemons();
        */
        System.out.print(pokedex.showAllPokemon());
        
    }
    
}
