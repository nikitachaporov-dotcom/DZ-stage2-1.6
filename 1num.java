import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();
            int days;

            switch (month) {
                case 1:  // Я
                case 3:  // М
                case 5:  // М
                case 7:  // И
                case 8:  // А
                case 10: // О
                case 12: // Д
                    days = 31;
                    break;
                case 4:  // А
                case 6:  // И
                case 9:  // С
                case 11: // Н
                    days = 30;
                    break;
                case 2:  // Ф
                    days = 28;
                    break;
                default:
                    days = 0;
                    break;
            }
            
            System.out.println(days);
        }
    }
}
