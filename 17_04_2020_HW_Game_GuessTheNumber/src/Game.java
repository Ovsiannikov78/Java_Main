import java.util.Scanner;

public class Game {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        guessTheNumber();
    }
    /*  Task --------- Game-GuessTheNumber
        The user must guess a number in the range 0 and 10.
        The user has 3 attempts. */

    public static void guessTheNumber() {
        System.out.println("Let's start our game. You have 3 attempts.");
        System.out.println("You can enter numbers from 0 to 10.");
        int number = (int) (Math.random() * 10);
        for (int i = 3; i >= 1; i--) {
            System.out.println("-------- Please, enter your number ----------");
            int inputNumber = scanner.nextInt();
            if (inputNumber < 0 || inputNumber > 10) {
                /* Используем i++ при условии,если мы хотим,что-бы введённое поильзователем не правильное число
                 не учитывалось как попытка. И используем break , что-бы при введённом пользователем не правильном
                  числе, осуществлялся выход из программы. И можно начать заново */
                i++;
                // break
                System.out.println(" Wrong number ! You can enter numbers ONLY from 0 to 10 !!! ");
            } else if (inputNumber == number) {
                System.out.println(" You are winner :-) !!!");
                break;
            } else if (i != 1) {
                System.out.println("You didn't guess. You have left " + (i - 1) + " attempt.");
            } else {
                System.out.println("Game over :-( You can try again.");
                break;
            }
        }
        scanner.close();
    }
}






