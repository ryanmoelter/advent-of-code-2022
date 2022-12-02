package com.ryanmoelter.advent.day01

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class Day01Test : FunSpec({
  test("example should work") {
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
    countCalories(input) shouldBeExactly 24_000
  }

})
