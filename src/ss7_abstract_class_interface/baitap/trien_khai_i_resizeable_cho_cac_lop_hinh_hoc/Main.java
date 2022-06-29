package ss7_abstract_class_interface.baitap.trien_khai_i_resizeable_cho_cac_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 5);
        shapes[2]=new Square("green", true,4.0);
        System.out.println("Ban đầu ");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

        //Tăng diện tích tất cả các hình lên 20%
        for (Shape shape : shapes) {
            shape.resize(20);
        }

        System.out.println("Sau khi tăng ");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
