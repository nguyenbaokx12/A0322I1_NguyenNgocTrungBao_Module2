package ss5_access_modifier_static.baitap;

public class AccessModifier {
    private int radius=1;
    private String color="xanh";

    protected AccessModifier(int radius){
        this.radius=radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public double getArea() {
        return getRadius()*getRadius()*Math.PI;
    }

    public String getColor() {
        return color="đen";
    }

    public static void main(String[] args) {
        AccessModifier O=new AccessModifier(6);
        System.out.println("Đối tượng hình tròn có: ");
        System.out.println("Bán kính đường tròn là: " + O.getRadius()+"; Diện tích là: "+ O.getArea()+ "; Màu: "+ O.getColor());
    }
}
