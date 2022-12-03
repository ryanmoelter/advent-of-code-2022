package com.ryanmoelter.advent.day03

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class RucksacksTest : FunSpec({
  context("example should work") {
    val input = """
      vJrwpWtwJgWrhcsFMMfFFhFp
      jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
      PmmdzqPrVvPwwTWBwg
      wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
      ttgJtRGJQctTZtZT
      CrZsJsPPZsGzwwsLwLmpwMDw
    """.trimIndent()

    test("for part 1") {
      calculateSeparatedPriority(input) shouldBeExactly 157
    }

    test("for part 2") {
      calculateBadgePriority(input) shouldBeExactly 70
    }
  }

})
