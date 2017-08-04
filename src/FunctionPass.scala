class FunctionPass {
  val isEven = (i: Int) => i % 2 == 0
  val sum = (a: Int, b: Int) => a + b
  val double = (i: Int) => i * 2
  val triple = (i: Int) => i * 3
  val strlen = (s: String) => s.length
  val concat = (a: String, b: String) => a + b

  case class Person(firstname: String, lastname: String)
  val fullName = (p: Person) => s"${p.firstname} ${p.lastname}"

}
