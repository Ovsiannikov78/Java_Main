
/*   length == 3 -> toUpperCase
         transform("aaa bcDE eklm iii") => "AAA bcDE eklm III"

     length == 5 -> toLowerCase
         transform("aaa bcdDe eklm IiiPM") => "aaa bcdde eklm iiipm"
*/
public class WordTransformer {

    public static String transform(String input,TransformerRuleLength c){
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(c.check(word)){
                words[i] = c.action(word);
            }
        }
        return String.join(" ",words);
    }
}
