/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e235709;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class HitAndBlowTest {
    @Test
    void testCorrectGuess() {
        HitAndBlow game = new HitAndBlow();
        int[] secretNumber = game.getSecretNumber();
        int[] correctGuess = Arrays.copyOf(secretNumber, secretNumber.length);

        int hits = game.countHits(correctGuess);
        int blows = game.countBlows(correctGuess);

        assertEquals(3, hits);
        assertEquals(0, blows);
    }

    @Test
    void testOneHitGuess() {

        HitAndBlow game = new HitAndBlow();
        int[] secretNumber = game.getSecretNumber();
        int[] oneHitGuess = { secretNumber[0], secretNumber[2], secretNumber[1] };

        int hits = game.countHits(oneHitGuess);
        int blows = game.countBlows(oneHitGuess);

        assertEquals(1, hits);
        assertEquals(2, blows);
    }

}