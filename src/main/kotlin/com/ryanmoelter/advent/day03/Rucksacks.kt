package com.ryanmoelter.advent.day03

fun main() {
  println(calculateBadgePriority(day03input))
}

fun calculateBadgePriority(input: String): Int = input.lineSequence()
  .fold(listOf(emptyList<String>())) { groups, line ->
    val lastGroup = groups.last()
    if (lastGroup.size < 3) {
      groups.minus(element = lastGroup).plus(element = lastGroup + line)
    } else {
      groups.plus(element = listOf(line))
    }
  }
  .map { group ->
    group.map { line -> line.toSet() }
      .fold(emptySet<Char>()) { acc, chars ->
        if (acc.isEmpty()) {
          chars
        } else {
          acc.intersect(chars)
        }
      }
  }
  .sumOf { set ->
    assert(set.size == 1)
    set.sumOf { it.toPriority() }
  }

fun calculateSeparatedPriority(input: String): Int = input.lineSequence()
  .map { line -> line.take(line.length / 2) to line.takeLast(line.length / 2) }
  .map { (first, second) -> first.toSet().intersect(second.toSet()) }
  .map { set ->
    assert(set.size == 1)
    set.sumOf { it.toPriority() }
  }
  .sum()

fun Char.toPriority(): Int = if (this.isUpperCase()) {
  this - 'A' + 27
} else {
  this - 'a' + 1
}
