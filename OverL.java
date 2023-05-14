class A {
    int x;
    int y;

    void show(int x, int y) {
        System.out.println(x + y);
    }

    void show(int x, int y, int z) {
        System.out.println(x + y + z);
    }
}

public class OverL {
    public static void main(String[] args) {
        A ov = new A();
        ov.show(5, 6);
        ov.show(5, 6, 7);
    }
}
