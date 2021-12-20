package Task1;

public class CreditCard {

    public String bankBill; // номер карты
    public double currentAmount; // баланс карты
    double debitSumm; // cумма пополнения
    double creditSumm; // сумма списания
    boolean debit; // триггер начисления/списания


    //метод пополнения карты
    public void debitOnCard(double summ) {
        currentAmount = currentAmount + summ;
        debitSumm = summ;
        debit = true;
    }

    //метод списания с карты
    public void creditOnCard(double summ) {
        currentAmount = currentAmount - summ;
        creditSumm = summ;
        debit = false;
    }

    //метод вывода информации по карте
    public void cardInfo() {
        System.out.println("Номер карты: " + bankBill);
        summInfo();
        System.out.println("Текущий баланс: " + currentAmount);
        System.out.println();
    }

    //метод вывода информации о начислении/списании
    void summInfo() {
        if (debit) {
            System.out.println("Вам начислилось: " + debitSumm);
        } else {
            System.out.println("У Вас списалось: " + creditSumm);
        }
    }

}