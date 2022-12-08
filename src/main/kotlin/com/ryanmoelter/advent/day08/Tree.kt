package com.ryanmoelter.advent.day08

typealias Grid<T> = List<List<T>>

fun main() {
  println(findMostScenicTree(treeData))
}

fun findMostScenicTree(input: String): Int {
  val grid = input.parseGrid()

  val spaceGrid =
    grid.spaceRight() times grid.spaceLeft() times grid.spaceUp() times grid.spaceDown()

  return spaceGrid.maxOf { row -> row.max() }
}

private infix fun Grid<Int>.times(other: Grid<Int>): Grid<Int> =
  mapIndexed { rowIndex, row ->
    row.mapIndexed { columnIndex, space -> space * other[rowIndex][columnIndex] }
  }

fun Grid<Int>.spaceRight(): Grid<Int> = map { it.spaceToRight() }

fun Grid<Int>.spaceLeft(): Grid<Int> = map { it.reversed() }
  .spaceRight()
  .map { it.reversed() }

private fun Grid<Int>.spaceDown(): Grid<Int> = columns()
  .spaceRight()
  .columns()

private fun Grid<Int>.spaceUp(): Grid<Int> = reversed()
  .columns()
  .spaceRight()
  .columns()
  .reversed()

// Look right
fun List<Int>.spaceToRight(): List<Int> = mapIndexed { index, height ->
  var workingIndex = index + 1
  var lastHeight = -1
  var trees = 0
  while (workingIndex <= this.lastIndex && lastHeight < height) {
    trees++
    lastHeight = this[workingIndex]
    workingIndex++
  }
  trees
}

// Part 1

fun findVisibleTrees(input: String): Int {
  val grid = input.parseGrid()

  val visibleGrid = grid.lookLeft() or grid.lookRight() or grid.lookDown() or grid.lookUp()

  return visibleGrid.sumOf { row -> row.sumOf { visible -> if (visible) 1 else 0 as Int } }
}

private infix fun Grid<Boolean>.or(other: Grid<Boolean>): Grid<Boolean> =
  mapIndexed { rowIndex, row ->
    row.mapIndexed { columnIndex, visible -> visible || other[rowIndex][columnIndex] }
  }

private fun Grid<Int>.lookLeft(): Grid<Boolean> = map { it.look() }

private fun Grid<Int>.lookRight(): Grid<Boolean> = map { it.reversed() }
  .lookLeft()
  .map { it.reversed() }

private fun Grid<Int>.lookUp(): Grid<Boolean> = columns()
  .lookLeft()
  .columns()

private fun Grid<Int>.lookDown(): Grid<Boolean> = reversed()
  .columns()
  .lookLeft()
  .columns()
  .reversed()

private fun List<Int>.look(): List<Boolean> {
  var tallestSoFar = -1
  return fold(emptyList()) { acc, height ->
    acc + if (height > tallestSoFar) {
      tallestSoFar = height
      true
    } else {
      false
    }
  }
}

private fun String.parseGrid(): Grid<Int> = lines()
  .map { it.map { char -> char.digitToInt() } }

private fun <T> Grid<T>.columns(): Grid<T> = this[0].indices.map { getColumn(it) }

private fun <T> Grid<T>.getColumn(index: Int) = map { it[index] }


private fun Grid<Int>.print() {
  println(fold("") { acc, row ->
    acc + row.fold("") { rowString, space ->
      rowString + space
    } + "\n"
  })
}
