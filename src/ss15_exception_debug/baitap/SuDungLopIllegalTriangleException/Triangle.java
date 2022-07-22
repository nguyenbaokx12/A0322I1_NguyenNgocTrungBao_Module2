package ss15_exception_debug.baitap.SuDungLopIllegalTriangleException;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws TamGiacException{
        this.a = a;
        this.b = b;
        this.c = c;

        if (a <= 0 || b <= 0 || c <= 0 || a + b < c || a + c <= b || b + c < a) {
            throw new TamGiacException();
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setc(int c) {
        this.c = c;
    }
}
