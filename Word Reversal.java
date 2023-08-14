import java.util.Scanner;

class ReverseWord {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input word to be reversed");

        String word = input.nextLine();
        System.out.println("Word prior to reversal : " + word);

        String output = "";
        for (int i = word.length() - 1; i >=0; i--){
            output = output + word.charAt(i);
        }

        word = output;
        System.out.println("Word after reversal : " + word);
    }
}