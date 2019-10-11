/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokemonInfo;

/**
 *
 * @author Sebastian
 */
public class Pokemon 
{
    //================================================================================
    // Properties
    //================================================================================
    
    private int idPokedex;
    private String name;
    
    private Type typeOne;
    private Type typeTwo;
    
    private Ability abilityOne;
    private Ability abilityTwo;
    private Ability abilityThree;
    
    private boolean isLastEvolution;
    private Pokemon pokemonEvolution;
    
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
    
    public Pokemon(int idPokedex, String name, Type typeOne , Type typeTwo, Ability abilityOne) 
    {
        this(idPokedex, name, typeOne, typeTwo, abilityOne, null, null, false, null);
    }

    public Pokemon(int idPokedex, String name, Type typeOne , Type typeTwo, Ability abilityOne, boolean isLastEvolution, Pokemon pokemonEvolution) 
    {
        this(idPokedex,name, typeOne, typeTwo,abilityOne, null, null, isLastEvolution, pokemonEvolution);
    }

    public Pokemon(int idPokedex, String name, Type typeOne , Type typeTwo, Ability abilityOne, Ability abilityTwo, boolean isLastEvolution, Pokemon pokemonEvolution) 
    {
        this(idPokedex,name, typeOne, typeTwo, abilityOne, abilityTwo, null, isLastEvolution,pokemonEvolution);
    }

    public Pokemon(int idPokedex, String name, Type typeOne , Type typeTwo, Ability abilityOne, Ability abilityTwo, Ability abilityThree, boolean isLastEvolution, Pokemon pokemonEvolution) 
    {
        this.idPokedex = idPokedex;
        this.name = name;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.abilityOne = abilityOne;
        this.abilityTwo = abilityTwo;
        this.abilityThree = abilityThree;
        this.isLastEvolution = isLastEvolution;
        this.pokemonEvolution = pokemonEvolution;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isIsLastEvolution() {
        return isLastEvolution;
    }

    public void setIsLastEvolution(boolean isLastEvolution) {
        this.isLastEvolution = isLastEvolution;
    }

    public Pokemon getPokemonEvolution() {
        return pokemonEvolution;
    }

    public void setPokemonEvolution(Pokemon pokemonEvolution) {
        this.pokemonEvolution = pokemonEvolution;
    }
    
    
    //================================================================================
    // Methods
    //================================================================================
    
    
    
}
