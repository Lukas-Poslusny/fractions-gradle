package test;

import org.junit.Assert;
import org.junit.Test;

public class TestMultiplication {

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(6, 4);
        var result = fraction.times(new NotImplementedFraction(2, 4));

        Assert.assertEquals((Integer) 3, result.getNumerator());
        Assert.assertEquals((Integer) 4, result.getDenominator());
    }
}
