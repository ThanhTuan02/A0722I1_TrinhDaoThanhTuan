package s06_ke_thua.thuchanh.circle;

import s06_ke_thua.thuchanh.shape.shape;

public class circle extends shape {
    private double radius = 1.0;

    public circle(){};

    public circle(double radius) {
        this.radius = radius;
    }

    public circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return  radius* radius * Math.PI;
    }

    public double getPerimeter() {
        return  2* radius *Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
