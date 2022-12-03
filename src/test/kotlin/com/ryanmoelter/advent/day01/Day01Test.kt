package com.ryanmoelter.advent.day01

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class Day01Test : FunSpec({
  context("example should work") {
    val input = """
      1000
      2000
      3000

      4000

      5000
      6000

      7000
      8000
      9000

      10000
    """.trimIndent()

    test("for part 1") {
      countCalories(input) shouldBeExactly 24_000
    }

    test("for part 2") {
      countTopCalories(input, 3) shouldBeExactly 45_000
    }
  }

})
