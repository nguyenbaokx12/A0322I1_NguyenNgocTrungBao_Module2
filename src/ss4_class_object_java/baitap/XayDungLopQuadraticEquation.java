package ss4_class_object_java.baitap;

import java.util.Scanner;

public class XayDungLopQuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    public XayDungLopQuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = this.b*this.b - 4*this.a*this.c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        return delta;
    }
    public double getNghiem1() {
        return (-this.b + Math.sqrt(delta)) / 2 / this.a;
    }
    public double getNghiem2() {
        return (-this.b - Math.sqrt(delta)) / 2 / this.a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();

        XayDungLopQuadraticEquation q = new XayDungLopQuadraticEquation(a,b,c);
        double delta= q.getDelta();
        if(delta>0){
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.printf("x1 = %.2f, x2 = %.2f", q.getNghiem1(), q.getNghiem2());
        }else if(delta==0){
            System.out.printf("x="+q.getNghiem1());
        }else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
