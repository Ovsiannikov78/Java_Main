public class TransformerRuleLength3 implements TransformerRuleLength {


    @Override
    public boolean check(String input){
        return input.length() == 3;
    }
    @Override
    public String action(String input){
        return input.toUpperCase();
    }



}
