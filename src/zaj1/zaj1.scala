package zaj1

object zaj1 extends App {
  val l = List(1,2,3,4)
  println(sumArray(l))
  println(l.sum)
  println(sumArray2(l))

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