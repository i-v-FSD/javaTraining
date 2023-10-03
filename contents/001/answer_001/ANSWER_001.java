package answer_001;

import java.util.Scanner;

public class ANSWER_001 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("身長（cm）を入力して下さい。");
    final double height = scanner.nextDouble();
    System.out.println("体重（kg）を入力して下さい。");
    final double weight = scanner.nextDouble();

    final double bmi = weight / ((height / 100) * (height / 100));
    System.out.println("あなたのBMIは " + bmi + " です。");

    final String judgement = judgeBmi(bmi);
    System.out.println("判定結果は「" + judgement + "」です。");

    scanner.close();
  }

  private static String judgeBmi(final double bmi) {
    if (bmi < 18.5) {
      return ("低体重");
    }
    if (bmi >= 18.5 && bmi < 25.0) {
      return ("普通体重");
    }
    if (bmi >= 25.0 && bmi < 30.0) {
      return ("肥満（１度）");
    }
    if (bmi >= 30.0 && bmi < 35.0) {
      return ("肥満（２度）");
    }
    if (bmi >= 35.0 && bmi < 40.0) {
      return ("肥満（３度）");
    }
    if (bmi >= 40.0) {
      return ("肥満（４度）");
    }
    return ("不正な値");
  }
}