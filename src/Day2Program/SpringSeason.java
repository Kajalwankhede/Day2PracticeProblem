package Day2Program;

public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day   = Integer.parseInt(args[1]);
        boolean isSpring =  (month == 3 && day <= 20 && day <= 31)
                || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }
}

