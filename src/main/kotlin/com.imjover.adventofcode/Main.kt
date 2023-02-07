fun main(args: Array<String>) {
    println("This is Kotlin's Advent of Code 2021")
    print("Please choose the activity day: ")
    val day = readln().toInt()

    when (day) {
        1 -> {
            println("The total count of larger items divisible by 1: ${Day1.solve1()}")
        }
        2 -> {
            println("The total count of larger items divisible by 3: ${Day1.solve2()}")
        }
        else -> throw RuntimeException("Invalid day")
    }
}