
public class Main {
    public static void main(String[] args) {

        int currentBalance = 100; // Начальный счет клиента

        int topUpAmount = 1100; // Сумма пополнения

        int bonus = (topUpAmount - 1000) / 100; // Расчет бонуса
        currentBalance += topUpAmount + bonus;

        System.out.println("Бонус: " + bonus + " рублей");
        System.out.println("Итоговый счет: " + currentBalance + " рублей");
        }

}