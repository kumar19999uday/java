class student5{
    int id;
    String name ;
    int age;
    student5(int i,String n){
        id = i;
        name = n;
    }
    student5(int i,String n,int a){
        id =i;
        name =n;
        age = a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }

}
public class Cons3 {
    public static void main(String[] args){
        
        student5 s1 = new student5(202,"satendar");
        student5 s2 = new student5(101,"uday",23);
        s2.display();
        s1.display();
    }
    
}
