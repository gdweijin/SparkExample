package com.weijin.test


object HelloWorld {
  def main(args: Array[String]) {
    println(max(3, 5));
    greet();
    whileTest();
    forEachTest();
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y;
  }

  def greet() = {
    println("HelloWorld");
  }
  def whileTest() = {
    val array = new Array[Int](3);
    array(0) = 1;
    array(1) = 2;
    array(2) = 3;
    var i = 0;
    while (i < array.length) {
      println(array(i));
      i += 1;
    }
  }
  def forEachTest() = {

    Array(1, 2, 3).foreach((a: Int) => print(a + " "));
    println();

    Array(1, 2, 3).foreach(print);
    println();

    //此处输出为：333435。+‘ ’后，默认转化未char类型了。  
    Array(1, 2, 3).foreach((a: Int) => print(a + ' '));
    println();

    "hello".foreach((s: Char) => print(s + " "));
    println();
  }
}  