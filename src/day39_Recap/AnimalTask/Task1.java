package day39_Recap.AnimalTask;

public class Task1 {
    private String name;

    public Task1(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean properName = true;
        for (int i = 0; i < name.length(); i++) {
            if(Character.isLetter(name.charAt(i))){
                continue;
            } else if (Character.isDigit(name.charAt(i))) {
                continue;
            } else if (name.charAt(i)==' ') {
                continue;
            } else {
                properName = false ;
                break;
            }
        }
        if (!properName){
            System.err.println("Invalid Name");
            System.exit(1);
        }

        this.name = name;
    }

    @Override
    public String toString() {
        return "Task1{" +
                "name='" + name + '\'' +
                '}';
    }
}
