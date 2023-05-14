class student1{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        this.rollno = r;
        this.name = n;
    }
    void displayInformation(){
        System.out.println(rollno+" "+name);
    }
}
public class byMethod{
    public static void main(String[] args){
    student1 s1 = new student1();
    student1 s2 = new student1();
    s1.insertRecord(111,"uday");
    s2.insertRecord(222,"name");
    s1.displayInformation();
    s2.displayInformation();
    }

}
