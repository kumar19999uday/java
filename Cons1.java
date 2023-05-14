class student3{
    int id;
    String name;
   
    void display(){
        System.out.println(id+" "+name);
    }
}
public class Cons1 {
    public static void main(String[] args){
        student3 s1 = new student3();
        student3 s2 = new student3();
        s1.display();
        s2.display();

    }
    
}
