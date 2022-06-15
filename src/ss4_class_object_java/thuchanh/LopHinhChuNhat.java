package ss4_class_object_java.thuchanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    double height, width;
    public  LopHinhChuNhat(){
    }

    public LopHinhChuNhat(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }
    public String toString(){
        return "LopHinhChuNhat{width= "+width+", height=" + height+"}";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        LopHinhChuNhat rectangle = new LopHinhChuNhat(height,width);
        System.out.println(rectangle);
    }
}
