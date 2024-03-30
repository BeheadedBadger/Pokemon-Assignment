package Pokemon;

public abstract class TypeRock extends Pokemon{
    public TypeRock(int lvl, String nickName, String ability, String nature) {
        super(lvl, "Rock", nickName, ability, nature);
    }

    @Override
    public void Attack() {
        if (getLvl() < 30) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Rock Blast!");
        } else if (getLvl() < 50) {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Rock Tomb!");
        } else {
            System.out.println(getNickName() + " the " + getClass().getSimpleName() + " used Meteor Beam!");
        }
    }
}
