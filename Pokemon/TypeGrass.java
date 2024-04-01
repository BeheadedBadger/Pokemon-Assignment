package Pokemon;

public abstract class TypeGrass extends Pokemon{
    public TypeGrass(int lvl, String nickName, String ability, String nature, Boolean canEvolve) {
        super(lvl, "Grass", nickName, ability, nature, canEvolve);
    }

    @Override
    public void Attack() {
        if (getLvl() < 30) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Absorb!");
        }
        else if (getLvl() < 50) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Razor Leaf!");
        }
        else {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Solar Beam!");
        }
    }
}
