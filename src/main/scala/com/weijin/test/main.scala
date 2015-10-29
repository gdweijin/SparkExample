package com.weijin.test
import org.slf4j.LoggerFactory


object MainTest{
  var verbose = false  // 记录标识，以便能同时对-h和-v做出响应
 
  def main(args: Array[String]) {
    for (a <- args) a match {
      case "-h" | "-help"    =>
        println("Usage: scala Main [-help|-verbose]")
      case "-v" | "-verbose" =>
        verbose = true
      case x => // 这里x是临时变量
        println("Unknown option: '" + x + "'")
    }
    if (verbose) println("How are you today?")
  }
}