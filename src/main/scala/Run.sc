import section3.{Cop, Person, Rectangle}
import section3.Rectangle.square

// Section 3 - Classes
// Testing Rectangle
val rec = Rectangle(5, 6)
val sq = square(2)
rec.area
sq.area

// Testing Person
val dev = Person("Devin", "Joubert", true)
val joh = Person("Johann", "Venter", false)
Cop.inspect(dev)
Cop.inspect(joh)