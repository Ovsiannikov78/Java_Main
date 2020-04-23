public class TunaDecorator extends PizzaOptions {

    public final static double TUNA_PRICE = 1.50;

    public TunaDecorator(Pizza pizza){
        super(pizza);

    }
    @Override
    public double getPrise() {
        return super.getPrise() + TUNA_PRICE;
    }

    

    



}
