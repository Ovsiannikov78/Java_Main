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
        setAge(getAge() + 1);
        setHeight(getHeight() + growPerSeason());

    }

    @Override
    public void doSummer() {
        setHeight(getHeight() + growPerSeason());
    }

    @Override
    public void doAutumn() {
    }
}
