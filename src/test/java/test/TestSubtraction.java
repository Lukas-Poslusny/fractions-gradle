package test;

import org.junit.Assert;
import org.junit.Test;

public class TestSubtraction {

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(7, 5);
        var result = fraction.minus(new NotImplementedFraction(2, 5));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }
}
