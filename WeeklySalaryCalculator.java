import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeeklySalaryCalculator {
    private static int dailyHours[] = new int[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++){
            dailyHours[i] = sc.nextInt();
        }

        System.out.println(calculateWeeklySalary());
    }

    public static int calculateWeeklySalary(){
        int weeklySalary = 0;
        int totalWeekHours = 0;

        // from monday to friday.
        for(int i = 1; i < 6; i++){
            totalWeekHours += dailyHours[i];
            weeklySalary += dailyHours[i] * 100;

            if(dailyHours[i] > 8)
                weeklySalary += (dailyHours[i] - 8) * 15;
        }

        // for sunday, 50 % bonus
        weeklySalary += dailyHours[0] * 150;

        // for saturday 25% bonus
        weeklySalary += dailyHours[6] * 125;

        // 25Rs extra if weekly working hours > 40
        if(totalWeekHours > 40){
            weeklySalary += (totalWeekHours - 40) * 25;
        }

        return weeklySalary;
    }
}
