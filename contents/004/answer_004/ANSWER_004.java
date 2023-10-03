package answer_004;

import java.util.Random;

public class ANSWER_004 {
  public static void main(String[] args) {
    int[][] twoDimensionalArray = new int[5][5];

    Random random = new Random();
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        twoDimensionalArray[i][j] = random.nextInt(1000) + 1;
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(twoDimensionalArray[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        int number = twoDimensionalArray[i][j];
        if (number % 3 == 0 && number % 5 == 0) {
          System.out.print("FizzBuzz" + " ");
        } else if (number % 3 == 0) {
          System.out.print("Fizz" + " ");
        } else if (number % 5 == 0) {
          System.out.print("Buzz" + " ");
        } else {
          System.out.print(number + " ");
        }
      }
      System.out.println();
    }
  }
}
