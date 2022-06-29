package ss7_abstract_class_interface.baitap.trien_khai_i_colorable_cho_cac_lop_hinh_hoc;

public class Square extends Shape  implements Colorable {
    double length=1.0;
    protected Square(){

    }
    public Square(String color, boolean filled){
        super(color, filled);
    }
    public Square(String color, boolean filled, double length){
        super(color,filled);
        this.length=length;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }
    public double getArea(){
        return getLength()*getLength();
    }
    public double getPerimater(){
        return getLength()*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

}
