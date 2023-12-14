package answer_005_2.A;

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
