package Pokemon;

public abstract class TypeWater extends Pokemon {
    public TypeWater(int lvl, String nickName, String ability, String nature, Boolean canEvolve) {
        super(lvl, "Water", nickName, ability, nature, canEvolve);
    }

    @Override
    public void Attack() {
        if (getLvl() < 30) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Water Gun!");
        }
        else if (getLvl() < 50) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Surf!");
        }
        else {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Hydro Cannon!");
        }
    }
}


