package section2

object StringStuff {
  def isLong(s: String) = if (s.length > 7) true else false
  def isFirstCap(s: String) = if (s.charAt(0).isUpper) true else false
}
