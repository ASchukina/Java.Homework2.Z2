
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int startSum = 300;
        int depositSum = 1413;
        int bonusSum;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (depositSum > 1000) {
            bonusSum = depositSum / 100;
        } else {
            bonusSum = 0;
        }
        // вывод итоговой суммы на счету в рублях
        int finalSum = startSum + depositSum + bonusSum;
        System.out.println("Ваш баланс с учётом бонусов составляет: " + finalSum + " руб.");
        System.out.println("Ваш бонусный счёт составляет: " + bonusSum + " руб.");
    }
}