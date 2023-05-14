class student{
    int id;
    String name;
}
public class byRefernce1 {
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();
        s1.id = 100;
        s1.name = "uday";
        s2.id = 101;
        s2.name = "kumar";
        System.out.println(s1.id+"  "+s2.id);
        System.out.println(s1.name+"  "+s2.name);
    }
    
}
