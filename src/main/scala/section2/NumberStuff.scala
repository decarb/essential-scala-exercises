package section2

object NumberStuff {
  def square(x: Double) = x * x
  def increment(x: Double) = x + 1
  def divideBy(x: Double, y: Double) = if (y == 0) 0.0 else x / y
}
