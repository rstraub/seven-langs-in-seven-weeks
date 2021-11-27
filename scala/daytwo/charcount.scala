def totalSize(words: List[String]) = words.foldLeft(0)((size, word) => size + word.length)

val words = List("Joe", "Jane", "Django")
println(s"Total size: ${totalSize(words)}")
