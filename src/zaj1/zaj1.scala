package zaj1

import scala.::

object zaj1 extends App {
  val l = List(1,2,3,4)
  val l2 = List(4,6,2,1,5,7)
  val Sheep = List(
    true,  true,  true,  false,
    true,  true,  true,  true,
    true,  false, true,  false,
    true,  false, false, true,
    true,  true,  true,  true,
    false, false, true,  true
  )
  val result = Sheep.filter(x => x == true).length
  //  println(result)
  val slovo = "Ala ma kota"
//  println(slovo.substring(1,slovo.length-1))
  // count elements in array that are true


  val list = List(1,2,3,4,5,6)
  // sort descending
//  println(list.sortWith(_ > _))
//  val cos = 542
//  val arr = cos.toString.split("").toList

  // ze stringu znajdz najwieksza i najmniejsza wartosc
  def highAndLow(numbers: String): String = {
    val xs = numbers.split(' ').map(_.toInt)
    println(xs.mkString("Array(", ", ", ")"))
    s"${xs.max} ${xs.min}"
  }
//  println(highAndLow("3 2 1 5 4 6 7 9 8"))

  // znajdz ilosc powtorzen kazdej literki
  def orderedCount(chars: String): List[(Char, Int)] = {
    chars.distinct.map(c=>(c,chars.count(_ == c))).toList
  }
  //  println(orderedCount("ala ma kota"))


  // slowo najczesciej powtarzane
  def Repetition(word: String): (String, Int) = {
    if(word.isEmpty) ("",0) else word.span(_ == word.head) match {
      case (a, b) => Seq((a.head.toString, a.size), Repetition(b)).maxBy(_._2)
    }
  }
  //  println(Repetition("Ala maaa kota"))


  def CenturyFromYear(year: Int ): Int = {
    (year + 99)/100
  }

  // sort number of list
  def SortList(nums: List[Int]): List[Int] = {
    nums.sorted
  }
  //  println(SortList(l2))
  // scrabble
  def countPoints(z: Char): Int = {
    z match {
      case 'a' | 'e' | 'i' | 'n' | 'o' | 'r' | 's' | 'w' | 'z' => 1
      case 'c' | 'd' | 'k' | 'l' | 'm' | 'p' | 't' | 'y' => 2
      case 'b' | 'g' | 'h' | 'j' | 'ł' | 'u' => 3
      case 'ą' | 'ę' | 'f' | 'ó' | 'ś' | 'ż' => 5
      case 'ć' => 6
      case 'ń' => 7
      case 'ź' => 9
      case _ => 0

    }
  }
  //  println(slovo.map(z => countPoints(z)).sum)

  // reverse the list
  def reversed[T](input: List[T]): List[T] = input match {
    case List() => input
    case x :: xs => reversed(xs) ::: List(x)
  }

  def sumArray(input: List[Int]): Int = {
    val sum: Int = input.reduce((x,y) => x+y)
    sum
  }

  def sumArray2(list: List[Int]): Int = list match {
    case Nil => 0
    case x :: rest => x + sumArray2(rest)
  }

}