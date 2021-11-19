val flanders = new Character("Ned")

trait Nice {
  def greet(): Unit = println("Howdily doodily.")
}

class Person(val name: String)

class Character(override val name: String) extends Person(name) with Nice

flanders.greet()
