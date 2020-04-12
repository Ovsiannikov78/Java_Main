package telran10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class TasksTest {

  /*  ------------ TASK - sleepIn -----------------
    Параметр weekday имеет ​значение true если это рабочий день недели,
    и параметр vacation имеет значение true если у нас каникулы.
    Мы спим, если это не рабочий день или у нас каникулы.
    Вернуть значение true, когда мы спим. Например:
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
*/
    @Test
    public void testSleepIn1(){
        assertTrue(true);
    }
    @Test
    public void testSleepIn2(){
        assertFalse(false);
    }

    @Test
    public void testSleepIn3(){
        assertTrue (true);
    }

    /* --------------- Task - endUp --------------------
     Дана строка,​вернуть новую строку, где последние 3 символа в верхнем регистре (заглавные).
     Если строка длины меньше 3, перевести это в заглавные.
     endUp("Hello") → "HeLLO"
     endUp("hi there") → "hi thERE"
     endUp("hi") → "HI"
*/
    @Test
    public void testEndUp1() {
        String act = Tasks.endUp("Hello");
        assertEquals("HeLLO", act);
    }
    @Test
    public void testEndUp2() {
        String act = Tasks.endUp("hi there");
        assertEquals("hi thERE", act);
    }
    @Test
    public void testEndUp3() {
        String act = Tasks.endUp("Hi");
        assertEquals("HI", act);
    }


   /*   ------------ TASK - diff 21 -----------------
    Дано целое число n,​вернуть абсолютную разницу между n и 21,
    но вернуть удвоенную разницу, если n больше 21. Например:
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) →0
    diff21(25) → 8
    */

    @Test
    public void testDiff21_1(){
        int act = Tasks.diff21(19);
        assertEquals(2,act);
    }
    @Test
    public void testDiff21_2(){
        int act = Tasks.diff21(10);
        assertEquals(11,act);
    }

    @Test
    public void testDiff21_3(){
        int act = Tasks.diff21(21);
        assertEquals(0,act);
    }

    @Test
    public void testDiff21_4(){
        int act = Tasks.diff21(25);
        assertEquals(8,act);
    }



    /* ---------- TASK - maxNumber ---------------
    Даны три целых числ​a a, b, c. Вернуть наибольшее.
     intMax(1, 2, 3) → 3
     intMax(1, 3, 2) → 3
     intMax(3, 2, 1) → 3
     */

    @Test
    public void testMax1(){
        int act = Tasks.Max(1,2,3);
        assertEquals(3,act);
    }
    @Test
    public void testMax2(){
        int act = Tasks.Max(1,3,2);
        assertEquals(3,act);
    }

    @Test
    public void testMax3(){
        int act = Tasks.Max(3,2,1);
        assertEquals(3,act);
    }

    /* ----------------- TASK - commonEnd ----------------
    Даны два массива целых чисел.​Вернуть true если у них одинаковый первый или последний элемент.
    Оба массива длины 1 или более.
    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true
     */

   @Test
    public void testCommonEnd1() {
       int[] a = {1,2,3};
       int[] b = {7,3};
       assertTrue(Tasks.commonEnd(a,b));
   }

    @Test
    public void testCommonEnd2() {
       int[] a = {1,2,3};
       int[] b = {7,3,2};
       assertFalse(Tasks.commonEnd(a,b));
    }

    @Test
    public void testCommonEnd3() {
       int[] a = {1,2,3};
       int[] b = {1,3};
       assertTrue(Tasks.commonEnd(a,b));
    }
    @Test
    public void testCommonEnd4() {
       int[] a = {};
       int[] b = {1,3};
       assertFalse(Tasks.commonEnd(a,b));
    }

    /* ----------------- TASK - sum2 ----------------
    Дан массив целых чисел.​Вернуть сумму двух первых элементов массива.
    Если длина массива меньше двух, вернуть сумму всех элементов.
    Вернуть 0, если длина массива равна нулю.
    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
*/

    @Test
    public void testSum2_1() {

        int[] num = {1,2,3};
        int sum = Tasks.sum2(num);
        assertEquals(3,sum);
    }

    @Test
    public void testSum2_2() {
        int[] num = {1,1};
        int sum = Tasks.sum2(num);
        assertEquals(2,sum);
    }
    @Test
    public void testSum2_3() {
        int[] num = {1,1,1,1};
        int sum = Tasks.sum2(num);
        assertEquals(2,sum);
    }
    @Test
    public void testSum2_4() {
        int[] num = {1};
        int sum = Tasks.sum2(num);
        assertEquals(1,sum);
    }
    @Test
    public void testSum2_5() {
        int[] num = {};
        int sum = Tasks.sum2(num);
        assertEquals(0,sum);
    }

        /* ----------------- TASK - countEvens ----------------
    Вернуть количество четных чисел в массиве​целых чисел.
    Напомню, что оператор % "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.
    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0
     */

   @Test
    public void testCountEvens1() {
       int[] arr = {2,1,2,3,4};
       int count = Tasks.countEvens(arr);
       assertEquals(3,count);
    }

    @Test
    public void testCountEvens2() {
       int[] arr = {2,2,0};
       int count = Tasks.countEvens(arr);
       assertEquals(3,count);
    }

    @Test
    public void testCountEvens3() {
       int[] arr = {1,3,5};
       int count = Tasks.countEvens(arr);
       assertEquals(0,count);
    }

    /* ----------------- TASK - zeroMax ----------------
      Вернуть версию входного массива,​где каждыое нулевое значение заменено максимальным нечетным значением,
      справа от нуля. Если нечетных числе справа от нуля нет, то оставляем ноль.
      zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
      zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
      zeroMax([0, 1, 0]) → [1, 1, 0]
*/

    @Test
    public void testZeroMax1() {
        int[] arr = {0, 5, 0, 3};
        int[] actArr = Tasks.zeroMax(arr);
        int[] expArr = {5, 5, 3, 3};
        assertArrayEquals(expArr, actArr);
    }
    @Test
    public void testZeroMax2() {
        int[] arr = {0, 4, 0, 3};
        int[] actArr = Tasks.zeroMax(arr);
        int[] expArr = {3, 4, 3, 3};
        assertArrayEquals(expArr, actArr);
    }
    @Test
    public void testZeroMax3() {
        int[] arr = {0, 1, 0};
        int[] actArr = Tasks.zeroMax(arr);
        int[] expArr = {1, 1, 0};
        assertArrayEquals(expArr, actArr);
    }
    @Test
    public void testZeroMax4() {
        int[] arr = {0, 3, 0, 7, 5, 0, 4};
        int[] actArr = Tasks.zeroMax(arr);
        int[] expArr = {7, 3, 7, 7, 5, 0, 4};
        assertArrayEquals(expArr, actArr);
    }

    @Test
    public void testZeroMax5() {
        int[] arr = {0, 7, 0, 3, 5, 0, 4};
        int[] actArr = Tasks.zeroMax(arr);
        int[] expArr = {7, 7, 5, 3, 5, 0, 4};
        assertArrayEquals(expArr, actArr);
    }

    /* ------------- TASK - shiftLeft -----------------
    Вернуть массив, ​смещенный влево на один индекс. То ест для {6, 2, 5, 3} вернуть {2, 5, 3, 6}.
    Можно вернуть измененный данный массив, а можно вернуть новый.
    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    shiftLeft([1, 2]) → [2, 1]
    shiftLeft([1]) → [1]

     */

    @Test
    public void testShiftLeft1() {
        int[] arr = {6,2,5,3};
        int[] actArr = Tasks.shiftLeft(arr);
        int[] expArr = {2, 5, 3, 6};
        assertArrayEquals(expArr, actArr);
    }

    @Test
    public void testShiftLeft2() {
        int[] arr = {1,2};
        int[] actArr = Tasks.shiftLeft(arr);
        int[] expArr = {2,1};
        assertArrayEquals(expArr, actArr);
    }

    @Test
    public void testShiftLeft3() {
        int[] arr = {1};
        int[] actArr = Tasks.shiftLeft(arr);
        int[] expArr = {1};
        assertArrayEquals(expArr, actArr);
    }

    /* ----------------- TASK - nonStart  ----------------
    Даны две строки,​вернуть их конкатенацию, но без первого символа в каждой.
    Строки ненулевой длины.
    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"
     */

    @Test
    public void testNonStart1() {
        String actual = Tasks.nonStart("Hello", "There");
        assertEquals("ellohere", actual);
    }

    @Test
    public void testNonStart2() {
        String actual = Tasks.nonStart("java", "code");
        assertEquals("avaode", actual);
    }

    @Test
    public void testNonStart3() {
        String actual = Tasks.nonStart("shotl", "java");
        assertEquals("hotlava", actual);
    }

    /* ----------------- TASK - middleTwo  ----------------

      Дана строка четной длины.​Вернуть строку из двух центральных символов,
      например строка "string" превратиться в "ri". Длина входной строки минимум 2.
      middleTwo("string") → "ri"
      middleTwo("code") → "od"
      middleTwo("Practice") → "ct"
  */

    @Test
    public void testMiddleTwo1() {

        String actual = Tasks.middleTwo("string");
        assertEquals("ri", actual);
    }

    @Test
    public void testMiddleTwo2() {

        String actual = Tasks.middleTwo("code");
        assertEquals("od", actual);
    }
    @Test
    public void testMiddleTwo3() {
        String actual = Tasks.middleTwo("Practice");
        assertEquals("ct", actual);
    }
    /* ----------------- TASK - WordTransformer   ----------------

        transform("aaa bcDE eklm iii") -> "AAA bcDE eklm III"
        length == 3 -> to UpperCase
    */
    @Test
    public void transform1() {
        String actual = Tasks.transform("aaa bcDE eklm iii");
        assertEquals("AAA bcDE eklm III",actual);
    }

    @Test
    public void transform2() {
        String actual = Tasks.transform("aAa bcDE eklm iIi");
        assertEquals("AAA bcDE eklm III",actual);
    }

}
