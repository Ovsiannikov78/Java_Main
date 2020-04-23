import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameTest {

    @Test
    public void testGame1(){
        GuessedFromFirstAttemptReader r = new GuessedFromFirstAttemptReader();
        GuessedFromFirstAttemptMessenger m = new GuessedFromFirstAttemptMessenger();
        int attempt = 3;
        int number = 5;

        Game g = new Game(attempt,number,m,r);
        g.play();

        assertTrue(m.isGuessed());
    }

    @Test
    public void testGame2(){
        GuessedFromFirstAttemptReader r = new GuessedFromFirstAttemptReader();
        GuessedFromFirstAttemptMessenger m = new GuessedFromFirstAttemptMessenger();
        int attempt = 3;
        int number = 4;

        Game g = new Game(attempt,number,m,r);
        g.play();

        assertFalse(m.isGuessed());
    }

    @Test
    public void testYouEnteredWrongNumber(){
        /* тест проверял - работает. Для правильной работы нужно в классе Game в методе guessTheNumberWithWhile()
           раздокументировать break. И в классе GuessedFromFirstAttemptReader в методе getInputNumber()
            изменить число в return на число, выходящее за диапазон от 0 до 10.
           Можно ли всё это решить непосредственно в тесте ??? */

        GuessedFromFirstAttemptReader r = new GuessedFromFirstAttemptReader();
        GuessedFromFirstAttemptMessenger m = new GuessedFromFirstAttemptMessenger();
        int attempt = 3;
        int number = 3;

        Game g = new Game(attempt,number,m,r);
        g.play();

        assertFalse(m.isGuessed());
    }
}
