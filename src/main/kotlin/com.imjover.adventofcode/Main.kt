import com.imjover.adventofcode.Day2

fun main(args: Array<String>) {
    println("This is Kotlin's Advent of Code 2021")
    print("Please choose the activity day: ")
    val day = readln().toInt()

    when (day) {
        1 -> {
            println("The total count of larger items divisible by 1: ${Day1.solve1()}")
            println("The total count of larger items divisible by 3: ${Day1.solve2()}")
        }
        2 -> {
            val position = Day2.solve()
            println("The new position is: horizontal = ${position.first}, depth = ${position.second}")
            val position2 = Day2.solve2()
            println("The new position is: horizontal = ${position2.horizontalPosition}, " +
                    "depth = ${position2.depth}, " +
                    "aim = ${position2.aim}")
        }
        else -> throw RuntimeException("Invalid day")
    }
}