package answer_005_2.A;

interface Parent {
  default void hello() {
    System.out.println("hello");
  }
}

class Children implements Parent {
}
