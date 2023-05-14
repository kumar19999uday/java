class student {
    int rollN;
    String name;
    static String collegeN = "K.K.College of engneering and management";

    void Display(int rollN, String name) {
        System.out.println(rollN + " " + name + " " + collegeN);
    }
}

public class Stat {
    public static void main(String[] args) {
        student details = new student();
        details.Display(01, "uday");
    }
}
