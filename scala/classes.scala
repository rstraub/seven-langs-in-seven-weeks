class Person(firstName: String, lastname: String)

val gump = new Person("Elvis", "Presley")

println(gump)

class Compass {
    val directions = List("north", "east", "south", "west")
    var bearing = 0
    print("Initial bearing: ")
    println(direction)

    def direction() = directions(bearing)

    def inform(turnDirection: String) {
        println("Turning " + turnDirection + ". Now bearing: " + direction)
    }

    def turnRight() {
        bearing = (bearing + 1) % directions.size
        inform("right")
    }

    def turnLeft() {
        bearing = (bearing + (directions.size - 1)) % directions.size
        inform("left")
    }
}

val compass = new Compass
compass.turnRight
compass.turnLeft
compass.turnLeft
compass.turnLeft