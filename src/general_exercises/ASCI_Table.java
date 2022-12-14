package general_exercises;

public class ASCI_Table {
    public static void main(String[] args) {
        String str;
        char cha ;
        int num;

        for(char i = 1 ; i<=127 ; i++){
            cha = i ;
            num = i ;
            System.out.print( cha + " = " + num + "\t");
            if(i % 10 == 0){
                System.out.println();
            }
        }
    }
}
