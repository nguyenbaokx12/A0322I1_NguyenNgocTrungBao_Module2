package ss5_access_modifier_static.thuchanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1=new Student(10,"khanh");
        Student s2=new Student(11,"Nga");
        s1.display();
        s2.display();

    }
}
