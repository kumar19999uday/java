class student{
    int id;
    String name;
}
public class byRefernce {
    public static void main(String[] args){
        student s1 = new student();
        s1.id = 100;
        s1.name = "uday";
        System.out.println(s1.id+"  "+s1.name);
    }

}
