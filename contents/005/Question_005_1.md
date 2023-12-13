# 005_1

helloメソッドを持ったParentクラスがあります。
以下の3問を解いてください。
作成するクラス名はChildrenとします。

A. Childrenクラスを作成し、Parentクラスを継承してください。

B. 先ほど作成したChildrenクラスでインスタンスを生成し、親クラスのhelloメソッドを実行してください。

C. Childrenクラスで親クラスのhelloメソッドをオーバーライドし、実行してください。


Parentクラス

class Parent{
    public void hello(){
        System.out.println("hello!");
    }
}
