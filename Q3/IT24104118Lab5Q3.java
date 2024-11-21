import java.util.Scanner;

public class IT24104118Lab5Q3 {
    public static void main(String[] args) {
	
        double roomCharge = 48000.0; 
        double discountRate = 0.0; 
        int numDays; 
        double totalAmount; 

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Start date: ");
        int startDate = input.nextInt();

        System.out.println("Enter End date: ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
        } else {
            numDays = endDate - startDate;

            if (numDays > 3 && numDays <= 4) {
                discountRate = 10.0; 
            } else if (numDays > 4) {
                discountRate = 20.0; 
            }

            totalAmount = numDays * roomCharge;
            totalAmount = totalAmount - (totalAmount * discountRate / 100);

            System.out.println("Number of days reserved: " + numDays);
            System.out.println("Total Amount to be paid: " + totalAmount);
        }

    }
}
