package com.weijin.test

import java.io.File

class A(){
  val name = "weijin"
  private val age = "20"
  def getName():String={
    this.name
  }
  def getName( str:String):String = {
    this.name+str
  }
}

class B{
  
}

class C{
  
}
object C{
  val a = new A();
//  println(a.name);
  println(a getName)
  println(a getName "hi")
   def main(args: Array[String]) {
    println(22);
  }
}