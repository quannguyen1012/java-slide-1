import java.util.Scanner;

public class tinhNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month that you to count day? ");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.println("The month '2' has 29 or 29 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("the month " + month + "has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("the month " + month + "has 20 days!");

            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
