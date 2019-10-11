
import PokemonInfo.Ability;
import PokemonInfo.Pokedex;
import PokemonInfo.Pokemon;
import DBPokedex.DBPokedex;
import PokemonInfo.Pokemon.Type;
import java.io.IOException;
/**
 *
 * @author Sebastian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        Pokedex pokedex = new Pokedex();
        
        pokedex.addAbility(new Ability("Overgrow","Powers up Grass-type moves when the Pokémon's HP is low."));
        pokedex.addAbility(new Ability("Chlorophyll","Boosts the Pokémon's Speed stat in harsh sunlight."));
        
        pokedex.addPokemon(new Pokemon(2,false,"Ivysaur",20,Type.Grass,Type.Poison,pokedex.findAbility("Overgrow")));
        pokedex.addPokemon(new Pokemon(1,true,"Bulbasaur",10,Type.Grass,Type.Poison,pokedex.findAbility("Overgrow"),pokedex.findAbility("Chlorophyll"),false,pokedex.findPokemon("Ivysaur"),"Level 20"));
        
        System.out.print(pokedex.showAllAbilities());
        //System.out.print(pokedex.showAllPokemon());
        
        for(Pokemon pokemon : pokedex.getPokemonList())
        {
           System.out.print(pokemon.showInfo());
        }
        
        DBPokedex.saveAbilitiesList(pokedex.getAbilitiesList());
    }
    
}
