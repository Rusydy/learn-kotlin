fun main() {    
  val amanda = Person("Amanda", 33, "play tennis", null)
  val atiqah = Person("Atiqah", 28, "climb", amanda)
  
  amanda.showProfile()
  atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
  fun showProfile() {
      val referrerInfo = if (referrer != null) {
          "Has a referrer named ${referrer.name}, who likes to ${referrer.hobby ?: "do something unspecified"}."
      } else {
          "Doesn't have a referrer."
      }

      val hobbyInfo = hobby?.let { "Likes to $it." } ?: "Doesn't have a hobby."
      
      println("Name: $name\nAge: $age\n$hobbyInfo $referrerInfo\n")
  }
}
