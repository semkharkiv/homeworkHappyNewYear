package homeWorkHappyNewYear;

import java.util.Random;

public class WorkTIme {
    static Random r = new Random();
    public static void main(String[] args) {
        int low =0;
        int high = 28800;
        int result = r.nextInt(high - low) + low;
        System.out.println("Сколько до конца рабочего времени? " + result + " секунд");

        if  (result > 25200 && result < 28800) {
            System.out.println("До окончания рабочего времени осталось: " + result + " секунд" + " т.е Менее 8 часов");
        }
        else if (result > 21600 && result < 25200) {
            System.out.println("До окончания рабочего времени осталось: " + result + " секунд" + " т.е Менее 7 часов");
        }
        else if (result > 18000 && result < 21600) {
            System.out.println("До окончания рабочего времени осталось: " + result + " секунд" + " т.е Менее 6 часов");
        }
        else if (result > 14400 && result < 18000) {
            System.out.println("До окончания рабочего времени осталось: " + result + " секунд" + " т.е Менее 5 часов");
        }
        else if (result > 10800 && result < 14400) {
            System.out.println("До окончания рабочего времени осталось: " + result + " секунд" + " т.е Менее 4 часов");
        }
        else if (result > 7200 && result < 10800) {
            System.out.println("До окончания рабочего времени осталось: " + result + " секунд" + " т.е Менее 3 часов");
        }
        else if (result > 3600 && result < 7200) {
            System.out.println("До окончания рабочего времени осталось: " + result + " секунд" + " т.е Менее 2 часов");
        }
        else if (result > 0 && result < 3600) {
            System.out.println("До окончания рабочего времени осталось: " + result + " секунд" + " т.е Менее 1 часа");
        }

    }
}
