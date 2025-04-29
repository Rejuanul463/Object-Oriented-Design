import java.util.*;
public class Main {
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape ractengle = shapeFactory.getShape("Ractengle");
        ractengle.draw();
    }
}