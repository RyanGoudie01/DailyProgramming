import java.util.Scanner;

class FizzBuzz {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input max number to run too");
        int counter = input.nextInt();
        
        for(int i = 1; i <= counter ; i++){

            if (((i%5)== 0) & ((i%7) == 0)) {
                System.out.println("fizzbuzz");
            } else if  ((i%5) == 0) {
                System.out.println("buzz");
            }
            else if  ((i%7) == 0) {
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }

        }

    
    }
}
