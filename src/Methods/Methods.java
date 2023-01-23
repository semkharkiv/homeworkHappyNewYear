package Methods;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static int methodScanner(String scannerInput) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(scannerInput);
        return scanner.nextInt();
    }
    public static int methodRandom1_10(){
        Random random= new Random();
        return random.nextInt(1,10);
    }
    public static int methodRandom1_100(){
        Random random= new Random();
        return random.nextInt(1,100);
    }
}

