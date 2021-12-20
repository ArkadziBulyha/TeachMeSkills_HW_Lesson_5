package DopTask1WITHstar;

public class HDD {

    String nameHDD;
    int capacityHDD;
    String typeHDD;

    public HDD(){
        this.nameHDD = "Western Digital";
        this.capacityHDD = 1000;
        this.typeHDD = "Внутренний";
    }

    public HDD(String nameHDD, int capacityHDD, String typeHDD) {
        this.nameHDD = nameHDD;
        this.capacityHDD = capacityHDD;
        this.typeHDD = typeHDD;
    }

    public void showHDD(){
        System.out.println("Название HDD: " + nameHDD);
        System.out.println("Объём HDD: " + capacityHDD + " Гб");
        System.out.println("Тип HDD: " + typeHDD);
    }
}
