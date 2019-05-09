package section4

trait Shape {
  def area: Double
  def perimeter : Double
}

trait Rectangular extends Shape {
  val width: Double
  val length: Double

  override def area: Double = width * length
  override def perimeter: Double = 2 * (width + length)
}

