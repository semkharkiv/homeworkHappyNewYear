public class Bank {
    public static void main(String[] args) {
        int x=32;
        int day=0;
        while (x>1){
            int delit=x-1;
            while (x%delit!=0){
                delit--;
            }
            x-=delit;
            day++;

        }
        System.out.println("Сколько дней понадобилось: " + (day+1));

    }
}
