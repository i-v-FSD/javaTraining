# 005_2

以下の2問を解いてください。

A. Parentと言う名前のインターフェイスを継承したChildrenクラスを作成してください。

B. 作成したChildrenクラスでParentインターフェイスのdefaultメソッドをオーバーライドし実行してください。


インターフェイスParent

interface Parent{
  default void hello(){
    System.out.println("hello");
  }
}
