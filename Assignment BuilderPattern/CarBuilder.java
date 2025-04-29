public class CarBuilder {
    private String modelName = "Default Model";
    private String engineType = "Petrol";
    private String colour = "white";
    private String transmission = "Manual";
    private Boolean sunRoof = false;
    private Boolean infotainmentSystem = false;

    public CarBuilder setModel(String model){
        modelName = model;
        return this;
    }
    public CarBuilder setEngine(String engineType){
        this.engineType = engineType;
        return this;
    }
    public CarBuilder setColour(String colour){
        this.colour = colour;
        return this;
    }
    public CarBuilder setTransmission(String transmission){
        this.transmission = transmission;
        return this;
    }
    public CarBuilder setSunroof(Boolean sunRoof){
        this.sunRoof = sunRoof;
        return this;
    }
    public CarBuilder SetInfotainmentSystem(Boolean infotainmentSystem){
        this.infotainmentSystem = infotainmentSystem;
        return this;
    }

    public Car build(){
        return new Car(modelName, engineType, colour, transmission, sunRoof, infotainmentSystem);
    }

}