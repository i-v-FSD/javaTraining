package answer_003;

import java.util.Random;

public class ANSWER_003 {
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

    // 拡張for文の場合
    // for (int[] array : twoDimensionalArray) {
    // for (int num : array) {
    // System.out.print(num + " ");
    // }
    // System.out.println();
    // }
  }
}
