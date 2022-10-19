public class Main {
    public static void main(String[] args) {

        int startScore = 100;    // Начальный счет
        int depositAmount = 500; // Сумма пополнения
        int bonus;               // Бонусные рубли
        int finalScore;          // Итоговый счет


        if (depositAmount > 100) {
            bonus = (depositAmount * 1 / 100);
            finalScore = startScore + depositAmount + bonus;
            System.out.println("Начислены бонусы в размере " + bonus + " руб.");
            System.out.println("Общий баланс составляет " + finalScore + " руб.");
        } else {
            System.out.println("Сумма пополнения меньше 100 руб.");

        }


    }
}