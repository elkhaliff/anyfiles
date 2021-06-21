
If you're having trouble with connecting to your IDE (imcompatible), 
try doing this(It seems to be working for me at least)! 
File > Settings > Build, Execution, Deployment > Gradle.  
Set "Build and run using:" AND "Run tests using:"  to Gradle(Default)

---------------------------------------------------------------------------------------------------------

fun main(){
    val (var1, op, var2) = readLine()!!.split(" ")

    val a = var1.toInt()
    val b = var2.toInt()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }
}

---------------------------------------------------------------------------------------------------------

val scan = java.util.Scanner(System.`in`)
val (a, b, c) = Array(3) { scan.nextInt() }

---------------------------------------------------------------------------------------------------------

import kotlin.math.pow
fun main() = readLine()!!.toDouble().let { it.pow(3) + it.pow(2) + it + 1 }.let(::println)

---------------------------------------------------------------------------------------------------------

import java.util.Locale
fun main() {
    val x = readLine()!!.format(Locale.US).toDouble()
    val z = x * x
    println(z * x + z + x + 1)
    println(x * (x * (x + 1) + 1) + 1) // Это круче :)	
}

---------------------------------------------------------------------------------------------------------

import java.util.Calendar

class Calendar(var day: String, var month: String, var year: String) {

    fun selectCurrentDay() {
        val clnd = Calendar.getInstance()

        year = clnd.get(Calendar.YEAR).toString()
        month = (clnd.get(Calendar.MONTH)+1).toString()
        day = clnd.get(Calendar.DAY_OF_MONTH).toString()
    }
}
fun createCalendar() =
    Calendar("-", "-", "-")
fun main() {
val calendar = createCalendar()
// write your code here
    calendar.selectCurrentDay()
    println("${calendar.day} ${calendar.month} ${calendar.year} ")
}

---------------------------------------------------------------------------------------------------------

fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    // Do not touch lines above
    // Write only exchange actions here.
    val last = numbers.last()
    numbers[numbers.size - 1] = numbers.first()
    numbers[0] = last

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}

---------------------------------------------------------------------------------------------------------

fun main() {
    val cube: Array<Array<Array<Int>>> = Array(3, { Array(3, { Array(3, {0})})})

    val n = 2
    for (i in 0 until n) {
        for (k in 0 until n) {
            for (m in 0 until n) {
                cube[i][k][m] = k
            }
        }
    }
    println(cube.contentDeepToString())
}

---------------------------------------------------------------------------------------------------------

fun main() {
    //Do not touch code below
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    // write your code here
    val inputArray2: Array<Array<String>> = arrayOf(inputArray[n-1], inputArray[0])

    println(inputArray2.contentDeepToString())
}

---------------------------------------------------------------------------------------------------------

    val fieldMap: Array<Array<String>> = Array(rows, { Array(cols, {"_"}) })

---------------------------------------------------------------------------------------------------------

fun main() = readLine()!!.let { println(it.last() + it.substring(1, it.lastIndex) + it.first()) }

---------------------------------------------------------------------------------------------------------

fun solution(products: List<String>, product: String) {
    products.forEachIndexed { index, s ->
        if (product == s) {
            print("$index ")
        }
    }
}

---------------------------------------------------------------------------------------------------------

fun solution(products: List<String>, product: String) = print(products.indices
                                                        .filter { products[it] == product }
                                                        .joinToString(" "))

---------------------------------------------------------------------------------------------------------

fun solution(strings: List<String>, str: String): Int = strings.count { it == str }

---------------------------------------------------------------------------------------------------------

import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val list = mutableListOf<Int>()

    while (scanner.hasNextInt()) {
        val next = scanner.nextInt()
        list.add(next)
    }
    val max = list.maxOrNull()
    val index = list.indexOf(max) + 1

    println("$max $index")
    
}

---------------------------------------------------------------------------------------------------------

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var nums = emptyArray<Int>()
    while (scanner.hasNextInt()) {
        val x = scanner.nextInt()
        nums += x
    }
    println("${nums.maxOrNull()} ${nums.indexOf(nums.maxOrNull()) + 1}")
}

---------------------------------------------------------------------------------------------------------

fun main() {
    val str = readLine()!!
    (if (str == str.reversed()) "yes" else "no").let(::println)
}

---------------------------------------------------------------------------------------------------------

fun main() = print(readLine()!!.let { if (it.reversed() == it) "yes" else "no" })

---------------------------------------------------------------------------------------------------------

fun main() {
    // write your code here
    val (yyyy, mm, dd) = readLine()!!.split("-")
    println("$mm/$dd/$yyyy")
}

---------------------------------------------------------------------------------------------------------

fun main() = readLine()!!.split("-").toList().let { print(it[1] + '/' + it[2] + '/' + it[0]) }
// or
fun main() = readLine()!!.split('-').let { print("${it[1]}/${it[2]}/${it[0]}") }

