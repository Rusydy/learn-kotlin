/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

Patrick Feeney => P.F
*/

fun main() {
  println("Test 1 passed: ${abbrevName("Sam Harris") == "S.H"}")
  println("Test 2 passed: ${abbrevName("Patrick Feeney") == "P.F"}")
}

fun abbrevName(name: String): String {
   return name.split(" ")
              .map { it[0].uppercase() }
              .joinToString(".")
}
