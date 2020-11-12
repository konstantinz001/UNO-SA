package UNO.aview

class TUI {

  import de.htwg.se.sudoku.model.{Grid,GridCreator,Solver}

  class Tui {

    def processInputLine(input: String, grid:Grid):Grid = {
      input match {
        case "q" => grid
        case "n"=> new Grid(9)
        case "r" => new GridCreator(9).createRandom(16)
        case "s" =>
          val (success, solvedGrid) = new Solver(grid).solve;
          if (success) println("Puzzle solved")else println("This puzzle could not be solved!")
          solvedGrid
        case _ => {
          input.toList.filter(c => c != ' ').map(c => c.toString.toInt) match {
            case row :: column :: value :: Nil => grid.set(row, column, value)
            case _ => grid
          }
        }
      }
    }
  }
}
package aview

import java.util.Scanner

import model.PlayingField

class TUI(sp:PlayingField) {
  var currentInput = (0,0)
  val s = new Scanner(System.in)

  def input(): Int = {
    println("Koordinaten eingeben!")
    print("x = ")
    val x = s.nextInt()
    if (x >= sp.width) {
      return 1
    }
    print("y = ")
    val y = s.nextInt()
    if (y >= sp.hight) {
      return 1
    }
    currentInput = (x,y)
    sp.getCell(x, y).covered = true
    return 0
  }

  def output() = {
    for (i <- 0 to sp.hight - 1) {
      print('|')
      for (j <- 0 to sp.width - 1) {
        val c = sp.getCell(j, i)
        if (c.covered) {
          symbolOutput(c.symbol)
        } else {
          print("#")
        }
        print('|')
      }
      println()
    }
    currentsymbolOutput()
  }
  def currentsymbolOutput() = {
    val a = sp.getCell(currentInput._1,currentInput._2).symbol
    print("(x: "+ currentInput._1 + ", y: " + currentInput._2 + ") -> |")
    symbolOutput(a)
    println("|")
  }
  def symbolOutput(a: Int) = {
    if(a < 5 & a > 0) print(a)
    else if (a == 5) print("*")
    else print(" ")
  }
}
