package com.ryanmoelter.advent.day06

fun main() {
  println(findMessageStart(tuningData))
}

fun findMessageStart(input: String): Int = findStart(input, windowSize = 14)

fun findPacketStart(input: String): Int = findStart(input, windowSize = 4)

private fun findStart(input: String, windowSize: Int): Int {
  var window = input.take(windowSize)
  for (index in input.indices) {
    window += input[index]
    if (window.length > windowSize) {
      window = window.drop(window.length - windowSize)
    }

    if (window.length == windowSize && window.toSet().size == window.length) {
      return index + 1
    }
  }
  error("Reached end of string with no packet starts")
}
