package s06_ke_thua.thuchanh.circle;

public class test_circle {
    public static void main(String[] args) {
        circle Circle = new circle();
        System.out.println(Circle);

        Circle = new circle(3.5);
        System.out.println(Circle);

        Circle = new circle("Indigo", false, 3.5);
        System.out.println(Circle);
    }
}
