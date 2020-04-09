package telran10;

import org.junit.Test;

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

   /*
   @Test
    public void testSleepIn1(){
        Tasks c = new Tasks();
        boolean bool = c.sleepIn(false, false);
        assertTrue(bool);
    }
    @Test
    public void testSleepIn2(){
        Tasks c = new Tasks();
        boolean bool = c.sleepIn(true, false);
        assertFalse(bool);
    }

    @Test
    public void testSleepIn3(){
        Tasks c = new Tasks();
        boolean bool = c.sleepIn(false, true);
        assertTrue (bool);
    }    */

    /* --------------- Task - endUp --------------------
     Дана строка,​вернуть новую строку, где последние 3 символа в верхнем регистре (заглавные).
     Если строка длины меньше 3, перевести это в заглавные.
     endUp("Hello") → "HeLLO"
     endUp("hi there") → "hi thERE"
     endUp("hi") → "HI"



    @Test
    public void testEndUp() {
        Tasks c = new Tasks();
        String s = c.endUp("Hello");
        assertEquals("HeLLO", s);
    }  */

   /*   ------------ TASK - diff 21 -----------------
    Дано целое число n,​вернуть абсолютную разницу между n и 21,
    но вернуть удвоенную разницу, если n больше 21. Например:
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) →0
    diff21(25) → 8
    */

 /*   @Test
    public void testDiff21_1(){
        Tasks c = new Tasks();
        int n = c.diff21(19);
         assertEquals(n,21-19);
    }

    @Test
    public void testDiff21_2(){
        Tasks c = new Tasks();
        int n = c.diff21(10);
        assertEquals(n,21-10);
    }

    @Test
    public void testDiff21_3(){
        Tasks c = new Tasks();
        int n = c.diff21(21);
        assertEquals(n,21-21);
    }

    @Test
    public void testDiff21_4(){
        Tasks c = new Tasks();
        int n = c.diff21(25);
        assertEquals(n,Math.abs(21-25)*2);
    }     */

    /* --------------- Task - endUp --------------------
     Дана строка,​вернуть новую строку, где последние 3 символа в верхнем регистре (заглавные).
     Если строка длины меньше 3, перевести это в заглавные.
     endUp("Hello") → "HeLLO"
     endUp("hi there") → "hi thERE"
     endUp("hi") → "HI"



    @Test
    public void testEndUp(){

    } */

    /* ---------- TASK - maxNumber ---------------
    Даны три целых числ​a a, b, c. Вернуть наибольшее.
     intMax(1, 2, 3) → 3
     intMax(1, 3, 2) → 3
     intMax(3, 2, 1) → 3
     */

 /*   @Test
    public void testMax1(){
        Tasks c = new Tasks();
        int max = c.Max(1,2,3);
        assertEquals(max,3);
    }
    @Test
    public void testMax2(){
        Tasks c = new Tasks();
        int max = c.Max(1,3,2);
        assertEquals(max,3);
    }

    @Test
    public void testMax3(){
        Tasks c = new Tasks();
        int max = c.Max(3,2,1);
        assertEquals(max,3);
    }   */

    /* ----------------- TASK - commonEnd ----------------
    Даны два массива целых чисел.​Вернуть true если у них одинаковый первый или последний элемент.
    Оба массива длины 1 или более.
    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true
     */

  /* @Test
    public void testCommonEnd1() {
        Tasks c = new Tasks();
        int[] a = {1,2,3};
        int[] b = {7,3};
        //boolean bool = c.commonEnd(a,b);
        assertTrue(c.commonEnd(a,b));
   }

    @Test
    public void testCommonEnd2() {
        Tasks c = new Tasks();
        int[] a = {1,2,3};
        int[] b = {7,3,2};
        //boolean bool = c.commonEnd(a,b);
        assertFalse(c.commonEnd(a,b));
    }

    @Test
    public void testCommonEnd3() {
        Tasks c = new Tasks();
        int[] a = {1,2,3};
        int[] b = {1,3};
        //boolean bool = c.commonEnd(a,b);
        assertTrue(c.commonEnd(a,b));
    }
    @Test
    public void testCommonEnd4() {
        Tasks c = new Tasks();
        int[] a = {};
        int[] b = {1,3};
        //boolean bool = c.commonEnd(a,b);
        assertFalse(c.commonEnd(a,b));
    }  */

    /* ----------------- TASK - sum2 ----------------
    Дан массив целых чисел.​Вернуть сумму двух первых элементов массива.
    Если длина массива меньше двух, вернуть сумму всех элементов.
    Вернуть 0, если длина массива равна нулю.
    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
*/

  /*  @Test
    public void testSum2_1() {
        Tasks c = new Tasks();
        int[] num = {1,2,3};
        int sum = c.sum2(num);
        assertEquals(3,sum);
    }

    @Test
    public void testSum2_2() {
        Tasks c = new Tasks();
        int[] num = {1,1};
        int sum = c.sum2(num);
        assertEquals(2,sum);
    }
    @Test
    public void testSum2_3() {
        Tasks c = new Tasks();
        int[] num = {1,1,1,1};
        int sum = c.sum2(num);
        assertEquals(2,sum);
    }
    @Test
    public void testSum2_4() {
        Tasks c = new Tasks();
        int[] num = {1};
        int sum = c.sum2(num);
        assertEquals(1,sum);
    } */

        /* ----------------- TASK - countEvens ----------------
    Вернуть количество четных чисел в массиве​целых чисел.
    Напомню, что оператор % "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.
    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0
     */

 /*   @Test
    public void testCountEvens1() {
        Tasks c = new Tasks();
        int[] arr = {2,1,2,3,4};
        int count = c.countEvens(arr);
        assertEquals(3,count);
    }

    @Test
    public void testCountEvens2() {
        Tasks c = new Tasks();
        int[] arr = {2,2,0};
        int count = c.countEvens(arr);
        assertEquals(3,count);
    }

    @Test
    public void testCountEvens3() {
        Tasks c = new Tasks();
        int[] arr = {1,3,5};
        int count = c.countEvens(arr);
        assertEquals(0,count);
    } */

    /* ----------------- TASK - zeroMax ----------------
      Вернуть версию входного массива,​где каждыое нулевое значение заменено максимальным нечетным значением,
      справа от нуля. Если нечетных числе справа от нуля нет, то оставляем ноль.
      zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
      zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
      zeroMax([0, 1, 0]) → [1, 1, 0]


    @Test
    public void testZeroMax() {

    }*/

    /* ------------- TASK - shiftLeft -----------------
    Вернуть массив, ​смещенный влево на один индекс. То ест для {6, 2, 5, 3} вернуть {2, 5, 3, 6}.
    Можно вернуть измененный данный массив, а можно вернуть новый.
    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    shiftLeft([1, 2]) → [2, 1]
    shiftLeft([1]) → [1]

     */

  /*  @Test
    public void testShiftLeft1() {
        Tasks c = new Tasks();
        int[] arr = {6,2,5,3};
        int[] newArr = c.shiftLeft(arr);
        assertEquals(newArr, arr);
    }

    @Test
    public void testShiftLeft2() {
        Tasks c = new Tasks();
        int[] arr = {1,2};
        //int[] arr1 = {2,1};    // почему нельзя передать в проверочный метод этот массив вместо newArr как expected елемент???
        int[] newArr = c.shiftLeft(arr);
        assertEquals(newArr, arr);
    }

    @Test
    public void testShiftLeft3() {
        Tasks c = new Tasks();
        int[] arr = {1};
        int[] newArr = c.shiftLeft(arr);
        assertEquals(newArr, arr);
    }  */

    /* ----------------- TASK - nonStart  ----------------
    Даны две строки,​вернуть их конкатенацию, но без первого символа в каждой.
    Строки ненулевой длины.
    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"
     */

 /*   @Test
    public void testNonStart1() {
        Tasks c = new Tasks();
        String s = c.nonStart("Hello", "There");
        assertEquals("ellohere", s);
    }

    @Test
    public void testNonStart2() {
        Tasks c = new Tasks();
        String s = c.nonStart("java", "code");
        assertEquals("avaode", s);
    }

    @Test
    public void testNonStart3() {
        Tasks c = new Tasks();
        String s = c.nonStart("shotl", "java");
        assertEquals("hotlava", s);
    }   */

    /* ----------------- TASK - middleTwo  ----------------

      Дана строка четной длины.​Вернуть строку из двух центральных символов,
      например строка "string" превратиться в "ri". Длина входной строки минимум 2.
      middleTwo("string") → "ri"
      middleTwo("code") → "od"
      middleTwo("Practice") → "ct"
  */

  /*  @Test
    public void testMiddleTwo1() {
        Tasks c = new Tasks();
        String str = c.middleTwo("string");
        assertEquals("ri", str);
    }

    @Test
    public void testMiddleTwo2() {
        Tasks c = new Tasks();
        String str = c.middleTwo("code");
        assertEquals("od", str);
    }
    @Test
    public void testMiddleTwo3() {
        Tasks c = new Tasks();
        String str = c.middleTwo("Practice");
        assertEquals("ct", str);
    }

*/
}
