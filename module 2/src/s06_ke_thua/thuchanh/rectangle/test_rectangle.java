package s06_ke_thua.thuchanh.rectangle;

public class test_rectangle {
    public static void main(String[] args) {
        rectangle Rectangle = new rectangle();
        System.out.println(Rectangle);

        Rectangle = new rectangle(2.3,5.8);
        System.out.println(Rectangle);

        Rectangle = new rectangle("blue",true,2.3,5.8);
        System.out.println(Rectangle);
    }
}
