package PokedexCore;

import DBPokedex.DBPokedex;
import PokemonInfo.Ability;
import PokemonInfo.Pokemon;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class Pokedex 
{
    //================================================================================
    // Properties
    //================================================================================
    
    private List<Pokemon> pokemonList;
    private List<Ability> abilitiesList;
    
    
    //================================================================================
    // Constructors
    //================================================================================
    
    public Pokedex() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        this.pokemonList = new ArrayList<>();
        this.abilitiesList  = new ArrayList<>();
    }
    
    public Pokedex(List<Pokemon> pokemonList,List<Ability> abilitiesList)
    {
        this.pokemonList = pokemonList;
        this.abilitiesList = abilitiesList;
    }
    
    
    //================================================================================
    // Accessors
    //================================================================================

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public List<Ability> getAbilitiesList() {
        return abilitiesList;
    }

    public void setAbilitiesList(List<Ability> abilitiesList) {
        this.abilitiesList = abilitiesList;
    }
    
    
    //================================================================================
    // Methods
    //================================================================================
    
    public Ability findAbility(String abilityName)
    {
        return findAbilityIn(abilityName,this.getAbilitiesList());
    }
    
    public static Ability findAbilityIn(String abilityName, List<Ability> abilities)
    {
        
        if(!"".equals(abilityName))
        {
            for(Ability ability : abilities)
            {
                if(ability.getName().equals(abilityName))
                {
                    return ability;
                }
            }
        }
        
        return null;
    }
    
    public Pokemon findPokemon(String pokemonName)
    {
        return findPokemonIn(pokemonName,this.getPokemonList());
    }
    
    private Pokemon findPokemon(int idPokedex)
    {
        return findPokemonIn(idPokedex,this.getPokemonList());
    }
    
    public static Pokemon findPokemonIn(String pokemonName, List<Pokemon> pokemonList)
    {
        for(Pokemon pokemon : pokemonList)
        {
            if(pokemon.getName().equals(pokemonName))
            {
                return pokemon;
            }
        }
        
        return null;
    }
    
    public static Pokemon findPokemonIn(int idPokedex, List<Pokemon> pokemonList)
    {
        for(Pokemon pokemon: pokemonList)
        {
            if(pokemon.getIdPokedex() == idPokedex)
            {
                return pokemon;
            }
        }
        return null;
    }
    
    public void addAbility(Ability ability)
    {
        this.abilitiesList.add(ability);
    }
    
    public void addPokemon(Pokemon pokemon)
    {
        this.pokemonList.add(pokemon);
    }
    
    public String showAllAbilities()
    {
        StringBuilder abilities = new StringBuilder();
        
        getAbilitiesList().forEach((ability) -> {
            abilities.append(ability.showInfo());
        });
        
        return abilities.toString();
    }
    
    public String showAllPokemon()
    {
        StringBuilder pokemons = new StringBuilder();
        
        for(Pokemon pokemon : getPokemonList())
        {
            pokemons.append(pokemon.showInfo());
        }
        
        return pokemons.toString();
    }
    
    public int sizePokemonList()
    {
        return this.getPokemonList().size();
    }
    
    public int sizeAbilitiesList()
    {
        return this.getAbilitiesList().size();
    }
    
    public void saveAbilities() throws IOException
    {
        DBPokedex.saveAbilitiesList(this.getAbilitiesList());
    }
    
    public void savePokemons() throws IOException
    {
        DBPokedex.savePokemonList(this.getPokemonList());
    }
    
    public void saveAll() throws IOException
    {
        DBPokedex.saveAbilitiesList(this.getAbilitiesList());
        DBPokedex.savePokemonList(this.getPokemonList());
    }
    
    public void addEvolution(String pokemon, String evolution, String evolutionRequirements)
    {
        Pokemon pokemonFound = this.findPokemon(pokemon);
        Pokemon evolveFound = this.findPokemon(evolution);
        pokemonFound.addEvolution(evolveFound, evolutionRequirements);
    }
    
    public String showInfoOf(String pokemonName)
    {
        return this.findPokemon(pokemonName).showInfo();
    }
}