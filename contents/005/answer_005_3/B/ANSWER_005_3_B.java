package answer_005_3.B;

abstract class Parent {
  public abstract void hello();
}

class Children extends Parent {
  @Override
  public void hello() {
    System.out.println("hello!");
  }
}

public class ANSWER_005_3_B {
  public static void main(String[] args) {
    Children children = new Children();
    children.hello();
  }
}
