package Pokemon;

import com.sun.source.tree.UsesTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pokemon {
    private int lvl;
    private String element;
    private String nickName;
    private String ability;
    private String nature;
    private boolean canEvolve;

    public Pokemon(int lvl, String element, String nickName, String ability, String nature, boolean canEvolve) {
        this.lvl = lvl;
        this.element = element;
        this.nickName = nickName;
        this.ability = ability;
        this.nature = nature;
        this.canEvolve = canEvolve;
    }

    public int getLvl() {
        return lvl;
    }

    public String getElement() {
        return element;
    }

    public String getNickName() {
        return nickName;
    }

    public String getAbility() {
        return ability;
    }

    public String getNature() {
        return nature;
    }

    public abstract void Attack();

    public void eatRandomItem() {
        List<String> items = Arrays.asList("HP Up", "Protein", "Iron", "Calcium", "Zinc", "Carbos");
        List<String> itemEffects = Arrays.asList("HP", "Attack", "Defence", "Sp. Attack", "Sp. Defence", "Speed");
        int randomNum = (int) (Math.random() * ((5) + 1));

        System.out.println(nickName + " the " + getClass().getSimpleName() + " ate " + items.get(randomNum) + " and raised it's base " + itemEffects.get(randomNum) + "!");
    }

    public void evolve() {
        if (canEvolve) {
            System.out.println("What!? " + nickName + " is evolving!");
        }
        else {
            System.out.println(nickName + " is already fully evolved! It can't evolve again.");
        }
    }
}
