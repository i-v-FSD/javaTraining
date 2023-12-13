package answer_005_1.C;

class Parents {
  public void hello() {
    System.out.println("Hello!");
  }
}

class Children extends Parents {
  @Override
  public void hello() {
    System.out.println("GoodBye!");
  }
}

public class ANSWER_005_1_C {

  public static void main(String[] args) {
    Children children = new Children();
    children.hello();
  }
}
