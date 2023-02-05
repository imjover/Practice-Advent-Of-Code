fun main(args: Array<String>) {
    println("This is Kotlin's Advent of Code 2021")
    print("Please choose the activity day: ")
    val day = readln().toInt()

    when (day) {
        1 -> {
            println(Day1.solve())
        }
        else -> throw RuntimeException("Invalid day")
    }
}