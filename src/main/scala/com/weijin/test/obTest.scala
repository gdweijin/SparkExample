package com.weijin.test

import org.apache.spark.sql._
object obTest {
  def main(args: Array[String]): Unit = {

    val innerStruct = new
      StructType(
        StructField("f1", IntegerType, true) ::
          StructField("f2", LongType, false) ::
          StructField("f3", BooleanType, false) :: Nil)

    val struct = StructType(
      StructField("a", innerStruct, true) :: Nil)

    // Create a Row with the schema defined by struct
    val row = Row(Row(1, 2, true))
    println(row)
  }

}