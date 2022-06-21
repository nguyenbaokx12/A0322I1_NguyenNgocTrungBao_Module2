package ss5_access_modifier_static.baitap;

public class XayDungLopChiGhi {
    private String name="John";
    private String classes="C02";
    public XayDungLopChiGhi(){

    }
    public XayDungLopChiGhi(String name,String classes){
        this.name=name;
        this.classes=classes;
    }
    public String getName(){
        return this.name;
    }
    public String getClasses(){
        return this.classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        XayDungLopChiGhi Student1=new XayDungLopChiGhi("Nguyễn Ngọc Trung Bảo","Lớp A03");
        System.out.println(Student1.getName()+" "+Student1.getClasses());
        XayDungLopChiGhi Student2=new XayDungLopChiGhi();
        System.out.println(Student2.getName()+" "+Student2.getClasses());

    }

}
