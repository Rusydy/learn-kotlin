/*
Create a method that accepts a list and an item, and returns true if the item belongs to the list, otherwise false.
*/

fun main() {
  val arr = intArrayOf(1, 2, 3, 4, 5)
  val item = 3
  println(include(arr, item)) // Output: true

  val itemNotInArray = 6
  println(include(arr, itemNotInArray)) // Output: false
}

fun include(arr: IntArray, item: Int): Boolean {
  return arr.contains(item)
}
