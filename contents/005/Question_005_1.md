# 005_1 クラス継承

以下の3問を解いてください。

A. Parentクラスを継承したChildrenクラスを作成し、Parentクラスのhelloメソッドをオーバーライドしてください。

B. 先ほど作成したChildrenクラスでインスタンスを生成し、helloメソッドを実行してください。

C. Childrenクラスのhelloメソッドを、親クラスのhelloメソッドも呼び出すように修正して、実行してください。


Parentクラス

class Parent{
    public void hello(){
        System.out.println("hello!");
    }
}
