package section3

// This is a neat way of removing the redundant constructor/field assignment.
class Rectangle(val width: Double, val length: Double) {
  def area = width * length
}

object Rectangle {
  def apply(width: Double, length: Double) = new Rectangle(width, length)
  def square(side: Double) = Rectangle(side, side)
}
