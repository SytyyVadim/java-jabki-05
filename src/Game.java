import java.util.Random;

public class Game {
    private int secretNumber;

    public Game() {
        this.secretNumber = new Random().nextInt(100) + 1;
    }

    public String checkGuess(int guess) {
        if (guess < secretNumber) {
            return "Больше";
        } else if (guess > secretNumber) {
            return "Меньше";
        } else {
            return "Угадал";
        }
    }

    public int getSecretNumber() {
        return secretNumber;
    }
}
