package PokemonInfo;

import java.io.Serializable;

/**
 *
 * @author Sebastian
 */
public class Ability implements Serializable 
{
    //================================================================================
    // Properties
    //================================================================================
    private String name;
    private String effect;
    
    
    //================================================================================
    // Constructors
    //================================================================================
    
    public Ability(String name)
    {
        this(name,"None");
    }
    
    public Ability(String name,String effect)
    {
        this.name = name;
        this.effect = effect;
    }

    
    //================================================================================
    // Accessors
    //================================================================================
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
    
    
    //================================================================================
    // Methods
    //================================================================================
    
    public void setAll(String name,String effect)
    {
        setName(name);
        setEffect(effect);
    }  
    
    public String showInfo()
    {
        StringBuilder information = new StringBuilder();
        information.append("Name: ").append(getName()).append("\n");
        information.append("Effect: ").append(getEffect()).append("\n\n");
        
        return information.toString();
    }
}
