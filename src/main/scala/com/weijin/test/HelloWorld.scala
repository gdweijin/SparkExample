package com.weijin.test
//http://blog.csdn.net/laiwenqiang/article/details/40978589
import org.slf4j.Logger
import org.slf4j.LoggerFactory
object HelloWorld {
  def main(arg: Array[String]) = {
    //    println(max(3, 5));
    //    greet();
    //    whileTest();
    //    forEachTest();
    //    caseTest();
    //    caseTest2();
//    mapTest(2);
//    forTest()
//    foo(10) // "value is 10"
//    foo(3.14) // "value is 3.14"
//    foo("hello") // "value is hello"
//    println(f(1));
      Array("a","b","c","d").foreach(a=>print(a))
  }
  /**
   * 映射
   */
  def f:Int=>Double = { // 请看做 def f: (Int=>Double) = {...}
    case 1 => 0.1
    case 2 => 0.2
    case _ => 0.0
}
  def foo[T](a: T) = println("value is " + a)

  def mapTest(i: Int) = {
    val map = Map(1 -> "this a map", 3 -> 4);
    println(map(1));
  }
  def forTest() = {
    val ss = List(1, 2, 3);

    for (i <- 1 to 10; j = i * i) println(j)
    for (s <- ss) mapTest(s)
    for (i <- 0 to 2) mapTest(i) // 包含n，即Range(0,1,2,...,n,n+1)
    for (i <- 0 until 2) mapTest(i) // 不包含n，即Range(0,1,2,3,...,n)
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

    //此处输出为：333435。+‘ ’后，默认转化未char类型了。 Scala编程 
    Array(1, 2, 3).foreach((a: Int) => print(a + ' '));
    println();

    "hello".foreach((s: Char) => print(s + " "));
    println();
  }

  def f(v: Any) = v match {
    case null      => "null"
    case i: Int    => { println("int") }
    case s: String => s
    case _         => "others"
  }
  def caseTest() = {
    println("caseTest case 匹配--------->");
    (1 to 20) foreach {

      case x if (x % 15 == 0) => printf("%2d:15n\n", x)

      case x if (x % 3 == 0)  => printf("%2d:3n\n", x)

      case x if (x % 5 == 0)  => printf("%2d:5n\n", x)

      case x                  => printf("%2d\n", x)

    }
  }
  def caseTest2() = {
    println("caseTest case 匹配写法2--------->");

    (1 to 20) map (x => (x % 3, x % 5) match {
      case (0, 0) => printf("%2d:15n\n", x)
      case (0, _) => printf("%2d:3n\n", x)
      case (_, 0) => printf("%2d:5n\n", x)
      case (_, _) => printf("%2d\n", x)
    })

  }
  def tryTest() = {
    //    var f = openFile()
    //    try {
    //      f = new FileReader("input.txt")
    //    } catch {
    //      case ex: FileNotFoundException => // Handle missing file
    //      case ex: IOException           => // Handle other I/O error
    //    } finally {
    //      f.close()
    //    }
  }
}  