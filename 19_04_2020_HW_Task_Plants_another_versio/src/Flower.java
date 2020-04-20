public class Flower extends Plants {

    public Flower(int age, int height) {
        super(age, height);
    }

    private static final int FLOWER_GROWS_PER_SEASON = 10;

    @Override
    public int growPerSeason() {
        return FLOWER_GROWS_PER_SEASON;
    }

    @Override
    public void doSpring() {
        setAge(getAge() + 1);
        setHeight(getHeight() + FLOWER_GROWS_PER_SEASON);
        System.out.println(getClass().getSimpleName() + ". --- In spring --- Height is " + getHeight() + " sm. --- " +
                " Age is " + getAge() + " --- years.");
    }

    @Override
    public void doSummer() {
        System.out.println(getClass().getSimpleName() + ". --- In summer --- Height is " + getHeight() + " sm. --- " +
                " Age is " + getAge() + " --- years.");
    }

    @Override
    public void doAutumn() {
        setAge(0);
        setHeight(0);
        System.out.println(getClass().getSimpleName() + ". --- In fall --- Height is " + getHeight() + " sm. --- " +
                " Age is " + getAge() + " --- years.");


    }
}
