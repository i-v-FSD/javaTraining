package answer_005_1.B;

class Parents {
  public void hello() {
    System.out.println("Hello!");
  }
}

class Children extends Parents {
}

public class ANSWER_005_1_B {

  public static void main(String[] args) {
    Children children = new Children();
    children.hello();
  }
}
