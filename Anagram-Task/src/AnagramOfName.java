import java.util.*;

public class AnagramOfName {
   /*     Анаграмма слова x - слово, по длине равное x и состоящее из таких же букв, что и x.
          Например, слово “vani” является анаграммой слова “ivan”, а слова “naan” и “anan” являются анаграммами слова “anna”.
          Дан словарь, содержащий анаграммы, например ;
          public static String[] list = {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
          Написать функцию, которая по слову из словаря вернет все анаграммы этого слова, которые есть в словаре.
          Например, по слову “ivan” функция вернет
          "ivan" -> {"ivan", "navi", "vani"}
    */
    public static String[] anagrams = {"anna", "ivan", "naan", "vani", "piotr", "nana", "navi"};

    public static void main(String[] args) {
        String name = "ivan";
        System.out.println(getAnagram(name));

    }

    public static List<String> getAnagram(String name){
        return  createAnagramMap(anagrams,name).get(getSortedCharArrayFromString(name));
        }


    private static String getSortedCharArrayFromString(String string) {
        char[] charArr = string.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    private static Map<String,List<String>> createAnagramMap(String[] anagrams, String name) {
        List<String> anagramList = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap();
        for (String str : anagrams) {
            if (getSortedCharArrayFromString(str).equals(getSortedCharArrayFromString(name))) {
                anagramList.add(str);
            }
        }
        anagramMap.put(getSortedCharArrayFromString(name), anagramList);
        return anagramMap;
    }
}







