package day24_Return_Method;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter the sentence");
        String sentence = input.nextLine();

        System.out.println("Please enter the word you want to search");
        String word = input.nextLine();

        int frequency = frequencyOfWord(sentence, word);

        System.out.println(frequency);

    }

    public static int frequencyOfWord(String sentenceArg, String wordArg){
        int lengthOfSentenceArg = sentenceArg.length();
        int lengthOfWord = wordArg.length();
        int count = 0 ;

        for(int i = 0 ; i<=lengthOfSentenceArg-lengthOfWord ; i++){
            if(sentenceArg.substring(i,i+lengthOfWord).equalsIgnoreCase(wordArg)){
                count++;
            }
        }

        return count;


    }
}
