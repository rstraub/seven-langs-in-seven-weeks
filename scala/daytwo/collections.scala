import scala.collection.mutable

// Lists
val aList = List(1, 2, 3)
println(aList(1))

// Sets
val animals = Set("dog", "cat")
println(animals)


val otherAnimals = Set("dog", "bird", "fish")
val allAnimals = animals ++ otherAnimals

println(allAnimals)
println(animals intersect otherAnimals)

// Equality
println(Set(1, 2, 3) == Set(3, 2, 1))
println(List(1, 2, 3) == List(3, 2, 1))

// Maps
val ordinals = Map(0 -> "zero", 1 -> "one", 2 -> "two")
println(ordinals(2))

val map = new mutable.HashMap[Int, String]()
map += 4 -> "four"
map += 8 -> "eight"
println(map)
