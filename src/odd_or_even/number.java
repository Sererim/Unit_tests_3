package src.odd_or_even;

public class number {
    
    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } 
        else {
            return false;
        }
    }

    // Interval (25; 100).
    public static boolean numberInInterval(int n) {
        boolean in_interval = true;

        if (n <= 25 && n >= 100) {
            in_interval = false;
        }

        return in_interval;

    }
}
