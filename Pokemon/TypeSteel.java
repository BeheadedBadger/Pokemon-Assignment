package Pokemon;

public abstract class TypeSteel extends Pokemon {
    public TypeSteel(int lvl, String nickName, String ability, String nature, Boolean canEvolve) {
        super(lvl, "Steel", nickName, ability, nature, canEvolve);
    }

    public void Attack() {
        if (getLvl() < 30) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Bullet Punch!");
        } else if (getLvl() < 50) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Metal Claw!");
        } else {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Iron Tail!");
        }
    }
}
