import java.util.Scanner;

public class CanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight, height, bmi;

        System.out.print("Enter weight (kg): ");
        weight = scanner.nextDouble();

        System.out.print("Enter height (meter): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20.2f%s", bmi, " Interpretation\n");

        if(bmi < 18.0) {
            System.out.printf("%.2f%s", bmi, " UnderWeight");
        }else if(bmi < 25.0) {
            System.out.printf("%.2f%s", bmi, " Normal");
        }else if(bmi < 30.0) {
            System.out.printf("%.2f%s", bmi, " OverWeight");
        }else {
            System.out.printf("%.2f%s", bmi, " Obese");
        }
    }
}
