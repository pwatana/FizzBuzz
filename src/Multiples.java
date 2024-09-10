public class Multiples {
    public static void main(String[] args) {

        int count = 0;

        // Loop through numbers from 1 to 999
        for (int i = 1; i < 1000; i++) {
            // Call the DOFizzBuzz method for each number
            FizzBuzz.DOFizzBuzz(i);

            // Count if the number is divisible by 3 or 5
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }

        // Print the result
        System.out.println("Number of multiples of 3 or 5 below 1000: " + count);
    }
}
