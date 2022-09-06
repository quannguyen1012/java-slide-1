import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter USD: ");
        int users = scanner.nextInt();

        int rate = 23000;

        double convert = users * rate;
        System.out.println(convert);
    }
}
