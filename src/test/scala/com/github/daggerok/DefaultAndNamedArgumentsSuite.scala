/*
 * This Scala Testsuite was generated by the Gradle 'init' task.
 */
package com.github.daggerok

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class DefaultAndNamedArgumentsSuite extends AnyFunSuite {

  def greeting(name: String = "Anonymous", age: Int = 0) =
    s"Hey, My name is: $name, and I'm $age years old!"

  test("should have default args") {
    assert(greeting("Max", 36) == "Hey, My name is: Max, and I'm 36 years old!")
    assert(greeting("Bob") == "Hey, My name is: Bob, and I'm 0 years old!")
    assert(greeting() == "Hey, My name is: Anonymous, and I'm 0 years old!")
  }

  test("should have named args") {
    assert(greeting(name = "Max", age = 36) == "Hey, My name is: Max, and I'm 36 years old!")
    assert(greeting(name = "Bob") == "Hey, My name is: Bob, and I'm 0 years old!")
    assert(greeting(age = 999) == "Hey, My name is: Anonymous, and I'm 999 years old!")
  }
}
