class Demo {
    int rollN;
    String name;

    Demo() {
        rollN = 1;
        name = "Uday";
        System.out.print(rollN + " " + "name");
    }

    Demo(Demo ref) {
        rollN = ref.rollN;
        name = ref.name;
        System.out.print(rollN + " " + "name");
    }
}

class copy {
    public static void main(String[] args) {
        Demo r = new Demo();
        Demo r2 = new Demo(r);

    }
}
