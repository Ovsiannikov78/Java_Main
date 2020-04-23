
public class Main {
    public static void main(String[] args) {
        Plants tree = new Tree(0, 0);
        Plants flower = new Flower(1, 0);

        Plants[] plants = {tree, flower};
        int years = 3;

        growthOverTheNumberOfYears(plants, years);
    }

    public static void growthOverTheNumberOfYears(Plants[] plants, int years) {
        System.out.println("---------- Plant after " + years + " years ------------");
        for (int i = 0; i < years; i++) {
            for (Plants plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
                if (plant.getAge() == years) {
                    System.out.println(plant);
                }
            }
        }
    }
}





