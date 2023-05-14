class rectangle{
    int length;
    int breadth;
    void inser(int l, int b){
        length = l;
        breadth = b;
    }
    void area(){
        System.out.println("Area"+" ---------- "+length*breadth);
    }
}
public class byMethod1 {
    public static void main(String[] args){
        rectangle rect = new rectangle();
        rect.inser(12,13);
        rect.area();
    }
    
}
