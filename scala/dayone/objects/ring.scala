

class TrueRing(private val owner: String) {
  def wearer = println(owner + " has the one ring")
}

object TrueRing {
  def rule = println("One ring to rule them all")
}

TrueRing.rule
new TrueRing("Bilbo Baggins").wearer
