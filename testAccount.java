class Account{
    int acc_no;
    String name;
    float amount;
    void insert(int a, String n, float amt){
        acc_no = a;
        name = n;
        amount = amt;

    }
    void deposite(float amt){
        amount = amount+amt;
        System.out.println(amt+"deposited");
    }
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Influence balance");
        }
        else{
            amount=amount-amt;
            System.out.println(amt+"withdrawn");
        }

    }
    void checkBalance(){
        System.out.println("balance is : "+ amount);

    }
    void display(){
        System.out.println(acc_no+" "+name+" "+" "+amount);
    }

public class testAccount {
    public static void main(String[] args){
        Account a1 = new Account();
        a1.insert(123456,"Uday",10000);
        a1.display();
        a1.deposite(40000);
        a1.checkBalance();
        a1.withdraw(20000);
        a1.checkBalance();
    }
    
}
}
