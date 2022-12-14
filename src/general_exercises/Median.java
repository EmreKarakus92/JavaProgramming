package general_exercises;

public class Median {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 18;
        int n3 = 12;

        if ((n1<n2 && n1>n3) || (n1<n3 && n1>n2) ){
            System.out.println(n1 + " is the median number.");
        } else if((n2<n1 && n2>n3) || (n2<n3 && n2>n1)){
            System.out.println(n2 + " is the median number.");
        } else
            System.out.println(n3 + " is the median number.");
    }
}
