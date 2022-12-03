package com.ryanmoelter.advent.day01

fun main() {
  println(countTopCalories(day01Input, 3))
}

fun countTopCalories(input: String, numberOfDwarfs: Int): Int {
  var heaviestDwarves = emptyList<Int>()
  var currentDwarf = 0
  input.lines().forEach { line ->
    if (line.isNotBlank()) {
      currentDwarf += line.toInt()
    } else {
      val min = heaviestDwarves.minOrNull()
      if (min == null || currentDwarf > min) {
        if (min != null && heaviestDwarves.size >= numberOfDwarfs) {
          heaviestDwarves = heaviestDwarves - min
        }
        heaviestDwarves = heaviestDwarves + currentDwarf
      }
      currentDwarf = 0
    }
  }
  val min = heaviestDwarves.min()
  if (currentDwarf > min) {
    if (heaviestDwarves.size >= numberOfDwarfs) {
      heaviestDwarves = heaviestDwarves - min
    }
    heaviestDwarves = heaviestDwarves + currentDwarf
  }
  return heaviestDwarves.sum()
}

fun countCalories(input: String): Int {
  var heaviestDwarf = 0
  var currentDwarf = 0
  input.lines().forEach { line ->
    if (line.isNotBlank()) {
      currentDwarf += line.toInt()
    } else {
      if (currentDwarf > heaviestDwarf) {
        heaviestDwarf = currentDwarf
      }
      currentDwarf = 0
    }
  }
  if (currentDwarf > heaviestDwarf) {
    heaviestDwarf = currentDwarf
  }
  return heaviestDwarf
}

