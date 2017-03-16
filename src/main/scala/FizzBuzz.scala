/**
  * Created by Nenyi on 16/03/2017.
  */
trait FizzBuzz {
  val fizz = (i: Int) => (i % 3 == 0)
  val buzz = (i: Int) => (i % 5 == 0)

  def fizzBuzz(value: Int): String = {
    (fizz(value), buzz(value)) match {
      case (true, true) => "FizzBuzz"
      case (true, false) => "Fizz"
      case (false, true) => "Buzz"
      case _ => value.toString
    }
  }
}
