package com.ryanmoelter.advent.day04

fun main() {
  println(findOverlapping(day04input))
}

fun findOverlapping(input: String): Int = input.lines()
  .toSectionRanges()
  .map { it.isOverlapping() }
  .sumOf { if (it) 1 else 0 as Int }

fun findFullyContained(input: String): Int = input.lines()
  .toSectionRanges()
  .map { it.isEitherFullyContained() }
  .sumOf { if (it) 1 else 0 as Int }

fun List<String>.toSectionRanges(): List<SectionRange> = map { pairString -> pairString.split(',') }
  .map { pair ->
    pair.map { rangeString ->
      rangeString
        .split('-')
        .map { it.toInt() }
    }
      .map { (first, second) -> first..second }
  }
  .map { (first, second) -> SectionRange(first, second) }

data class SectionRange(val first: IntRange, val second: IntRange) {
  fun isEitherFullyContained(): Boolean {
    val firstIsContained = second.contains(first.first) && second.contains(first.last)
    val secondIsContained = first.contains(second.first) && first.contains(second.last)
    return firstIsContained || secondIsContained
  }

  fun isOverlapping(): Boolean {
    val firstIsContained = second.contains(first.first) || second.contains(first.last)
    val secondIsContained = first.contains(second.first) || first.contains(second.last)
    return firstIsContained || secondIsContained
  }
}
