package com.ryanmoelter.advent.day04

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class CleanupTest : FunSpec({

  context("example should work") {
    val input = """
      2-4,6-8
      2-3,4-5
      5-7,7-9
      2-8,3-7
      6-6,4-6
      2-6,4-8
    """.trimIndent()

    test("for part 1") {
      findFullyContained(input) shouldBeExactly 2
    }

    test("for part 2") {
      findOverlapping(input) shouldBeExactly 4
    }
  }
})
