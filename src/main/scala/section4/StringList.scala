package section4

trait StringList {
  def concatenate: String = this match {
    case Pair(head, tail) => head + tail.concatenate
    case End              => ""
  }
}
case class Pair(head: String, tail: StringList) extends StringList
case object End extends StringList
