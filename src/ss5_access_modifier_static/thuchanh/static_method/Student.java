package ss5_access_modifier_static.thuchanh.static_method;

public class Student {
    private static String college="BDDIT";
    private int rollno;
    private String name;

    Student(int r,String n){
        rollno=r;
        name=n;
    }
    static void change(){
        college="codegym";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+ college);
    }
}
