package PokemonInfo;

/**
 *
 * @author Sebastian
 */
public class Ability 
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
    
    private String showInfo()
    {
        StringBuilder information = new StringBuilder();
        information.append("Name: ").append(getName());
        information.append("Effect: ").append(getEffect()).append("\n");
        
        return information.toString();
    }
}
