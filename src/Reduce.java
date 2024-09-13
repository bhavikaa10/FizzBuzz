public class Reduce {
    public static void main(String[] args) {
        int n = 100;  // Starting number
        int steps = 0;

        // Continue until n becomes 0
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;  // Divide by 2 if even
            } else {
                n -= 1;  // Subtract 1 if odd
            }
            steps++;  // Increment the step count
        }

        // Print the number of steps taken to reach 0
        System.out.println("Steps to reduce 100 to 0: " + steps);
    }

}
