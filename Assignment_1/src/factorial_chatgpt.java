public class factorial_chatgpt {


        int fact(int num) {
            // Base case: factorial of 0 is 1
            if (num == 0) {
                return 1;
            }
            // Recursive case
            return num * fact(num - 1);
        }

        public static void main(String args[]) {
            factorial_chatgpt factorialCalculator = new factorial_chatgpt();
            int number = 5;  // Change this to test with other numbers
            int result = factorialCalculator.fact(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }


