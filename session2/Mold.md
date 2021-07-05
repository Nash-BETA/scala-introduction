# 型について

## Int型　32ビット符号付き整数
 + 1や2、-1、100など、Int型が表現できる範囲の数値をそのまま書くとInt型のリテラルになる
```
1+1
val res0: Int = 2
```

## Long型　64ビット符号付き整数
 + Int型で収まらない時に使用される
 + Long型が表現できる範囲は-9,223,372,036,854,775,808から9,223,372,036,854,775,807まで
```
scala> 1L
val res1: Long = 1
```

## Byte型　8ビット符号付き整数
 + 表現できる範囲は-128から127まで
```
scala> val a:Byte = -128
val a: Byte = -128

scala> val b:Byte = 128
                    ^
       error: type mismatch;
        found   : Int(128)
        required: Byte
```

## Short型　16ビット符号付き整数
+ Short型を使う機会は実用上あまり多くありませんが、「Byteが扱える範囲外の数値を扱いたいがInt（4バイト）だとメモリを消費し過ぎる」といったときに、Short型（2バイト）を使うことでメモリを節約できる
```
 scala> val a: Short = 32767
 a: Short = 32767

 scala> val b: Short = 32768
 <console>:11: error: type mismatch;
  found   : Int(32768)
  required: Short
        val b: Short = 32768
               ^
```

## Short型　16ビット符号なし整数
 + Char型は16ビット符号なし整数を表す型。
    + UnicodeのU+0000からU+FFFFまでに対応することを想定されている型で、文字型として扱うことが一般的。
    +  'a'や'b'、'c'、'1'、'2'、など、1文字をシングルクオートで囲むとChar型のリテラル。
    + 改行文字やタブ文字などは\（エスケープ文字）を付ける必要があります。たとえば、次のような文字を表現する場合にエスケープ文字を使う必要がある。 
       + \rと\nで表される改行記号
       + \tで表されるタブ文字
       + \uxxxxで表されるユニコードエスケープ
       + Unicodeのコードポイント（2バイト）を16進数表記で直接指定する方
```
scala> '\n'
val res1: Char =


scala> '\r'
val res2: Char =

scala> '"'
val res3: Char = "
```

## Double型　64ビット浮動小数点数
 + 浮動小数点数を扱うときはこの型で扱うことが基本
 + dまたはDを付けることでDouble型のリテラルになる
```
scala> 1.0
val res4: Double = 1.0

scala> 2.5
val res5: Double = 2.5

scala> 2.5D
val res6: Double = 2.5

scala> 3.4d
val res7: Double = 3.4
```

## Float型　32ビット浮動小数点数
 + 大量の浮動小数点数を扱う場合など消費メモリ容量が重要な場面にFloatを使うとメモリを節約できる可能性がある
```
scala> 1.0f
val res8: Float = 1.0
```
## Boolean型　真偽値
 + Boolean型はtrueまたはfalseの2つの値のみを持つ型
```
scala> true
val res9: Boolean = true
scala> false
val res11: Boolean = false
```

# Scala特有の型
## Unit 意味のある値を持たない型
+ Unit型はJavaのvoidとほぼ同じ役割を持つ型です

## AnyVal/AnyRef/Any 型をまとめるための型
 + Byte、Short、Int、Long、Float、Double、Booolean、UnitはすべてAnyValのサブクラスとして定義
 + AnyRefはすべての参照型注4をまとめるための型
 + Anyはすべての型のスーパークラスで、AnyRefだけでなくAnyValのスーパークラス

## Null Javaのnullのための型
 + Scalaでは一般的にnullを直接使うことはありませんが、Javaのメソッドなどを呼ぶときや、値が返ってくるときにnullが必要なことがあります。そのような用途のために、Scalaではnullも使うことができます。


