/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class Pokemon implements Serializable 
{
    //================================================================================
    // Properties
    //================================================================================
    
    private int idPokedex;
    private String name;
    private int Level;
    
    private boolean pokemonFound;
    
    private Type typeOne;
    private Type typeTwo;
    
    private Ability abilityOne;
    private Ability abilityTwo;
    private Ability abilityThree;
    
    private boolean isLastEvolution;
    private List<Pokemon> pokemonEvolution;
    private String evolutionRequirements;

    
    public enum Type
    {
        Norma,
        Fire,
        Water,
        Grass,
        Electric,
        Ice,
        Fighting,
        Poison,
        Ground,
        Flying,
        Psychic,
        Bug,
        Rock,
        Ghost,
        Dark,
        Dragon,
        Steel,
        Fairy,
        None,
    }

    
    //================================================================================
    // Constructors
    //================================================================================
    
    public Pokemon(int idPokedex, boolean pokemonFound, String name, int level,Type typeOne , Type typeTwo, Ability abilityOne) 
    {
        this(idPokedex, pokemonFound,name, level,typeOne, typeTwo, abilityOne, null, null, true, null, "None");
    }

    public Pokemon(int idPokedex, boolean pokemonFound,String name, int level ,Type typeOne , Type typeTwo, Ability abilityOne, boolean isLastEvolution, Pokemon pokemonEvolution, String evolutionRequirements) 
    {
        this(idPokedex, pokemonFound,name, level, typeOne, typeTwo, abilityOne, null, null, isLastEvolution, pokemonEvolution, evolutionRequirements);
    }

    public Pokemon(int idPokedex, boolean pokemonFound, String name, int level,Type typeOne , Type typeTwo, Ability abilityOne, Ability abilityTwo, boolean isLastEvolution, Pokemon pokemonEvolution, String evolutionRequirements) 
    {
        this(idPokedex, pokemonFound,name, level, typeOne, typeTwo, abilityOne, abilityTwo, null, isLastEvolution,pokemonEvolution,evolutionRequirements);
    }

    public Pokemon(int idPokedex, boolean pokemonFound,String name,int level, Type typeOne , Type typeTwo, Ability abilityOne, Ability abilityTwo, Ability abilityThree, boolean isLastEvolution, Pokemon pokemonEvolution, String evolutionRequirements) 
    {
        this.idPokedex = idPokedex;
        this.pokemonFound = pokemonFound;
        this.name = name;
        this.Level = level;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.abilityOne = abilityOne;
        this.abilityTwo = abilityTwo;
        this.abilityThree = abilityThree;
        this.isLastEvolution = isLastEvolution;
        
        List<Pokemon> evolutions = new ArrayList<>();
        evolutions.add(pokemonEvolution);
        this.pokemonEvolution = evolutions;
        
        this.evolutionRequirements = evolutionRequirements;
    }

    public Pokemon(int idPokedex, String name, int Level, boolean pokemonFound, Type typeOne, Type typeTwo, Ability abilityOne, Ability abilityTwo, Ability abilityThree, boolean isLastEvolution, List<Pokemon> pokemonEvolution, String evolutionRequirements) 
    {
        this.idPokedex = idPokedex;
        this.name = name;
        this.Level = Level;
        this.pokemonFound = pokemonFound;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.abilityOne = abilityOne;
        this.abilityTwo = abilityTwo;
        this.abilityThree = abilityThree;
        this.isLastEvolution = isLastEvolution;
        this.pokemonEvolution = pokemonEvolution;
        this.evolutionRequirements = evolutionRequirements;
    }
    
    
    //================================================================================
    // Accessors
    //================================================================================
    
    public int getIdPokedex() {
        return idPokedex;
    }

    public void setIdPokedex(int idPokedex) {
        this.idPokedex = idPokedex;
    }

    public boolean isPokemonFound() {
        return pokemonFound;
    }

    public void setPokemonFound(boolean pokemonFound) {
        this.pokemonFound = pokemonFound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public Type getTypeOne() {
        return typeOne;
    }

    public void setTypeOne(Type typeOne) {
        this.typeOne = typeOne;
    }

    public Type getTypeTwo() {
        return typeTwo;
    }

    public void setTypeTwo(Type typeTwo) {
        this.typeTwo = typeTwo;
    }
    
    public Ability getAbilityOne() {
        return abilityOne;
    }

    public void setAbilityOne(Ability abilityOne) {
        this.abilityOne = abilityOne;
    }

    public Ability getAbilityTwo() {
        return abilityTwo;
    }

    public void setAbilityTwo(Ability abilityTwo) {
        this.abilityTwo = abilityTwo;
    }

    public Ability getAbilityThree() {
        return abilityThree;
    }

    public void setAbilityThree(Ability abilityThree) {
        this.abilityThree = abilityThree;
    }

    public boolean getIsLastEvolution() {
        return isLastEvolution;
    }

    public void setIsLastEvolution(boolean isLastEvolution) {
        this.isLastEvolution = isLastEvolution;
    }

    public List<Pokemon> getPokemonEvolution() {
        return pokemonEvolution;
    }

    public void setPokemonEvolution(List<Pokemon> pokemonEvolution) {
        this.pokemonEvolution = pokemonEvolution;
    }

    public String getEvolutionRequirements() {
        return evolutionRequirements;
    }

    public void setEvolutionRequirements(String evolutionRequirements) {
        this.evolutionRequirements = evolutionRequirements;
    }

    
    //================================================================================
    // Methods
    //================================================================================
    
    private String showTypes()
    {
        StringBuilder information = new StringBuilder();
        
        if(getTypeOne() == Type.None)
        {
            information.append("Type: ").append(getTypeTwo());
        }
        else if(getTypeTwo() == Type.None)
        {
            information.append("Type: ").append(getTypeOne());
        }
        else if(getTypeOne() != Type.None && getTypeTwo() != Type.None)
        {
            information.append("Types: ").append(getTypeOne()).append(" / ").append(getTypeTwo()) ;
        }
        
        return information.toString();
    }
            
    private String showAbilities()
    {
        StringBuilder information = new StringBuilder();
        
        if(getAbilityOne() == null && getAbilityTwo() == null && getAbilityThree() == null)
        {
            information.append("No abilities");
        }
        else if(getAbilityTwo() == null && getAbilityThree() == null)
        {
            information.append("222222");
            information.append("Ability: ").append(this.getAbilityOne().getName());
        }
        else if(getAbilityThree() == null)
        {
            information.append("Abilities: ").append(getAbilityOne().getName()).append(" - ").append(getAbilityTwo().getName());
        }
        else
        {
            information.append("Abilities: ").append(getAbilityOne().getName()).append(" - ").append(getAbilityTwo().getName()).append(" - ").append(getAbilityThree().getName());
        }
        
        return information.toString();
    }
    
    private String showEvolutions()
    {
        StringBuilder information = new StringBuilder();
        
        if(getIsLastEvolution())
        {
            information.append("This is the last evolution.");
        }
        else
        {
            List<Pokemon> evolutions = getPokemonEvolution();
            
            for(Pokemon pokemon : evolutions)
            {
                information.append("Evolution name: ").append(pokemon.getName());
                information.append(" - ").append(pokemon.showTypes());
                information.append(" - ").append(getEvolutionRequirements());
            }
        }
        
        return information.toString();
    }
    
    public String showInfo()
    {
        StringBuilder information = new StringBuilder();
        information.append("ID Pokedex: ").append(getIdPokedex()).append("\n");
        information.append("Pokemon Name: ").append(getName()).append("\n");
        information.append("Found in level: ").append(getLevel()).append("\n");
        information.append(showTypes()).append("\n");
        information.append(showAbilities()).append("\n");
        information.append(showEvolutions()).append("\n");
        return information.toString();
    }
    
}
