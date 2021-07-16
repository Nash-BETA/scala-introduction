# scala-introduction

## ディレクトリ名について
 + 「introduction-」で始める奴は実践Scala入門の本に書いてある内容の実装やメモ


## 復習メモ
**コンパイルコマンド**
```
$ scalac [ファイル名]
```

**整数が存在するかもしれないという状態を表現する型**

```
Option[Int]
```


**コマンドでアクセスPOST**

windows
```
## GET
$ curl  localhost:9000/hello

## POST
$ curl-request POST localhost:9000/hello
{"hello":"world","language":"scala"}
```

mac
```
## GET
$ http localhost:9000/hello

## POST
$ http POST localhost:9000/hello
{"hello":"world","language":"scala"}
```
