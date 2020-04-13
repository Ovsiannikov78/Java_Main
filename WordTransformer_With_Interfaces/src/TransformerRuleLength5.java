public class TransformerRuleLength5 implements TransformerRuleLength {

    @Override
    public boolean check(String input) {
        return input.length() == 5;
    }

    @Override
    public String action(String input) {
        return input.toLowerCase();
    }
}

