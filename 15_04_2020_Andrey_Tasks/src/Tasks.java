import java.lang.reflect.Array;
import java.util.Arrays;

public class Tasks {
    public static boolean stringCheck(String s1, String s2) {

        if ((s1 != null) && (s2 != null) && (s1.length() == s2.length())) {
            if (s1.equals(s2)) return true;

            char[] leters1 = s1.toCharArray();
            char[] leters2 = s2.toCharArray();
            Arrays.sort(leters1);
            Arrays.sort(leters2);
            return Arrays.equals(leters1, leters2);

        }
        return false;
    }
}

