import java.util.*;
public class Factory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("ractengle")){
            return new Ractengle();
        }else{
            return null;
        }
    }
}
