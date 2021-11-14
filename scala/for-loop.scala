def forLoop {
    println("loop, for style")
    for(i <- 0 until args.length) {
        println(args(i))
    }
}

forLoop

def forEach {
    println ("loop, foreach style")
    args.foreach { arg =>
        println(arg)
    }
}
forEach