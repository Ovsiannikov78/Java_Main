public abstract class Plants {

    private int age;
    private int height;


    public Plants(int age, int height) {
        this.age = age;
        this.height = height;

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void doSpring() {
        setAge(getAge() + 1);
        //System.out.println("We are planted " + getClass().getSimpleName() + " ." + "Its height is " + getHeight());
        setHeight(getHeight() + growPerSeason());
        //System.out.println(getClass().getSimpleName() + "grew by " + getHeight() + " during the season.");
    }
    public abstract void doSummer();

    public abstract void doAutumn();

    public void doWinter(){}

    public abstract int growPerSeason();


    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " ------ age : " + age +
                " height : " + height +
                " .";
    }
}
