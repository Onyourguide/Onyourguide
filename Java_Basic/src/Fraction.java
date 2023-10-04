public class Fraction {
    // Attributes
    int topN; // Numerator
    int btmN; // Denominator

    // Constructor
    public Fraction(int numerator, int denominator) {
        topN = numerator;
        btmN = denominator;
    }

    // Method to return the fraction as a string
    public String toFraction() {
        return topN + "/" + btmN;
    }

    // Method to return the fraction as a floating-point number
    public float toFloat() {
        return (float) topN / btmN;
    }

    // Method to add another fraction to the current fraction
    public void addFraction(Fraction other) {
        int newNumerator = (topN * other.btmN) + (other.topN * btmN);
        int newDenominator = btmN * other.btmN;

        topN = newNumerator;
        btmN = newDenominator;

        LowestTermFrac(); // Convert the fraction to lowest terms
    }

    // Method to compare if two fractions are equal
    public boolean myEquals(Fraction other) {
        this.LowestTermFrac(); // Convert both fractions to lowest terms
        other.LowestTermFrac();
        return this.topN == other.topN && this.btmN == other.btmN;
    }

    // Method to convert the fraction to lowest terms
    public void LowestTermFrac() {
        int gcd = gcd(topN, btmN);
        topN /= gcd;
        btmN /= gcd;
    }

    // Helper method to find the greatest common divisor (GCD)
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}