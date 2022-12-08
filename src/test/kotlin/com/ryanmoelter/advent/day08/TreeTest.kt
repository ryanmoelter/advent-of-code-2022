package com.ryanmoelter.advent.day08

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class TreeTest : FunSpec({
  context("example should work") {
    val input = """
      30373
      25512
      65332
      33549
      35390
    """.trimIndent()

    test("for part 1") {
      findVisibleTrees(input) shouldBeExactly 21
    }

    test("for part 2") {
      findMostScenicTree(input) shouldBeExactly 8
    }
  }
})
