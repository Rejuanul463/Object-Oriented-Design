public class Main {
    public static void main(String[] args) {
        Car defaultCar = new CarBuilder().build();
        System.out.println("Default Car configuration is,");
        defaultCar.printConfiguration();

        Car customCar = new CarBuilder()
                            .setModel("Mustang GT")
                            .setColour("Black")
                            .setEngine("Ti-VCT Coyote V8 engine")
                            .setTransmission("Manual")
                            .setSunroof(true)
                            .build();
        System.out.println("Custom Car configuration is,");
        customCar.printConfiguration();
    }
}