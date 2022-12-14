package general_exercises;

public class Test {

    public Test(){
        this(10);
        System.out.println("A ");

    }

    public Test(int a){
        System.out.println("B ");
    }

    public static void main(String[] args) {
        Test obj = new Test();
    }


}
