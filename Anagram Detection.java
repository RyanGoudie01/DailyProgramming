import java.util.Arrays;
import java.util.Scanner;

class anagramDetection {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input word for anagram detection");
        String firstWord = input.nextLine();

        System.out.println("Input word for anagram comparison");
        String secondWord = input.nextLine();
        
        if (firstWord.length() != secondWord.length()){
            System.out.println("These two words cannot be anagrams of each other : " + firstWord + " & " + secondWord);
             System.exit(0);
        }

        char[] a1 = firstWord.toCharArray();
        char[] a2 = secondWord.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)){
            System.out.println("These two words are anagrams of each other : " + firstWord + " & " + secondWord);
        } else{
            System.out.println("These two words aren't anagrams of each other : " + firstWord + " & " + secondWord);
        }
    

    }
}
