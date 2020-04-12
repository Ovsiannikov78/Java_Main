package telran10;

import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Tasks {
    public static void main(String[] args) {


    }


    /*  ------------ TASK - sleepIn -----------------
    Параметр weekday имеет ​значение true если это рабочий день недели,
    и параметр vacation имеет значение true если у нас каникулы.
    Мы спим, если это не рабочий день или у нас каникулы.
    Вернуть значение true, когда мы спим. Например:
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true

     */

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }


    /*  ------------ TASK - diff 21 -----------------
    Дано целое число n,​вернуть абсолютную разницу между n и 21,
    но вернуть удвоенную разницу, если n больше 21. Например:
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
    diff21(25) → 8
    */

    public static int diff21(int n) {
        if (21 >= n) {
            return 21 - n;
        } else {
            return Math.abs((21 - n) * 2);
        }
    }

    /* --------------- Task - endUp --------------------
     Дана строка,​вернуть новую строку, где последние 3 символа в верхнем регистре (заглавные).
     Если строка длины меньше 3, перевести это в заглавные.
     endUp("Hello") → "HeLLO"
     endUp("hi there") → "hi thERE"
     endUp("hi") → "HI"

     */
    public static String endUp(String str) {
        if (str.length() > 2) {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        } else {
            return str.toUpperCase();
        }
    }
    /* ---------- TASK - maxNumber ---------------
    Даны три целых числых ​a, b, c, вернуть наибольшее.
     intMax(1, 2, 3) → 3
     intMax(1, 3, 2) → 3
     intMax(3, 2, 1) → 3
     */

    public static int Max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    /* ----------------- TASK - commonEnd ----------------
    Даны два массива целых чисел.​Вернуть true если у них одинаковый первый или последний элемент.
    Оба массива длины 1 или более.
    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true
     */

    public static boolean commonEnd(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1) {
            return ((a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]));
        }  else {
            return false;
        }
    }
    /* ----------------- TASK - sum2 ----------------
    Дан массив целых чисел.​Вернуть сумму двух первых элементов массива.
    Если длина массива меньше двух, вернуть сумму всех элементов.
    Вернуть 0, если длина массива равна нулю.
    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
     */

    public static int sum2(int[] nums) {
        int sum = 0;
        if(nums.length >= 2) {
            return (nums[0] + nums[1]);
        } else if(nums.length == 1) {
            return nums[0];
        }else{
            return sum;
        }
    }
    /* ----------------- TASK - countEvens ----------------
    Вернуть количество четных чисел в массиве​целых чисел.
    Напомню, что оператор % "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.
    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0
     */

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    /* ----------------- TASK - zeroMax ----------------
      Вернуть версию входного массива,​где каждыое нулевое значение заменено максимальным нечетным значением,
      справа от нуля. Если нечетных числе справа от нуля нет, то оставляем ноль.
      zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
      zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
      zeroMax([0, 1, 0]) → [1, 1, 0]
*/
    public static int[] zeroMax(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                temp = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > temp && nums[j] % 2 != 0)
                        temp = nums[j];
                }
                if (temp != 0)
                    nums[i] = temp;
            }
        }
        return nums;
    }


    /* ------------- TASK - shiftLeft -----------------
    Вернуть массив, ​смещенный влево на один индекс. То ест для {6, 2, 5, 3} вернуть {2, 5, 3, 6}.
    Можно вернуть измененный данный массив, а можно вернуть новый.
    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    shiftLeft([1, 2]) → [2, 1]
    shiftLeft([1]) → [1]

     */

    public static int[] shiftLeft(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            nums[i -1] = nums[i];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }




    /* ----------------- TASK - nonStart  ----------------
    Даны две строки,​вернуть их конкатенацию, но без первого символа в каждой.
    Строки ненулевой длины.
    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"
     */

    public static String nonStart(String a, String b) {
        return  (a.substring(1)).concat(b.substring(1));
    }



    /* ----------------- TASK - middleTwo  ----------------

        Дана строка четной длины.​Вернуть строку из двух центральных символов,
        например строка "string" превратиться в "ri". Длина входной строки минимум 2.
        middleTwo("string") → "ri"
        middleTwo("code") → "od"
        middleTwo("Practice") → "ct"
    */
    public static String middleTwo(String str) {
        return (str.substring(((str.length() / 2) -1 ),(str.length() / 2) + 1 ));
    }

    /* ----------------- TASK - WordTransformer   ----------------

        transform("aaa bcDE eklm iii") -> "AAA bcDE eklm III"
        length == 3 -> to UpperCase
    */
    public static String transform(String input) {
        String[] wordsArr = input.split(" ");
        for (int i = 0; i < wordsArr.length; i++) {
            if(wordsArr[i].length() == 3){
                wordsArr[i] = wordsArr[i].toUpperCase();
            }
        }
        return (String.join(" ", wordsArr));
    }
}
