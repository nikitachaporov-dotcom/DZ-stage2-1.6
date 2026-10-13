import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x == 100) {
            System.out.println("C");
        } else {
            if (x >= 90) {
                System.out.print("XC");
                x -= 90;
            } else if (x >= 50) {
                System.out.print("L");
                x -= 50;
            } else if (x >= 40) {
                System.out.print("XL");
                x -= 40;
            }

            if (x >= 10) {
                int tens = x / 10;
                if (tens == 1) System.out.print("X");
                else if (tens == 2) System.out.print("XX");
                else if (tens == 3) System.out.print("XXX");
                x = x % 10;
            }

            if (x == 9) {
                System.out.print("IX");
            } else if (x >= 5) {
                System.out.print("V");                          //Тяжело...
                x -= 5;
                if (x == 1) System.out.print("I");  
                else if (x == 2) System.out.print("II");
                else if (x == 3) System.out.print("III");
            } else if (x == 4) {
                System.out.print("IV");
            } else {
                if (x == 1) System.out.print("I");
                else if (x == 2) System.out.print("II");
                else if (x == 3) System.out.print("III");
            }
        }
    }
}
