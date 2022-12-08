package day33_Statics;

import java.util.ArrayList;
import java.util.Arrays;


public class School {

        static ArrayList<Teacher> teachers = new ArrayList<>() ;

        static {
            Teacher teacher1 = new Teacher("Emre", "Karakus", "29.06.1992", 30, 3922, 'M');
            Teacher teacher2 = new Teacher("Mahmut", "Muhtar", "29.06.1974", 48, 4922, 'M');
            Teacher teacher3 = new Teacher("Asiya", "SoftSkills", "29.06.1992", 29, 2922, 'F');

            teachers.addAll(Arrays.asList(teacher1,teacher2,teacher3)) ;
        }

        private static ArrayList<Teacher> lastNameStartsWithM(String Prefix){
            ArrayList<Teacher> result = new ArrayList<>(teachers);
            result.removeIf(p-> !(p.lastName.charAt(0)=='M')) ;
            return result ;
        }

        private static ArrayList<Teacher> findFemaleTeacher(char gender){
            ArrayList<Teacher> result = new ArrayList<>(teachers);
            result.removeIf(p-> !(p.gender==gender)) ;
            return result ;
        }

        private static ArrayList<Teacher> smallerThanYears(int age){
            ArrayList<Teacher> result = new ArrayList<>(teachers);
            result.removeIf(p-> p.age>=30) ;
            return result;
        }

    public static void main(String[] args) {

        System.out.println(teachers);

        System.out.println(findFemaleTeacher('M'));

        System.out.println(lastNameStartsWithM("M"));

        System.out.println(smallerThanYears(30));


    }







    }

