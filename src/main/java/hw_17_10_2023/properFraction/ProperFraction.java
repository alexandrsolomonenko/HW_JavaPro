package hw_17_10_2023.properFraction;

public class ProperFraction {
    private int numerator;
    private int denominator;

    public ProperFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // сокращаем дробь при создании
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProperFraction other = (ProperFraction) obj;
        return this.getNumerator() * other.getDenominator() == this.getDenominator() * other.getNumerator();
    }

    @Override
    public int hashCode() {
        return 31 * (numerator + denominator);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
}
