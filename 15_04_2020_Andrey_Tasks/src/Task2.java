import java.util.Arrays;

public class Task2 {

      /* ("hello" -> "ohle") => true
       ("hello" -> "ohlle") => false
       (null  -> "ohlle") => false
       ("hello" -> "ohllert") => false
       ("ohlleo" -> "hello") => false
       ("hello" -> "ohlleo") => false
*/


    public static boolean stringCheck2(String s1, String s2) {

        if ((s1 != null) && (s2 != null) && /*(s1.length() == 5) && */Math.abs(s1.length() - s2.length()) == 1) {

            char[] leters1 = s1.toCharArray();
            char[] leters2 = s2.toCharArray();
            Arrays.sort(leters1);
            Arrays.sort(leters2);
            int count = 0;

            for (int i = 0; i < leters1.length; i++) {
                for (int j = 0; j < leters2.length; j++) {
                    if ( leters1[i] != leters2[j]) {
                        count++;
                    }
                }
            }
            return count > 1;
        }
        return false;
    }
}

