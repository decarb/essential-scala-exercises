import section4.{End, Pair, Rectangle, Square}

// Section 4 - Traits
// Testing Shape
val rec = Rectangle(1, 2)
rec.area
rec.perimeter
val squ = Square(2)
squ.area
squ.perimeter

// Testing StringList
val sl = Pair("hello", Pair("moto", End))
sl.concatenate