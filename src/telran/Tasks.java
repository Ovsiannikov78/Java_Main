package telran;


import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {

      /*  System.out.println("------------ TASK - sleepIn -----------------");     // НЕ РЕШЕНА !!!



        System.out.println(" ------------ TASK - diff 21 ----------------- ");


        System.out.println(diff21(19));

        //System.out.println(" --------------- Task - endUp  ----------------- ");      // НЕ РЕШЕНА !!!
        //System.out.println(endUp("Hello"));

        System.out.println(" --------------- TASK - maxNumber  ----------------- ");
        System.out.println(Max(1,2,3));

        System.out.println(" --------------- TASK - commonEnd  ----------------- ");
        int[] a = {1,2,3};
        int[] b = {7,3};
        System.out.println(commonEnd(a,b));

        System.out.println(" --------------- TASK - sum2  ----------------- ");
        int[] nums = {1,2,3};
        System.out.println(sum2(nums));

        System.out.println(" --------------- TASK - countEvens  ----------------- ");
        int[] nums = {2, 1, 2, 3, 4};
        System.out.println(countEvens(nums));

        System.out.println(" --------------- TASK - zeroMax  ----------------- ");        // НЕ РЕШЕНА !!!
        int[] nums = {};
        zeroMax(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(sum2(nums));

        System.out.println(" --------------- shiftLeft  ----------------- ");
        int[] nums = {6, 2, 5, 3};
        shiftLeft(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(" --------------- TASK - nonStart  ----------------- ");
        System.out.println(nonStart("Hello", "There"));     */

        System.out.println(" --------------- TASK - nonStart  ----------------- ");
        System.out.println(middleTwo("string"));





    }


    /*  ------------ TASK - sleepIn -----------------
    Параметр weekday имеет​значение true если это рабочий день недели,
    и параметр vacation имеет значение true если у нас каникулы.
    Мы спим, если это не рабочий день или у нас каникулы.                       // НЕ РЕШЕНА !!!
    Вернуть значение true, когда мы спим. Например:
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true

     */




    /*  ------------ TASK - diff 21 -----------------
    Дано целое число n,​вернуть абсолютную разницу между n и 21,
    но вернуть удвоенную разницу, если n больше 21. Например:
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) →
    0 diff21(25) → 8
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

  /*  public static String endUp(String str) {                    // НЕ РЕШЕНА !!!
        if (str.length() >= 3) {
            return str.ch;
        } else {
            return str.toUpperCase();
        }

    } */

    /* ---------- TASK - maxNumber ---------------
    Даны три целых числы​a b c, вернуть наибольшее.
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
        for (int i = 0; i < nums.length - 1; i++) {
            sum = (nums[0] + nums[1]);
            }if(nums.length == 1){
            sum = nums[0];

        }return sum;
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

    /* public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            if((nums[i] == 0) && (nums[i + 1] % 2 != 0) && (nums[i + 1] % 2 != 0) > (nums[i + 2])){          // НЕ РЕШЕНА !!!
                nums[i] = nums[i + 1];
            }
        }
        return nums;
    } */

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
}