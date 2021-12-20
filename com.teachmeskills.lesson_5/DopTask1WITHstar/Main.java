package DopTask1WITHstar;

public class Main {

    public static void main(String[] args) {

        Computer comp1 = new Computer(1000, "Myshovur");
        Computer comp2 = new Computer(1500, "Albatros", "Corsair", 32000, "Seagate", 2000, "Внешний");

        comp1.infoPC();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        comp2.infoPC();

    }
}
