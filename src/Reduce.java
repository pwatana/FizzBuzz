public class Reduce {
    public static void main(String[] args) {
        int n = 1000;  // Change this to any number

        // Call the method to process the number
        processNumber(n);
    }

    public static void processNumber(int n) {
        int steps = 0; // To count the number of steps

        // Repeat until n becomes 0
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            steps++;
        }

        // Print the result
        System.out.println("The number of steps: " + steps);
    }
}
