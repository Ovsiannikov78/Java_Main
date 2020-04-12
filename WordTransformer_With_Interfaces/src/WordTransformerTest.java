import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordTransformerTest {

    /*   length == 3 -> toUpperCase
         transform("aaa bcDE eklm iii") => "AAA bcDE eklm III"
    */
    @Test
    public void transform1() {
        String actual = WordTransformer.transform("aaa bcDE eklm iii",new TransformerRuleLength3());
        assertEquals("AAA bcDE eklm III",actual);
    }
    /*   length == 5 -> toLowerCase
         transform("aaa bcdDe eklm IiiPM") => "aaa bcdde eklm iiipm"
    */
    @Test
    public void transform2() {
        String actual = WordTransformer.transform("aaa bcdDe eklm IiiPM",new TransformerRuleLength5());
        assertEquals("aaa bcdde eklm iiipm",actual);
    }

}
