package Task1;

import Task1.CreditCard;

public class Main {

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();

        card1.bankBill = "9410 9330 8000 3265";
        card2.bankBill = "9410 9330 8000 3267";
        card3.bankBill = "9410 9330 8000 3269";

        card1.currentAmount = 5000.00;
        card2.currentAmount = 50000.00;
        card3.currentAmount = 500000.00;

        card1.debitOnCard(500);
        card2.debitOnCard( 5000);
        card3.creditOnCard(250000);

        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();
    }
}
