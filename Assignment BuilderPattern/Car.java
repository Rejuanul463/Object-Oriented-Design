public class Car {
    String modelName = "Default Model";
    String engineType = "Petrol";
    String colour = "white";
    String transmission = "Manual";
    Boolean sunroof = false;
    Boolean infotainmentSystem = false;

    protected Car(String modelName, String engineType, String colour, String transmission, Boolean sunRoof, Boolean infotainmentSystem){
        this.modelName = modelName;
        this.engineType = engineType;
        this.colour = colour;
        this.transmission = transmission;
        this.sunroof = sunRoof;
        this.infotainmentSystem = infotainmentSystem;
    }

    public void printConfiguration(){
        System.out.println("Model Name: " + modelName);
        System.out.println("Engine Type : " + engineType);
        System.out.println("Colour : " + colour);
        System.out.println("Transmission System : " + transmission);
        if(sunroof) 
            System.out.println("Sunroof : Yes");
        else 
            System.out.println("Sunroof : No");
        if(infotainmentSystem)
            System.out.println("infotainmentSystem : Yes");
        else
            System.out.println("infotainmentSystem : No");

        System.out.println("\n\n");
    }
}