import java.util.Scanner;

public class IT24104118Lab5Q1 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        
        System.out.println("Enter the third number: ");
        int num3 = input.nextInt();

        int largest = num1;  
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        int smallest = num1; 
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

    }
}
