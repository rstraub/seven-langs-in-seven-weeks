println("Lists")
val aList = List(1, 2, 3)
println(aList(1))

println("Sets")
val animals = Set("dog", "cat")
println(animals)

println("Join & Intersect")

val otherAnimals = Set("dog", "bird", "fish")
val allAnimals = animals ++ otherAnimals

println(allAnimals)
println(animals intersect otherAnimals)

println("Equality")
println(Set(1, 2, 3) == Set(3, 2, 1))
println(List(1, 2, 3) == List(3, 2, 1))
