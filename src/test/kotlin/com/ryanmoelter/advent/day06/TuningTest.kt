package com.ryanmoelter.advent.day06

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.row
import io.kotest.datatest.withData
import io.kotest.matchers.ints.shouldBeExactly

class TuningTest : FunSpec({

  context("findPacketStart") {
    withData(
      nameFn = { "${it.a} -> ${it.b}" },
      row("mjqjpqmgbljsphdztnvjfqwrcgsmlb", 7),
      row("bvwbjplbgvbhsrlpgdmjqwftvncz", 5),
      row("nppdvjthqldpwncqszvftbrmjlhg", 6),
      row("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg", 10),
      row("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw", 11),
    ) { (input, output) ->
      findPacketStart(input) shouldBeExactly output
    }
  }

  context("findMessageStart") {
    withData(
      nameFn = { "${it.a} -> ${it.b}" },
      row("mjqjpqmgbljsphdztnvjfqwrcgsmlb", 19),
      row("bvwbjplbgvbhsrlpgdmjqwftvncz", 23),
      row("nppdvjthqldpwncqszvftbrmjlhg", 23),
      row("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg", 29),
      row("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw", 26),
    ) { (input, output) ->
      findMessageStart(input) shouldBeExactly output
    }
  }
})
