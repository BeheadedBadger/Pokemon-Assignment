package Pokemon;

public abstract class TypeDark extends Pokemon{

    public TypeDark(int lvl, String nickName, String ability, String nature) {
        super(lvl, "Dark", nickName, ability, nature);
    }

    @Override
    public void Attack() {
        if (getLvl() < 30) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Pursuit!");
        } else if (getLvl() < 50) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Bite!");
        } else {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Foul Play!");
        }
    }
}
