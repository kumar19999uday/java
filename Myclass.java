package oops1;
class Employee{
    int id=2;
    int salary = 20000;
    int incentive =200;
    void countSalary(){
        System.out.println(salary+incentive);
    }
}
public class Myclass {
    public static void main(String[] args){
        Employee emp = new Employee();
        System.out.println(emp.id);
        System.out.println(emp.salary);
        System.out.println(emp.incentive);
    }
}
