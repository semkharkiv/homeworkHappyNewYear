package homeWorkHappyNewYear;

public class Weekend {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk;

        if (isWeekend && !isRain) {
            canWalk=true;
            System.out.println(canWalk);
        } else { canWalk=false;
            System.out.println(canWalk);
        }
    }
}
