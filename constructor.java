class employee{
    int id ;
    String name;
    float salary;
    void insert(int i,String n, float s){
        id = i;
        name = n;
        salary = s;
    }
    void display(){
        System.out.println(id+" , "+name+" : "+ salary);
    }
}
public class constructor {
    public static void main(String[] args){
        employee e1 = new employee();
        employee e2 = new employee();
        employee e3 = new employee();
        e1.insert(1, "uday", 12000);
        e2.insert(2, "kumar", 10000);
        e3.insert(3, "raj", 8000);
        e1.display();
        e2.display();
        e3.display();

    }
    
}
