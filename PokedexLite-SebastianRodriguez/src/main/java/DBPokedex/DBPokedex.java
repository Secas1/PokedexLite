package DBPokedex;


import PokemonInfo.Ability;
import PokemonInfo.Pokemon;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;
/**
 *
 * @author Sebastian
 */
public class DBPokedex
{
    //================================================================================
    // Methods
    //================================================================================
    
    public static void saveAbilitiesList(List<Ability> abilitiesList) throws FileNotFoundException, IOException
    {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Abilities.txt"))) {
            out.writeObject(abilitiesList);
        }
    }
    
    public static List<Ability> loadAbilitiesList() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("Abilities.txt"));       
        return (List<Ability>) is.readObject();
    }
    
    public static void savePokemonList(List<Pokemon> pokemonList) throws FileNotFoundException, IOException
    {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Pokemon.txt"))) {
            out.writeObject(pokemonList);
        }
    }
    
    public static List<Pokemon> loadPokemonList() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("Pokemon.txt"));       
        return (List<Pokemon>) is.readObject();
    }
}
