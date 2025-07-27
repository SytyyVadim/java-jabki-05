import java.util.Random;

public class Game {
    private final int secretNumber;

    public Game() {
        this.secretNumber = new Random().nextInt(101);
    }

    public String checkGuess(int guess) {
        if (guess < this.secretNumber) {
            return "Больше";
        } else if (guess > this.secretNumber) {
            return "Меньше";
        }
        return "Угадал";
    }

    public int getSecretNumber() {
        return secretNumber;
    }
}
