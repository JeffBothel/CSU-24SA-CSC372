import java.util.Scanner;

public class RecurseTest {
    // This method provides a recusive solution to add numbers together to get a sum
    public static double summater() {
        return summater(0.0);
    }

    public static double summater(double inValue) {
        Scanner input = new Scanner(System.in);
        double total = inValue;
        System.out.print("Enter a number to add to the sum or quit: ");
        String value = input.nextLine();
        switch(value) {
            case "quit":
            case "q":
            case "exit":
            case "":
                return total;
            default:
                total += Double.parseDouble(value);
                System.out.println("The current sum is: " + total);
                return summater(total);
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing the summater() method:");
        System.out.println("Final sum is: " + summater());
    }
}