---------------------------------------------------------------------------------------------------------

fun main() {
    // write your code here
    val arrStr = readLine()!!.split(' ')
    var l = 0
    var max = ""
    arrStr.forEach {
        if (it.length > l) {
            l = it.length
            max = it
        }
    }
    println(max)
}
// or
fun main() {
    val a = readLine()!!.split(" ")
    println(a.maxByOrNull { it.length })
}
// or
fun main() = print(readLine()!!.split(" ").maxBy { it.length })
// or

---------------------------------------------------------------------------------------------------------

fun main() {
    val input = readLine()!!
    // write code here
    println(
        when {
            input.isEmpty() -> ""
            input.first() == 'i' -> input.drop(1).toInt() + 1
            input.first() == 's' -> input.drop(1).reversed()
            else -> input
        }
    )
}

---------------------------------------------------------------------------------------------------------

fun main() {
    val f: List<Int> = listOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val t: List<Int> = listOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val p: List<Int> = listOf(1, 10, 100, 1_000, 10_000, 100_000)
    
    val number = readLine()!!.toInt()
    when (number) {
        in f -> println("F")
        in t -> println("T")
        in p -> println("P")
        else -> println("N")
    }
}

---------------------------------------------------------------------------------------------------------

fun main() = readLine()!!
    .groupBy { it }
    .filterValues { it.size == 1 }
    .count()
    .let(::println)

---------------------------------------------------------------------------------------------------------

fun main() = readLine()!!.let { for (c in 'a'..'z') if (!it.contains(c)) print(c) else break }

---------------------------------------------------------------------------------------------------------

fun isVowel(char: Char) = char in "aAeEiIoOuU"

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

---------------------------------------------------------------------------------------------------------

fun isVowel(char: Char): Boolean {
    val vowel = arrayListOf('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U')
    return char in vowel
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

---------------------------------------------------------------------------------------------------------

fun main() {
    val (a, b, c) = Array(3) { readLine()!!.toInt() }
    println(a <= b && a >= c || a >= b && a <= c)
}
// or
fun main() = IntArray(3) { readLine()!!.toInt() }.let { numbers ->
                    val secondAndThird = numbers.slice(1..2).sorted()
                    numbers.first() in secondAndThird[0]..secondAndThird[1]
        }.let(::println)

---------------------------------------------------------------------------------------------------------

data class OperatingSystem(var name: String = "OperatingSystem")

data class DualBoot(var primaryOs: OperatingSystem = OperatingSystem("MacOS"),
               var secondaryOs: OperatingSystem = OperatingSystem("Ubuntu"))

---------------------------------------------------------------------------------------------------------

fun main() {
    val firstNum = readLine()!!.toInt()
    val secondNum = readLine()!!.toInt()
    val thirdNum = readLine()!!.toInt()

    val myNum = listOf(firstNum, secondNum, thirdNum)
    val positiveNum = myNum.filter { it > 0 }

    println(positiveNum.count() == 1)
}

---------------------------------------------------------------------------------------------------------

    val arr = Array(3) { readLine()!!.toInt() }
    println(arr.filter { it > 0 }.count() == 1)

---------------------------------------------------------------------------------------------------------

import java.util.Collections

fun main() {
        List(readLine()!!.toInt()) { readLine()!!.toInt() }.let {
        Collections.rotate(it, readLine()!!.toInt())
        print(it.joinToString(" "))
    }
}

---------------------------------------------------------------------------------------------------------

fun main() = print(MutableList(readLine()!!.toInt()) { readLine() }
    .also { list -> repeat(readLine()!!.toInt() % list.size) { list.add(0, list.removeLast()) } }
    .joinToString(" "))

---------------------------------------------------------------------------------------------------------

fun main() {
    Array(readLine()!!.toInt()) { readLine()!!.toInt() }
    .run {
        val rot = readLine()!!.toInt() % size
        (takeLast(rot) + dropLast(rot)).joinToString(" ")
    }.let(::println) 
}

---------------------------------------------------------------------------------------------------------

fun main() {
    val n = readLine()!!.toInt()
    val a = n in -14..12 || n in 13..16 || n >= 19
    println(if (a) "True" else "False")
}

---------------------------------------------------------------------------------------------------------

fun main() {
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)

    println(Int.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Float.MAX_VALUE)
    println(Double.MAX_VALUE)
}

---------------------------------------------------------------------------------------------------------

fun getSec(arr: IntArray) = arr[0] * 60 * 60 + arr[1] * 60 + arr[2]

fun main() {
    val beginTime = IntArray(3) { readLine()!!.toInt() }
    val endTime = IntArray(3) { readLine()!!.toInt() }
    println(getSec(endTime) - getSec(beginTime))
}

---------------------------------------------------------------------------------------------------------
