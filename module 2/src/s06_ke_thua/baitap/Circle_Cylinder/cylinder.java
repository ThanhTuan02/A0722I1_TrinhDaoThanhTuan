package s06_ke_thua.baitap.Circle_Cylinder;

public class cylinder extends circle {
    private double height = 15 ;

    public cylinder (){}

    public cylinder(double height) {
        this.height = height;
    }

    public cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "cylinder{" +
                "height=" + height +
                '}'+super.toString();
    }
}
