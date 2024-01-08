
public class Main {
    public static void main(String[] args) {

        int currenBalance = 100; // Начальный счет клиента

        int topUpAmount = 1100; // Сумма пополнения

        if (topUpAmount > 1000) {
            int bonus = (topUpAmount - 1000) / 100; // Расчет бонуса currentBalance += topUpAmount + bonus;

            System.out.println("Бонус: " + bonus + " рублей");
        } else {
            currenBalance += topUpAmount; // Итоговый счет без бонуса
        }
        System.out.println("Итоговый счет: " + currenBalance + " рублей");
        }

}