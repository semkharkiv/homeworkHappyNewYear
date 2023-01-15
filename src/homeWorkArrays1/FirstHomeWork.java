package homeWorkArrays1;

import java.util.Arrays;

/*
Создайте массив из 8 случайных целых чисел из интервала [1;50]
     Выведите массив на экран в строку
     Замените каждый элемент с нечётным индексом на ноль
     Снова выведете массив на экран на отдельной строке

 */
public class FirstHomeWork {
    public static void main(String[] args) {
        int [] arr= new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr [i]=(int)(Math.random()*50+1);

        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(i%2==1){
                arr[i]=0;
            }
            System.out.println(i+"-й элемент после преобразования - "+ arr[i]);

        }
    }
}
