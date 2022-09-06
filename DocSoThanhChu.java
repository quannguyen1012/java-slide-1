import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = scanner.nextInt();



        switch (num / 100){
            case 1:
                System.out.print("one hundred and ");
                break;
            case 2:
                System.out.print("tue hundred and ");
                break;
            case 3:
                System.out.print("three hundred and ");
                break;
            case 4:
                System.out.print("four hundred and ");
                break;
            case 5:
                System.out.print("five hundred and ");
                break;
            case 6:
                System.out.print("six hundred and ");
                break;
            case 7:
                System.out.print("seven hundred and ");
                break;
            case 8:
                System.out.print("eight hundred and ");
                break;
            case 9:
                System.out.print("nice hundred and ");
                break;
        }

        if(num % 100 > 10 && num % 100 < 20){
            switch (num % 100){
                case 11:
                    System.out.print("eleven");
                    break;
                case 12:
                    System.out.print("twelve");
                    break;
                case 13:
                    System.out.print("thirteen");
                    break;
                case 14:
                    System.out.print("fourteen");
                    break;
                case 15:
                    System.out.print("fifteen");
                    break;
                case 16:
                    System.out.print("sixteen");
                    break;
                case 17:
                    System.out.print("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen ");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        }
        else if(num % 100 < 100) {
            switch ((num % 100) / 10) {
                case 1:
                    System.out.print("ten ");
                    break;
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixties ");
                    break;
                case 7:
                    System.out.print("seventies ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print(" nicety");
                    break;
            }

            switch ((num % 100) % 10) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("tue");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.println("eight ");
                    break;
                case 9:
                    System.out.println("nice");
                    break;
            }
        }
    }
}
