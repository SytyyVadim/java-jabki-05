import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void testSetMoneyValidation() {
        Wallet wallet = new Wallet("Борис", 1000);
        wallet.setMoney(-200);
        Assertions.assertEquals(1000, wallet.getMoney());

        wallet.setMoney(800);
        Assertions.assertEquals(800, wallet.getMoney());
    }

    @Test
    void testGame() {
        Game game = new Game();
        int number = game.getSecretNumber();
        int guessNumber = 50;

        System.out.println("<number>: " + number);
        if (number > guessNumber) {
            Assertions.assertEquals("Больше", game.checkGuess(guessNumber));
        } else if (number < guessNumber) {
            Assertions.assertEquals("Меньше", game.checkGuess(guessNumber));
        } else {
            Assertions.assertEquals("Угадал", game.checkGuess(guessNumber));
        }
    }

    // Проверка метода nextChannel() в пределах диапазона
    @Test
    void testTV() {
        TV tv = new TV();

        tv.setCurrentChannel(30);
        tv.nextChannel();
        Assertions.assertEquals(31, tv.getCurrentChannel());
    }
}