public class Main {
    public static void main(String[] args) {
        int account = 100;
        int scale = 100;
        int upload = 1400;
        int bonus;

        if (upload > 1000){
            bonus = upload / scale;
        } else {
            bonus = 0;
        }

        int total = account + upload + bonus;

        System.out.println("Счет пополнен на " + upload + " руб.");
        System.out.println("Бонус составил " + bonus + " руб.");
        System.out.println("Баланс " + total + " руб.");
    }
}