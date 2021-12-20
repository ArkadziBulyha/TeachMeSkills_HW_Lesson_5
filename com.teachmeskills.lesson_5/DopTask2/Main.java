package DopTask2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean successOperation;

        ATM atm = new ATM(100, 100,100);
        System.out.println("Текущая сумма в банкомате: " + atm.summATM);

        System.out.println("Количество купюр номиналом 100: " + atm.banknote100 + " шт.");
        System.out.println("Количество купюр номиналом 50: " + atm.banknote50 + " шт.");
        System.out.println("Количество купюр номиналом 20: " + atm.banknote20 + " шт.");

        System.out.print("Введите сумму снятия: ");
        int getSumm = new Scanner(System.in).nextInt();

        successOperation = atm.getBanknote(getSumm);

        if (successOperation) {
            System.out.println("Операция проведена успешно!");
        } else {
            System.out.println("В банкомате не хватает средств...");
        }
    }
}
