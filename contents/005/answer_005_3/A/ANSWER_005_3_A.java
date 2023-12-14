package answer_005_3.A;

abstract class Abstract {
  public abstract void hello();
}

class Children extends Abstract {
  public void hello() {
    System.out.println("hello!");
  };
}
