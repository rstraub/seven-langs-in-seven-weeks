val hobbits = List("Frodo", "Samwise", "Pippin")
hobbits.foreach(hobbit => println(hobbit))

val humans = Map(
  "Aragorn" -> "King",
  "Eomer" -> "Captain",
  "Gandalf" -> "Wizard"
)
humans.foreach(human => println(human))

val sauron = "Sauron" -> "Ruler"
println(sauron)

println(hobbits.isEmpty)
println(Nil.isEmpty)
println(hobbits.length)
println(hobbits.size)
println(hobbits.head)
println(hobbits.tail)
println(hobbits.last)
println(hobbits.init)

println(hobbits.reverse)
println(hobbits.drop(1))
println(hobbits.drop(2))

val characters = List("peg", "al", "bud", "kelly")
println(characters.count(char => char.length > 2))
println(characters.filter(char => char.length > 2))
println(characters.map(char => char.length))
println(characters.forall(char => char.size > 1))
println(characters.exists(char => char.length > 4))
println(characters.exists(char => char.length > 5))

val sizeSort = (s: String, t: String) => s.length < t.length
println(characters.sortWith(sizeSort))

val numbers = List(1, 2, 3)
println(numbers.foldLeft(0)((sum, i) => sum + i ))
