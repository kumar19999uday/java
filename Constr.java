class A {
    // data
    int mob;
    String name;

    // method
    A() {
        mob = 10;
        name = "Uday";
    }

    void Show() {
        System.out.print(mob + " " + name);
    }

}

class Constr {
    public static void main(String[] args) {
        A ref = new A();
        ref.Show();

    }
}
