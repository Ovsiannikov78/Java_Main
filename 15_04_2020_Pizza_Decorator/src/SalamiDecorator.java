public class SalamiDecorator extends PizzaOptions {

    private final static double SALAMI_PRISE = 1.00;

    public SalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrise() {
        return super.getPrise() + SALAMI_PRISE;
    }




}
