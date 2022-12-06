package com.ryanmoelter.advent.day05

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class StacksTest : FunSpec({

  context("example should work") {

    val stacks = """
          [D]    
      [N] [C]    
      [Z] [M] [P]
       1   2   3 
    """.trimIndent()

    val instructions = """
      move 1 from 2 to 1
      move 3 from 1 to 3
      move 2 from 2 to 1
      move 1 from 1 to 2
    """.trimIndent()

    test("parseStacks") {
      parseStacks(stacks) shouldBe Stacks(
        listOf(
          ArrayDeque(listOf('Z', 'N')),
          ArrayDeque(listOf('M', 'C', 'D')),
          ArrayDeque(listOf('P')),
        )
      )
    }

    test("parseInstructions") {
      parseInstructions(instructions) shouldBe listOf(
        Instruction(number = 1, from = 2, to = 1),
        Instruction(number = 3, from = 1, to = 3),
        Instruction(number = 2, from = 2, to = 1),
        Instruction(number = 1, from = 1, to = 2),
      )
    }

    test("parseInstructions with two digits") {
      parseInstructions("move 14 from 1 to 3") shouldBe listOf(
        Instruction(14, 1, 3),
      )
    }

    test("for part 1") {
      findTopsMovingOne(stacks, instructions) shouldBe "CMZ"
    }

    test("for part 2") {
      findTopsMovingMultiple(stacks, instructions) shouldBe "MCD"
    }
  }
})
