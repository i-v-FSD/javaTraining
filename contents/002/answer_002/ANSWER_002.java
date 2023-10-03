package answer_002;

public class ANSWER_002 {
  public static void main(String[] args) {
    final int MIN = 1;
    final int MAX = 5;

    for (int i = MIN; i <= MAX; i++) {
      for (int j = MIN; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = MAX - MIN; i >= MIN; i--) {
      for (int j = MIN; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
