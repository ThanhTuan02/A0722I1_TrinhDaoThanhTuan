package s05_Access.baitap.Access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }
    public Circle (double radius) {
        radius =radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(double radius) {
        this.radius = radius;
        return radius;
    }
}
