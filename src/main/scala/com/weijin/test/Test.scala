package com.weijin.test

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

/**
 * Created by Administrator on 2015/9/23.
 */
object Test {

  def main(args: Array[String]): Unit = {
    println("123")
     val sc = new SparkContext("local[1]", "CollectAsMap Test")
    val data = Array[(String, Int)](("A", 1), ("B", 2),("B", 3), ("C", 4),("C", 5), ("C", 6))
    
    // as same as "val pairs = sc.parallelize(data, 3)"
    val pairs = sc.makeRDD(data, 3)
    
    val result = pairs.collectAsMap

    // output Map(A -> 1, C -> 6, B -> 3)
    print(result)
  }
}
