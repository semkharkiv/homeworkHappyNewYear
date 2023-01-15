package homeWorkArrays1;

import java.util.Arrays;

/*
Создайте массив из 5 случайных целых чисел из интервала [10;99]
    Выведите его на экран в строку.
    Определите и выведите на экран сообщение о том,
    является ли массив строго возрастающей последовательностью. (отредактировано)
 */
public class SecondHomeWork {
    public static void main(String[] args) {
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr [i]=(int)(Math.random()*100)+10;
        }
        System.out.println(Arrays.toString(arr));

        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<=arr[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }

}
