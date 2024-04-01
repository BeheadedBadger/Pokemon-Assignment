package Pokemon;

public abstract class TypeNormal extends Pokemon{
    public TypeNormal(int lvl, String nickName, String ability, String nature, Boolean canEvolve) {
        super(lvl, "Normal", nickName, ability, nature, canEvolve);
    }

    @Override
    public void Attack() {
        if (getLvl() < 30) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Scratch!");
        } else if (getLvl() < 50) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Swift!");
        } else {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Hyper Beam!");
        }
    }
}
