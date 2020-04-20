public class Tree extends Plants {


    public Tree(int age, int height) {
        super(age, height);
    }

    private static final int TREE_GROWS_PER_SEASON = 2;

    @Override
    public int growPerSeason() {
        return TREE_GROWS_PER_SEASON;
    }

    @Override
    public void doSpring() {
        setAge(getAge() +1);
        setHeight(getHeight() + growPerSeason());
        System.out.println(getClass().getSimpleName() + ". --- In spring --- Height is " + getHeight() + " sm. --- " +
                " Age is " + getAge() + " --- years.");

    }

    @Override
    public void doSummer() {
        setHeight(getHeight() + growPerSeason());
        System.out.println(getClass().getSimpleName() + ". --- In summer --- Height is " + getHeight() + " sm. --- " +
                " Age is " + getAge() + " --- years.");
    }

    @Override
    public void doAutumn() {
        System.out.println(getClass().getSimpleName() + ". --- In fall --- Height is " + getHeight() + " sm. --- " +
                " Age is " + getAge() + " --- years.");
    }
}

