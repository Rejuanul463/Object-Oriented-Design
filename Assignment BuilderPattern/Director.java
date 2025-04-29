//Optional Class
public class Director {
    public Car ConstructDefaultCar(){
        return new CarBuilder().build();
    }
    public Car ConstructMustangGt(){
        return new CarBuilder()
            .setModel("Mustang GT")
            .setColour("Black")
            .setEngine("Ti-VCT Coyote V8 engine")
            .setTransmission("Manual")
            .setSunroof(true)
            .build();
    }
}
