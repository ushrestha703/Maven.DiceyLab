//import static org.junit.jupiter.api.Assertions.*;
//
//class DiceTest {
//
//}

import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void diceTest() {
        Integer expected = 5;
        Dice dice = new Dice(expected);
        Assert.assertEquals(dice.getNumberOfDice(), expected);
    }

    @Test
    public void diceTest2() {
        Integer expected = 2;
        Dice dice = new Dice(expected);
        Assert.assertEquals(dice.getNumberOfDice(), expected);
    }

    @Test
    public void tossAndSumTest() {
        Integer numberOfDice = 2;
        Dice newDice = new Dice(2);
        Integer upperRange = numberOfDice * 6;
        Integer actual = newDice.tossAndSum();
        Assert.assertTrue(actual >= numberOfDice && actual <= upperRange);
    }
}