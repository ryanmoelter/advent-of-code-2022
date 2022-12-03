package com.ryanmoelter.advent.day02

import com.ryanmoelter.advent.day02.Result.*
import com.ryanmoelter.advent.day02.Shape.*

enum class Shape(val value: Int) {
  ROCK(1), PAPER(2), SCISSORS(3);

  infix fun vs(other: Shape) = when (this) {
    ROCK -> when (other) {
      ROCK -> DRAW
      PAPER -> LOSE
      SCISSORS -> WIN
    }

    PAPER -> when (other) {
      ROCK -> WIN
      PAPER -> DRAW
      SCISSORS -> LOSE
    }

    SCISSORS -> when (other) {
      ROCK -> LOSE
      PAPER -> WIN
      SCISSORS -> DRAW
    }
  }
}

enum class Result(val value: Int) {
  WIN(6), LOSE(0), DRAW(3);

  fun getMine(other: Shape): Shape = when (this) {
    WIN -> when (other) {
      ROCK -> PAPER
      PAPER -> SCISSORS
      SCISSORS -> ROCK
    }
    LOSE -> when (other) {
      ROCK -> SCISSORS
      PAPER -> ROCK
      SCISSORS -> PAPER
    }
    DRAW -> other
  }
}

class Match(other: Shape, mine: Shape) {
  val value = mine.value + (mine vs other).value

  constructor(other: Shape, result: Result) : this(other, result.getMine(other))
}

fun Char.toShape() = when (this) {
  'A', 'X' -> ROCK
  'B', 'Y' -> PAPER
  'C', 'Z' -> SCISSORS
  else -> error("Invalid: $this")
}

fun Char.toResult() = when (this) {
  'X' -> LOSE
  'Y' -> DRAW
  'Z' -> WIN
  else -> error("Invalid: $this")
}

fun main() {
  println(calculateScoreByResults(day02Input))
}

fun calculateScoreByResults(input: String): Int = input.lineSequence()
  .filter { it.isNotBlank() }
  .map { line -> line.split(' ').map { it.first() } }
  .map { Match(it[0].toShape(), it[1].toResult()) }
  .map { it.value }
  .sum()

fun calculateScoreByShapes(input: String): Int = input.lineSequence()
  .filter { it.isNotBlank() }
  .map { line -> line.split(' ').map { it.first() }.map { it.toShape() } }
  .map { Match(it[0], it[1]) }
  .map { it.value }
  .sum()
