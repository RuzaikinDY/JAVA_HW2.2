public class Main {
    public static void main(String[] args) {

        int balance = 100;
        //int topup=100;
        int topup = 1100;
        int newbalance = balance + topup;
        int bonus = newbalance / 100;
        if (newbalance >= 1000) {
            System.out.println("Бонус: " + bonus + " руб.");
            System.out.println("Общий баланс: " + (newbalance + bonus) + " руб.");
        } else {
            System.out.println("Общий баланс" + newbalance + " руб.");
        }


    }
}
