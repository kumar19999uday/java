class student4{
    int id;
    String name;
    student4(int i,String n){
        id=i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class Const2 {
    public static void main(String[] args){
        student4 s = new student4(101,"satendar");
        student4 s1 = new student4(201,"uday");
        s.display();
        s1.display();
    }
}
