package Pokemon;

public class TypeSteel extends Pokemon {
    public TypeSteel(int lvl, String nickName, String ability, String nature) {
        super(lvl, "Steel", nickName, ability, nature);
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
