package day31_Custom_Class_Constructors;

public class Accounts {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Emre Karakus" , 306342583922L);

        System.out.println("account1 = " + account1);

        account1.deposit(5000);
        account1.withdraw(2000);
        account1.deposit(3000);
        System.out.println(account1.balance);


    }

}
