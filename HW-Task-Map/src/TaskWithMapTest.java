import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskWithMapTest {

    @Test
    public void testTaskWithMap(){
        List<String> strings = Arrays.asList("123","123","567","345","782","345","568","345");

        Map<String,Integer> akt = TaskWithMap.stringsCount(strings);
        Map<String,Integer> exp = new HashMap<>();
        exp.put("123", 2);
        exp.put("567", 1);
        exp.put("345", 3);
        exp.put("782", 1);
        exp.put("568", 1);

        Assert.assertEquals(exp,akt);
    }
}
