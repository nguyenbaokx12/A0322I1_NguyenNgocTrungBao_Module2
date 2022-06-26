package ss6_inheritance.baitap.LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return Math.PI * height * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + height +
                ", radius=" + getRadius() +
                ", color='" + getColor() +
                ", Area='" + getArea() + '\'' +
                '}';
    }
}
