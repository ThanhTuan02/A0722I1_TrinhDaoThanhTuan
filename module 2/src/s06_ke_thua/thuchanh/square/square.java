package s06_ke_thua.thuchanh.square;


import s06_ke_thua.thuchanh.rectangle.rectangle;

public class square extends rectangle {
    public square(){}

    public square(double side){
        super(side, side);
    }

    public square (double side, String color, boolean filled) {
        super(side, side, color,filled);
    }

}
