public class Main {
    public static void main(String[] args) {

        int balance = 436;
        int AmountPlusBalance = 5500;

        int bonus;
        if (AmountPlusBalance > 1000) {
            bonus = (AmountPlusBalance / 100);
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый баланс:");
        System.out.println(balance + AmountPlusBalance + bonus);

    }
}