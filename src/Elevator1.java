public class Elevator1 {
    public void  numberOfLifts(int floor, int stepUp, int stepDown) {
        int H=floor;
        int N=stepUp;
        int M=stepDown;
        int lift=1 ;
        for (int i=N-M; i<= 240; i =i+N-M,lift++) {
            System.out.println("Мы на " + i + " этаже " + "Кол-во подъемов- "+ lift);
            if (i+N-M>240){
                lift++;
                System.out.println((i=i+N-M) + " Вышли за пределы H; " + "Кол-во подъемов- "+ lift);
                System.out.println("Кол-во подъемов - "+ lift);
            }
        }
    }
}
