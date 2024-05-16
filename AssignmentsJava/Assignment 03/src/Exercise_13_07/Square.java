package Exercise_13_07;

public class Square extends  GeometricObject implements Colorable {
    private double side;

    // No-arg constructor
    public Square() {
        this.side = 0;
    }

    // Constructor with specified side
    public Square(double side) {
        this.side = side;
    }

    // Getter for side
    public double getSide() {
        return side;
    }

    // Setter for side
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
