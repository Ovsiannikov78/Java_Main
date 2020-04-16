import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TasksTests {

    @Test
    public void testStringCheck1(){
        String s1 = "hello";
        String s2 = "ohlle";
        Assert.assertTrue(Tasks.stringCheck(s1,s2));
    }

    @Test
    public void testStringCheck2(){
        String s1 = "hello";
        String s2 = "hillo";
        Assert.assertFalse(Tasks.stringCheck(s1,s2));
    }

   // "-------------------- stringCheck ------------------"

    /* ("hello" -> "ohle") => true
       ("hello" -> "ohlle") => false
       (null  -> "ohlle") => false
       ("hello" -> "ohllert") => false

   */


    @Test
    public void testStringCheck2_1(){
        String s1 = "hello";
        String s2 = "ohle";
        Assert.assertTrue(Task2.stringCheck2(s1,s2));
    }

    @Test
    public void testStringCheck2_2(){
        String s1 = "hello";
        String s2 = "ohlle";
        Assert.assertFalse(Task2.stringCheck2(s1,s2));
    }

    @Test
    public void testStringCheck2_3(){
        String s1 = null;
        String s2 = "ohlle";
        Assert.assertFalse(Task2.stringCheck2(s1,s2));
    }

    @Test
    public void testStringCheck2_4(){
        String s1 = "hello" ;
        String s2 = "ohllert";
        Assert.assertFalse(Task2.stringCheck2(s1,s2));
    }

}
