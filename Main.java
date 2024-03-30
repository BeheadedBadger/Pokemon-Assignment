import Pokemon.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        //Pokémon in your box
        Lurantis Sickle = new Lurantis(40, "Sickle", "Leaf Guard", "Modest");
        Lurantis Orchid = new Lurantis(60, "Orchid", "Contrary", "Bold");
        Furret Tube = new Furret(20, "Tube", "Keep eye", "Adamant");
        Furret Furious = new Furret(70, "Furious", "Frisk", "Jolly");
        Mightyena Cronch = new Mightyena(80, "Cronch", "Moxie", "Adamant");
        Kabutops Kaput = new Kabutops(75, "Kaput", "Swift Swim", "Jolly");
        Scizor Machete = new Scizor(50, "Machete", "Light Metal", "Impish");
        Weavile Hacker = new Weavile(80, "Hacker", "Pressure", "Jolly");
        Feraligatr Instigator = new Feraligatr(80, "Instigator", "Sheer Force", "Adamant");

        //Add to team
        List<Pokemon> team = new ArrayList<>();
        addPokemonToTeam(Instigator, team);
        addPokemonToTeam(Machete, team);
        addPokemonToTeam(Hacker, team);
        addPokemonToTeam(Orchid, team);
        addPokemonToTeam(Kaput, team);
        addPokemonToTeam(Cronch, team);
        addPokemonToTeam(Furious, team);

        //Attack
        Instigator.Attack();
        Tube.Attack();
    }

    private static void addPokemonToTeam(Pokemon pokemon, List<Pokemon> team) {
        if (team.size() < 6) {
            team.add(pokemon);
            System.out.println("Added " + pokemon.getNickName() + ", a " + pokemon.getClass().getSimpleName() +
                    ". lvl: " + pokemon.getLvl() + ", nature: " + pokemon.getNature() + ", ability: " + pokemon.getAbility());
        }
        else {
            System.out.println("You can't have more than 6 Pokemon in your team!");
        }
    }
}
