import org.scalatest.{BeforeAndAfter, FlatSpec}
import org.scalatest.Matchers._

/**
  * Created by Nenyi on 16/03/2017.
  */
class FizzBuzzTest extends FlatSpec with BeforeAndAfter with FizzBuzz {

  val list = 0 to 100
  "fizzBuzz" should "produce a string of the int it is passed" in {
    list.filterNot(fizz(_)).filterNot(buzz(_)).foreach(i => {
      fizzBuzz(i) shouldBe i.toString
    })
  }
  it should "be able to make multiples of 3 = to 'Fizz'" in {
    fizzBuzz(list(3)) shouldEqual "Fizz"
    fizzBuzz(list(6)) shouldEqual "Fizz"
    fizzBuzz(list(9)) shouldEqual "Fizz"
    fizzBuzz(list(12)) shouldEqual "Fizz"
    fizzBuzz(list(18)) shouldEqual "Fizz"
    fizzBuzz(list(21)) shouldEqual "Fizz"
    fizzBuzz(list(24)) shouldEqual "Fizz"
    fizzBuzz(list(99)) shouldEqual "Fizz"
  }
  it should "be able to make multiples of 5 = to 'Buzz'" in {
    fizzBuzz(list(5)) shouldEqual "Buzz"
    fizzBuzz(list(10)) shouldEqual "Buzz"
    fizzBuzz(list(20)) shouldEqual "Buzz"
    fizzBuzz(list(25)) shouldEqual "Buzz"
    fizzBuzz(list(35)) shouldEqual "Buzz"
    fizzBuzz(list(40)) shouldEqual "Buzz"
    fizzBuzz(list(50)) shouldEqual "Buzz"
    fizzBuzz(list(55)) shouldEqual "Buzz"
    fizzBuzz(list(65)) shouldEqual "Buzz"
    fizzBuzz(list(70)) shouldEqual "Buzz"

  }
  it should "be able to make multiples of 3 and 5 = to 'FizzBuzz'" in {
    fizzBuzz(list(30)) shouldEqual "FizzBuzz"
    fizzBuzz(list(15)) shouldEqual "FizzBuzz"
    fizzBuzz(list(45)) shouldEqual "FizzBuzz"
    fizzBuzz(list(60)) shouldEqual "FizzBuzz"
    fizzBuzz(list(75)) shouldEqual "FizzBuzz"
    fizzBuzz(list(90)) shouldEqual "FizzBuzz"
  }
}
