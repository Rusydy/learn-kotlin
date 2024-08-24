fun main() {
  // Lambda functions for temperature conversions.
  val celsiusToFahrenheit: (Double) -> Double = { c -> (c * 9 / 5) + 32 }
  val kelvinToCelsius: (Double) -> Double = { k -> k - 273.15 }
  val fahrenheitToKelvin: (Double) -> Double = { f -> (f - 32) * 5 / 9 + 273.15 }
  
  // Print the converted temperatures.
  printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToFahrenheit)
  printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius)
  printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKelvin)
}

fun printFinalTemperature(
  initialMeasurement: Double, 
  initialUnit: String, 
  finalUnit: String, 
  conversionFormula: (Double) -> Double
) {
  val finalMeasurement = conversionFormula(initialMeasurement)
  val formattedFinalMeasurement = String.format("%.2f", finalMeasurement) // two decimal places
  println("$initialMeasurement degrees $initialUnit is $formattedFinalMeasurement degrees $finalUnit.")
}
