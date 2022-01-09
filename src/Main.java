public class Main {
    public static void main(String[] args) {
        //входные данные
        int initialAmount = 100;
        int refill = 1750;
        int countBonus = 0;

        if (refill > 1000) {
            countBonus = refill / 100;
        }
        int clientAccountSum = initialAmount + refill + countBonus;
        System.out.println("Кол-во бонусных рублей: "+ countBonus);
        System.out.println("Итоговая сумма на счете клиента: "+ clientAccountSum+" руб.");
    }
}
