class Demo {
    // data
    int rollN = 5;
    String name = "uday";

    // method name
    void show() {
        System.out.print(rollN + " " + name);
    }
}

class Test {
    public static void main(String[] args) {
        // object 
        Demo I = new Demo();
        I.show();
    }
}
