package com.ryanmoelter.advent.day05

fun main() {
  println(findTopsMovingMultiple(day05Stacks, day05Instructions))
}

fun findTopsMovingMultiple(stacksInput: String, instructionsInput: String): String {
  val stacks = parseStacks(stacksInput)
  val instructions = parseInstructions(instructionsInput)
  instructions.forEach { instruction ->
    stacks.moveMultiple(instruction)
  }
  return stacks.getTops()
}

fun findTopsMovingOne(stacksInput: String, instructionsInput: String): String {
  val stacks = parseStacks(stacksInput)
  val instructions = parseInstructions(instructionsInput)
  instructions.forEach { instruction ->
    stacks.move(instruction)
  }
  return stacks.getTops()
}

fun parseStacks(stacksString: String): Stacks {
  val stackDescriptions = stacksString.lines()
    .reversed()
    .filter { it.isNotBlank() }
  val namesLine = stackDescriptions.first()
  val contentsLines = stackDescriptions
    .subList(1, stackDescriptions.size)

  val numStacks = namesLine.filter { !it.isWhitespace() }.length
  val stacks = Stacks(buildList {
    repeat(numStacks) {
      add(ArrayDeque())
    }
  })
  contentsLines.forEach { line ->
    val startingIndex = 1

    repeat(numStacks) { index ->
      val currentValue = line[startingIndex + (index * 4)]
      if (currentValue.isLetter()) {
        stacks.add(currentValue, index)
      }
    }
  }

  return stacks
}

fun parseInstructions(instructionString: String): List<Instruction> = instructionString.lines()
  .filter { it.isNotBlank() }
  .map { line -> line.filter { !it.isLetter() }.trim() }
  .map { line -> line.split(' ').filter { it.isNotBlank() } }
  .map { (number, from, to) -> Instruction(number.toInt(), from.toInt(), to.toInt()) }

data class Stacks(val stacks: List<ArrayDeque<Char>>) {
  fun getTops() = stacks.fold("") { acc, chars -> acc + chars.last() }.also { println(this) }

  fun add(value: Char, to: Int) {
    stacks[to] += value
  }

  fun moveMultiple(instruction: Instruction) {
    stacks[instruction.to - 1].addAll(stacks[instruction.from - 1].takeLast(instruction.number))
    repeat(instruction.number) {
      stacks[instruction.from - 1].removeLast()
    }
  }

  fun move(instruction: Instruction) {
    repeat(instruction.number) {
      stacks[instruction.to - 1].add(stacks[instruction.from - 1].removeLast())
    }
  }
}

data class Instruction(val number: Int, val from: Int, val to: Int)
