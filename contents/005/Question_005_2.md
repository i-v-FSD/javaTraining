# 005_2 インターフェイス

以下の2問を解いてください。

A. ToImplementと言う名前のインターフェイスを継承したChildrenクラスを作成してください。またToImplementインターフェイスのdefaultメソッドをオーバーライドしてください。

B. 先ほど作成したChildrenクラスでインスタンスを生成し、先ほどオーバーライドしたメソッドを実行してください


インターフェイスParent

interface ToImplement{
  default void hello(){
    System.out.println("hello");
  }
}
