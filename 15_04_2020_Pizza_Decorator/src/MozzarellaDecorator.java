public class MozzarellaDecorator extends PizzaOptions {

    private final static double MOZZARELLA_PRISE = 1.75;

    public MozzarellaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrise() {
        return super.getPrise() + MOZZARELLA_PRISE;
    }
}
