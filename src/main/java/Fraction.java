public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;
    public Integer numeratorResult;
    public Integer denominatorResult;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        numeratorResult = (other.getDenominator() * numerator) + (denominator * other.getNumerator());
        denominatorResult = denominator * other.getDenominator();
        return createNormalised(numeratorResult, + denominatorResult);
    }

    @Override
    public IFraction minus(IFraction other) {
        numeratorResult = numerator * other.getDenominator() - other.getNumerator() * denominator;
        denominatorResult = denominator * other.getDenominator();
        return createNormalised(numeratorResult, denominatorResult);
    }

    @Override
    public IFraction times(IFraction other) {
        numeratorResult = numerator * other.getNumerator();
        denominatorResult = denominator * other.getDenominator();
        return createNormalised(numeratorResult, denominatorResult);
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        int numeratorResult = other.getDenominator() * numerator;
        int denominatorResult = denominator * other.getNumerator();
        return createNormalised(numeratorResult, denominatorResult);
    }

    public Fraction createNormalised(Integer numerator, Integer denominator) {
        int gcd = getGcd(numerator, denominator);
        return new Fraction(numerator/gcd, denominator/gcd);
    }

    public int getGcd (Integer numerator, Integer denominator) {
        int gcd = 1;
        for (int num = 1; num <= numerator && num <= denominator; num++) {
            if (numerator % num == 0 && denominator % num == 0) {
                gcd = num;
            }
        }
        return gcd;
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }
}
