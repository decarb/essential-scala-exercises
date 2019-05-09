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

case class Square(side: Double) extends Rectangular {
  val width = side
  val length = side
}

case class Rectangle(width: Double, length: Double) extends Rectangular

