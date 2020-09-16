public class Rectangle extends Shape {
    private double width;
    private double Length;

    public Rectangle() {
        this.width = 1.0;
        this.Length = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.Length = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.Length = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double height) {
        this.Length = height;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and height = "+ Length + " which is a subclass of " + super.toString();
    }
}
