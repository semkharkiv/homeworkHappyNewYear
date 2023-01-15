package homeWorkHappyNewYear;

import java.util.Scanner;

public class Temperature {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Назначте давление в колбах-");
        System.out.println("Давление в первой колбе:");
        int Temperature1=scanner.nextInt();
        System.out.println("Давление во второй колбе:");
        int Temperature2=scanner.nextInt();
        boolean result;

        if (Temperature1 > 100 && Temperature2 < 100) {
            result=true;
            System.out.println(result +" Прибор работает корректно!");
        } else { result=false;
            System.out.println(result + " Перегрев или недопустимая температура в колбе!");
        }
    }
}
