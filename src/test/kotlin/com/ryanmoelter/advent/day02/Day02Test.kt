package com.ryanmoelter.advent.day02

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class Day02Test : FunSpec({
  context("example should work") {
    val input = """
      A Y
      B X
      C Z
    """.trimIndent()

    test("for part 1") {
      calculateScoreByShapes(input) shouldBeExactly 15
    }

    test("for part 2") {
      calculateScoreByResults(input) shouldBeExactly 12
    }
  }

})
