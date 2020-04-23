public class PriseCheckList {
    public static void main(String[] args) {
        Pizza p = new ClassicPizza();

        Pizza ps = new SalamiDecorator(p);
        System.out.println(ps.getPrise());

        Pizza pt = new TunaDecorator(p);
        System.out.println(pt.getPrise());

        Pizza psm = new MozzarellaDecorator(new SalamiDecorator(new ClassicPizza()));
        System.out.println(psm.getPrise());


    }
}
