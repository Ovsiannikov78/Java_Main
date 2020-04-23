
public class Main {
    public static void main(String[] args) {
        Plants tree = new Tree(0, 0);
        Plants flower = new Flower(0, 0);

        Plants[] plants = {tree, flower};
        int years = 3;

        growthOverTheNumberOfYears(plants, years);
    }

    public static void growthOverTheNumberOfYears(Plants[] plants, int years) {
        int count = 0;
        for (int i = 0; i < years; i++) {
            count++;
            System.out.println();
            System.out.println("*********** YEAR " + (count) + " . ***********");
            System.out.println();
            for (Plants plant : plants) {
                System.out.println("----- NEXT ------");
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
                System.out.println();
                System.out.println(plant);
                System.out.println();
                }
            }
        }
    }

