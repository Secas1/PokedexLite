package PokemonInfo;

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
    
    public Pokedex()
    {
        this.pokemonList = new ArrayList<>();
        this.abilitiesList  =new ArrayList<>();
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
        for(Ability ability : getAbilitiesList())
        {
            if(ability.getName().equals(abilityName))
            {
                return ability;
            }
        }
        
        return null;
    }
    
    public Pokemon findPokemon(String pokemonName)
    {
        for(Pokemon pokemon : getPokemonList())
        {
            if(pokemon.getName().equals(pokemonName))
            {
                return pokemon;
            }
        }
        
        return null;
    }
    
    private Pokemon findPokemon(int idPokedex)
    {
        for(Pokemon pokemon: getPokemonList())
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
        
        for(Ability ability : getAbilitiesList())
        {
            abilities.append(ability.showInfo());
        }
        
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
}
