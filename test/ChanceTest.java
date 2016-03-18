import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class ChanceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void chances_throws_InvalidProbabilityException_when_the_value_is_less_than_zero_or_greater_than_one() throws Exception, InvalidProbabilityException {
        thrown.expectMessage("Expected the value to be greater than zero and less than one");
        Chance.create(1.2);
    }

    @Test
    public void not_subtracts_the_given_chance_from_one() throws Exception, InvalidProbabilityException {
        Chance chance = Chance.create(0.25);
        Chance actualChance = chance.not();
        Chance expectedChance = Chance.create(0.75);
        assertTrue(expectedChance.equals(actualChance));
    }
    @Test
    public void and_multiplies_its_value_with_other_chance_value() throws Exception, InvalidProbabilityException {
        Chance chance1 = Chance.create(0.5);
        Chance chance2 = Chance.create(0.5);
        Chance actualChance = chance1.and(chance2);
        Chance expectedChance = Chance.create(0.25);
        assertTrue(expectedChance.equals(actualChance));
    }
}