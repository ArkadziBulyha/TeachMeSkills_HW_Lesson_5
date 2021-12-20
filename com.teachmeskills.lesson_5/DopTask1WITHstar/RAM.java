package DopTask1WITHstar;

public class RAM {

    String nameRAM;
    int capacityRAM;

    public RAM() {
        this.nameRAM = "Crucial Ballistix";
        this.capacityRAM = 16000;
    }

    public RAM(String nameRAM, int capacityRAM) {
        this.nameRAM = nameRAM;
        this.capacityRAM = capacityRAM;
    }

    public void showRAM(){
        System.out.println("Модель оперативки: " + nameRAM);
        System.out.println("Объём памяти : " + capacityRAM + " Мб");
    }
}

