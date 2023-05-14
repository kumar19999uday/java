class vehicles {
    void show() {
        System.out.println("truck");
    }
}

class car extends vehicles {
    void show() {
        System.out.println("mercidies");

    }
}

public class OverR {
    public static void main(String[] args) {
        vehicles van = new car();
        van.show();
    }
}
