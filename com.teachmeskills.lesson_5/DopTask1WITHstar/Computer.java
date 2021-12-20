package DopTask1WITHstar;

public class Computer {

    double costPC;
    String modelPC;
    RAM ram;
    HDD hdd;

    enum TypePC {Notebook, Desktop}
    TypePC typePC;


    public Computer(double costPC, String modelPC) {
        this.costPC = costPC;
        this.modelPC = modelPC;
        this.ram = new RAM();
        this.hdd = new HDD();
        typePC = TypePC.Notebook;
    }

    public Computer(double costPC, String modelPC, String nameRAM, int capacityRAM, String nameHDD, int capacityHDD, String typeHDD) {
        this.costPC = costPC;
        this.modelPC = modelPC;
        this.ram = new RAM(nameRAM, capacityRAM);
        this.hdd = new HDD(nameHDD, capacityHDD, typeHDD);
        typePC = TypePC.Desktop;
    }

    public void infoPC() {
        System.out.println("Стоимость ПК : " + costPC + " Зайчиков");
        System.out.println("Модель : " + modelPC);
        System.out.println("Тип PC: " + typePC);
        ram.showRAM();
        hdd.showHDD();
    }

}
