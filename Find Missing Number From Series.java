import java.util.Arrays;
import java.util.stream.IntStream;

class missingNumber {
  
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12};

    int N = numbers[numbers.length-1];  //The last element in the array
    int expectedSum = (N * (N + 1)) / 2;
    int actualSum = Arrays.stream(numbers).sum();

    int missingNumber = expectedSum - actualSum;
    System.out.println(missingNumber);
  }
}