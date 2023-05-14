class Demo{
    int rollN ;
    String name;
    Demo(int rollN,String name){
        this.rollN = rollN;
        this.name = name;
    }
    void show(){
        System.out.print(rollN+" "+name);
    }
}
class parameter {
    public static void main(String[] args) {
    Demo ref = new Demo(1,"uday");
        ref.show();
    
    }
}
