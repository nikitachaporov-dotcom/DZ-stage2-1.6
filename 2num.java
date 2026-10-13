import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();

        if (month < 1 || month > 12 || day < 1) {
            System.out.println(-1);
            return;
        }

        int maxDaysInMonth = 0;
        int daysBeforeMonth = 0;

        switch (month) {
            case 1:  maxDaysInMonth = 31; daysBeforeMonth = 0;   break;
            case 2:  maxDaysInMonth = 28; daysBeforeMonth = 31;  break;
            case 3:  maxDaysInMonth = 31; daysBeforeMonth = 59;  break;
            case 4:  maxDaysInMonth = 30; daysBeforeMonth = 90;  break;
            case 5:  maxDaysInMonth = 31; daysBeforeMonth = 120; break;
            case 6:  maxDaysInMonth = 30; daysBeforeMonth = 151; break; //<---- на этот участок кода лучше не смотреть больше 10 секунд
            case 7:  maxDaysInMonth = 31; daysBeforeMonth = 181; break;
            case 8:  maxDaysInMonth = 31; daysBeforeMonth = 212; break;
            case 9:  maxDaysInMonth = 30; daysBeforeMonth = 243; break;
            case 10: maxDaysInMonth = 31; daysBeforeMonth = 273; break;
            case 11: maxDaysInMonth = 30; daysBeforeMonth = 304; break;
            case 12: maxDaysInMonth = 31; daysBeforeMonth = 334; break;
        }

        if (day > maxDaysInMonth) {
            System.out.println(-1);
        } else {
            int daysOstalos = daysBeforeMonth + day;
            System.out.println(365 - daysOstalos);
        }
    
    

    }
}
