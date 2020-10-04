package test;

import org.junit.Assert;
import org.junit.Test;

public class TestDivision {

    @Test
    public void testNormalisation() {
        var fraction = TestUtils.createFraction(2, 3);
        var result = fraction.dividedBy(new NotImplementedFraction(2, 3));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 1, result.getDenominator());
    }
}
