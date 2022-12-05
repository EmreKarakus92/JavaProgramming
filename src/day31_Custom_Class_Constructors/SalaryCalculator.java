package day31_Custom_Class_Constructors;

public class SalaryCalculator {

    public double hourlyRate ;
    public double stateTaxRate ;
    public double federalTaxRate ;
    public int weeklyHours ;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary = hourlyRate * weeklyHours * 52 ;
        return salary ;
    }

    public  double stateTax(){
        double stateTax = stateTaxRate * salary();
        return stateTax ;
    }

    public  double federalTax(){
        double federalTax = federalTaxRate * salary();
        return federalTax ;
    }

    public double salaryAfterTax(){
        double salaryAfterTax = salary()-stateTax()-federalTax();
        return salaryAfterTax ;
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
