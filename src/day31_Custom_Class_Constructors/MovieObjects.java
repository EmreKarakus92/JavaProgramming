package day31_Custom_Class_Constructors;

public class MovieObjects {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Turkey", "Adventure Of Being SDET", "Drama", "11/11/2022", "Muhtar") ;
        String[] names = {"Adam", "Asiya", "Saim", "Zulfikar", "Hakim", "Mehmet"} ;
        System.out.println("movie1 = " + movie1);
        movie1.addCasts(names);
        System.out.println("movie1 = " + movie1);
    }
}
