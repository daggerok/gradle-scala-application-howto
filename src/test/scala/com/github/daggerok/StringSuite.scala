/*
 * This Scala Testsuite was generated by the Gradle 'init' task.
 */
package com.github.daggerok

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

import scala.jdk.CollectionConverters.MapHasAsScala

@RunWith(classOf[JUnitRunner])
class StringSuite extends AnyFunSuite {
  test("scala string should have prepend and append character operation") {
    val mid = " n "
    val all = 'o' +: mid :+ 'e'
    assert("o n e" == all)
  }

  test("scala string should reverse") {
    assert("abc".reverse == "cba")
  }

  test("scala string can take some substring") {
    assert("cucumber".take(3) == "cuc")
    assert("cucumber".head == 'c')
    assert("cucumber".tail.drop(2) :+ 'o' == "umbero")
  }

  test("should S-interpolate") {
    val a = "a"
    val two = 2
    val b = "b"
    assert("a 2 b" == s"$a $two $b")
  }

  test("should F-interpolate") {
    val two = 123.4567890
    val b = "number"
    // // System.getenv().forEach((k, v) => println(s"${k.toLowerCase.contains("ru")}, ${v.toLowerCase.contains("ru")}, $k => $v"))
    // System.getProperties.forEach((k, v) => println(s"${k.toString.toLowerCase.contains("ru")}, ${v.toString.toLowerCase.contains("ru")}, $k => $v"))
    val props = System.getProperties.asScala
    val lang = props("user.language")
    if (lang == "ru")
      assert("an approximate 123,457 number" == f"an approximate $two%3.3f $b%s")
    else
      assert("an approximate 123.457 number" == f"an approximate $two%3.3f $b%s")
  }

  test("should raw-interpolate") {
    assert("this is a new line symbol: \\n" == raw"this is a new line symbol: \n")
    assert("this is a new line symbol: \\n" != "this is a new line symbol: \n")
  }
}
