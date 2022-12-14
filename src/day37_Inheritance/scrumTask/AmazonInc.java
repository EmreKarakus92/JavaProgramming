package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String company = "Amazon Inc" ;
        ProductOwner po = new ProductOwner("Emre", 30, 'M', 3063, 3000, company);
        BusinessAnalyst ba = new BusinessAnalyst("Mehmet", 32, 'M', 3914, 5000, company);
        ScrumMaster sm = new ScrumMaster("Enes", 28, 'M', 2458, 3500, company);

        Tester tester1=new Tester("Chinara",32,'F',3254,1415,company);

        Tester tester2=new Tester("Yasaman",31,'F', 2417,1416,company);

        Tester tester3=new Tester("Irena",29,'F',2144,1417,company);

        Tester[] testers= {tester1, tester2,tester3};

        Developer developer1=new Developer("Max", 40, 'M', 1111, 3665,  company);
        Developer developer2=new Developer("Allison", 18, 'F', 2222, 364,  company);
        Developer developer3=new Developer("Tom", 26, 'M', 3333, 3654,  company);
        Developer developer4=new Developer("Manas", 40, 'M', 4444, 6568,  company);
        Developer developer5=new Developer("Evelyn", 30, 'F', 5555, 788,  company);
        Developer[] developers={developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrumTeam=new ScrumTeam(po, ba, sm);

        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);

        System.out.println("scrumTeam = " + scrumTeam);
        System.out.println("Test Team");
        for (Tester tester : testers) {
            System.out.println(tester.name + " $" + tester.salary);
        }
        System.out.println("Developer Team");
        for (Developer developer : scrumTeam.developers){
            System.out.println(developer.name + " $" + developer.salary);
        }


    }
}
