package section3

case class Person(name: String, surname: String, drunk: Boolean)

object Cop {
  def inspect(p: Person) = p match {
    case Person(name, surname, true) => s"$name $surname, you are drunk! Come with me!"
    case Person(_, _, false)         => "Move along."
  }
}
