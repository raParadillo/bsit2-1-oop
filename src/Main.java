import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int input = scanner.nextInt();


            switch (i) {
                case 1:
                    num1 = input;
                    break;
                case 2:
                    num2 = input;
                    break;
                case 3:
                    num3 = input;
                    break;
                case 4:
                    num4 = input;
                    break;
                case 5:
                    num5 = input;
                    break;
            }
        }

        int total = num1 + num2 + num3 + num4 + num5;
        System.out.println("Total Number: " + total);
    }
}
