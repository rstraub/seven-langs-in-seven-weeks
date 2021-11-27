trait Censor {
  private val alternatives = Map(
    "Darn" -> "Pucky",
    "Shoot" -> "Beans"
  )
  def censor(text: String): String = alternatives.foldLeft(text)((censored, curse) => censored.replaceAll(curse._1, curse._2))
}

object BigBrother extends Censor

println(BigBrother.censor("God Darn, Shoot yourself!"))
