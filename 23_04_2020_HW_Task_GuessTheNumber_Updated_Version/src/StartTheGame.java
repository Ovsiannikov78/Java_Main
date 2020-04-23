public class StartTheGame {
    public static void main(String[] args) {
        Game g = new Game(3,((int) (Math.random() * 10)), new ConsoleGameMessenger(), new ConsoleGameNumberReader());
        g.play();
    }
}