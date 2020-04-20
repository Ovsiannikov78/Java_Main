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
    }

    @Override
    public void doSummer() {

    }

    @Override
    public void doAutumn() {
        setHeight(0);

    }

  /*  @Override
    public String toString() {
        return getClass().getSimpleName() +
                " ------ age : " + getAge() +
                " height : " + growPerSeason() +        // или getHeight() - в зависимости, как трактовать условие задания.
                " .";                                   // Исли нужно вывести высоту цветка как 0, этот метод здесь лишний,
    }   */                                                // так как в class Plants уже есть метод toString().
}
