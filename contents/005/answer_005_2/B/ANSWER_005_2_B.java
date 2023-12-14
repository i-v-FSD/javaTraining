package answer_005_2.B;

interface ToImplement {
  default void hello() {
    System.out.println("hello");
  }
}

class Children implements ToImplement {
  @Override
  public void hello() {
    System.out.println("GoodBye!");
  }
}

public class ANSWER_005_2_B {
  public static void main(String[] args) {
    Children children = new Children();
    children.hello();
  }
}
