import java.util.Scanner;

public class RecursiveProduct {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Portfolio Project: Recursive Product (Improved Approach) ---");
        System.out.println("This version uses pure recursion without array storage.");
        System.out.println("Enter five numbers to find their product:");

        // The method now manages the count and the multiplication entirely through recursion
        double totalProduct = getNumberAndMultiply(input, 5);

        System.out.println("\nThe final product is: " + totalProduct);
        input.close();
    }

    /**
     * This method removes the need for an array.
     * It recursively prompts the user and carries the multiplication 
     * forward through the call stack.
     */
    public static double getNumberAndMultiply(Scanner sc, int count) {
        // Base Case: When only 1 number is left to collect, return that input
        if (count <= 1) {
            System.out.print("Enter number: ");
            return sc.nextDouble();
        } 
        // Recursive Step: Multiply the current input by the result of the next call
        else {
            System.out.print("Enter number: ");
            double currentNum = sc.nextDouble();
            return currentNum * getNumberAndMultiply(sc, count - 1);
        }
    }
}