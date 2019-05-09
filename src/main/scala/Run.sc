import section2.NumberStuff._
import section2.StringStuff._
import section3.{Cop, Person, Rectangle}
import section3.Rectangle.square

// Section 2 - Expressions
// Testing NumberStuff object
square(2)
increment(1)
divideBy(3, 3)
divideBy(3, 0)

// Testing StringStuff object
isLong("hello")
isLong("THIS IS A LONG STRING")
isFirstCap("no")
isFirstCap("Yes")

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