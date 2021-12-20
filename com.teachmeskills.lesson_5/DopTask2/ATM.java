package DopTask2;

public class ATM {

    public int banknote20 = 0;
    public int banknote50 = 0;
    public int banknote100 = 0;
    public int summATM = (banknote100 * 100) + (banknote50 * 50) + (banknote20 * 20);

    public ATM(int bank100, int bank50, int bank20) {
        this.banknote100 = bank100;
        this.banknote50 = bank50;
        this.banknote20 = bank20;
        summATM = (banknote100 * 100) + (banknote50 * 50) + (banknote20 * 20);
    }

    public void addBanknote20(int add20) {
        this.banknote20 = banknote20 + add20;
        summATM = summATM + add20*20;
    }

    public void addBanknote50(int add50) {
        this.banknote50 = banknote50 + add50;
        summATM = summATM + add50*50;
    }

    public void addBanknote100(int add100) {
        this.banknote100 = banknote100 + add100;
        summATM = summATM + add100*100;
    }

    public boolean getBanknote(int summ) {

        if (summ <= summATM) {

            int getSumm = summ;

            summATM = summATM - getSumm;

            System.out.println("Выдана сумма: " + getSumm + " руб.");

            if (summ >= 100) {
                int get100 = getSumm / 100;
                if (banknote100 >= get100) {
                    getSumm = getSumm - get100 * 100;
                    banknote100 = banknote100 - get100;
                    System.out.println("Выдано купюр номиналом 100: " + get100 + " шт.");
                }
            }

            if (summ >= 50) {
                int get50 = getSumm / 50;
                if (banknote50 >= get50) {
                    getSumm = getSumm - get50 * 50;
                    banknote50 = banknote50 - get50;
                    System.out.println("Выдано купюр номиналом 50: " + get50 + " шт.");
                }
            }

            if (summ >= 20) {
                int get20 = getSumm / 20;
                if (banknote20 >= get20) {
                    getSumm = getSumm - get20 * 20;
                    banknote20 = banknote20 - get20;
                    System.out.println("Выдано купюр номиналом 20: " + get20 + " шт.");
                }else{
                    System.out.println("Сбой банкомата, обратитесь в техподдержку");
                    return false;
                }
            }

            System.out.println();
            System.out.println("Остаток в банкомате: " + summATM);
            System.out.println("Остаток купюр номиналом 100: " + banknote100 + " шт.");
            System.out.println("Остаток купюр номиналом 50: " + banknote50 + " шт.");
            System.out.println("Остаток купюр номиналом 20: " + banknote20 + " шт.");

            return true;
        } else {
            return false;
        }
    }
}
