public class Circle extends Shape {
    private  double radius;
    final double PI = 3.14;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea () {
        double area = radius*radius*PI;
        return area;
    }

    public double getPerimeter(){
        double peri = radius*2*PI;
        return peri;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + radius + ", which is a subclass of " + super.toString();
    }
}
