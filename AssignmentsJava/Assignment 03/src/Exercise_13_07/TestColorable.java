package Exercise_13_07;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(5);
        objects[1] = new Square(7.5);
        objects[2] = new Square(10);
        objects[3] = new Square(2.5);
        objects[4] = new Square(9.5);

        for (GeometricObject object : objects) {
            System.out.println("Area: " + object.getArea());
            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }
        }
    }
}