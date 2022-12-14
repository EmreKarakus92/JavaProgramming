package day31_Custom_Class_Constructors;

public class BankAccount {

    public String accountHolder ;
    public long accountNumber ;
    public double balance ;

    public void setInfo(String accountHolder, long accountNumber){
        this.accountHolder = accountHolder ;
        this.accountNumber = accountNumber ;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }


    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }

    public void deposit(double deposit){
        if(deposit<=0) {
            System.out.println("Depositing amount can not be zero or negative");
            return; // exits the method
        }
        balance+= deposit ;
        System.out.println("Your available balance is: " + balance);
    }

    public void withdraw(double withdraw){
        if(withdraw > balance){ // if withdrawing amount is greater than available balance
            System.out.println("Insufficient balance");
            return;
        }

        if(withdraw<=0) {
            System.out.println("Depositing amount can not be zero or negative");
            return; // exits the method
        }
        balance-= withdraw;
        System.out.println("Your available balance is: " + balance);
    }




}
