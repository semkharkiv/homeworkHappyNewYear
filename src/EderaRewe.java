public class EderaRewe {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy;
        if (isEdekaOpen || isReweOpen) {
            canBuy = true;
            System.out.println("Я могу купить еду,это- " + canBuy);
        }
        else {
            canBuy = false;
            System.out.println(canBuy);
        }
    }
}
