import org.junit.Test;

import static org.junit.Assert.*;

public class CustomArrayListTest {

    @Test
    public void testSizeZero() {
        CustomArrayList al = new CustomArrayList();
        assertEquals(0, al.size());
    }

    @Test
    public void testSizeNotZero(){

        int [] ar = {1, 2, 3};
        CustomArrayList<Integer> al = new CustomArrayList<>();

        for(int a:ar) {
            al.append(a);
        }
        assertEquals(3, al.size());
    }

    @Test
    public void appendOneElemTest(){
        CustomArrayList<String> cl = new CustomArrayList<>();
        cl.append("test");
        assertEquals("size",1,cl.size());
    }


    @Test
    public void testGetAll() {
        int [] ar = {1, 2, 3};
        CustomArrayList<Integer> al = new CustomArrayList<>();

        for(int a:ar) {
            al.append(a);
        }

        for(int i = 0; i < ar.length; i++) {
            assertEquals(ar[i], al.get(i).intValue());
        }
    }

    @Test
    public void testRemoveById() {
        String [] input = {"aa", "bb", "cc", "dd"};
        CustomArrayList<String> al = new CustomArrayList<>();

        for(String a:input) {
            al.append(a);
        }
        String expectedDeletedItem = al.removeById(2);
        String [] expected = {"aa", "bb", "dd"};

        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], al.get(i));
        }
        assertEquals(3, al.size());
        assertEquals("cc", expectedDeletedItem);
    }
    @Test
    public void testRemoveByIdIfIdIsWrong() {
        String [] input = {"aa", "bb", "cc", "dd"};
        CustomArrayList<String> al = new CustomArrayList<>();

        for(String a:input) {
            al.append(a);
        }
        String expectedDeletedItem = al.removeById(3);
        String [] expected = {"aa", "bb", "dd"};

        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], al.get(i));
        }
        assertEquals(3, al.size());
        assertEquals("cc", expectedDeletedItem);
    }

    @Test
    public void testRemoveByElement() {
        String [] input = {"aa", "bb", "cc", "dd"};
        CustomArrayList<String> al = new CustomArrayList<>();

        for(String a:input) {
            al.append(a);
        }
        boolean isRemoved = al.removeByElement("cc");
        String [] expected = {"aa", "bb", "dd"};

        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], al.get(i));
        }
        assertEquals(3, al.size());
        assertTrue(isRemoved);
    }
    @Test
    public void testRemoveByElementIfElementIsWrong() {
        String [] input = {"aa", "bb", "cc", "dd"};
        CustomArrayList<String> al = new CustomArrayList<>();

        for(String a:input) {
            al.append(a);
        }
        boolean isRemoved = al.removeByElement("ff");
        String [] expected = {"aa", "bb","cc","dd"};

        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], al.get(i));
        }
        assertEquals(4, al.size());
        assertFalse(isRemoved);
    }
}
