public class PizzaOptions implements Pizza{

    private final Pizza pizza;

    public PizzaOptions(Pizza pizza){
        this.pizza = pizza;

    }

    @Override
    public double getPrise() {
        return pizza.getPrise();
    }
}
