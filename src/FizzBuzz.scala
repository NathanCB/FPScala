object FizzBuzz {
/*
* Fizz Buzz
*
Write a program that prints the numbers from 1 to 100.
For multiples of three print "Fizz"
For multiples of five print "Buzz"
For numbers which are multiples of both three and five print "FizzBuzz"

1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz ... etc up to 100
*/

def main(args: Array[String]): Unit = {
  def fizzBuzz(i: Int) = {
  if (i % 3 == 0) "fizz"
  else if (i % 5 == 0) "buzz"
  else if (i % 15 == 0) "fizzBuzz"
  else i
  }

  (1 to 100).map(fizzBuzz _)

}
}
