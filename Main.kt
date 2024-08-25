// sum of input digit
// eg. 476 -> 17

fun main() {
  val input = 476 
  
  // Convert each character to its numeric value and sum them
  val result = input.toString().map { it.toString().toInt() }.sum()
  
  println(result)
}
