import java.util.Scanner;

public class IT24104118Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of new members introduced:");
        int numMembers = input.nextInt();

        if (numMembers < 0) {
            System.out.println("Invalid input! Number of new members should be greater than or equal to 0.");
        } else {
            switch (numMembers) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("You are entitled to a Pen");
                    break;
                case 2:
                    System.out.println("You are entitled to an Umbrella");
                    break;
                case 3:
                    System.out.println("You are entitled to a Bag");
                    break;
                case 4:
                    System.out.println("You are entitled to a Travelling Chair");
                    break;
                default:
                    System.out.println("You are entitled to a Headphone");
            }
        }
    }
}
