package Pokemon;

import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon {
    private int lvl;
    private String element;
    private String nickName;
    private String ability;
    private String nature;

    public Pokemon(int lvl, String element, String nickName, String ability, String nature) {
        this.lvl = lvl;
        this.element = element;
        this.nickName = nickName;
        this.ability = ability;
        this.nature = nature;
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
}
