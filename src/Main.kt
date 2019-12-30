import java.util.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*

// Complete the saveThePrisoner function below.
fun saveThePrisoner(numberOfPrisoners: Int, numberOfSweets: Int, beginChairNumber: Int): Int {
    var candidate =  numberOfSweets % numberOfPrisoners + beginChairNumber -1
    return if (candidate in 1..numberOfPrisoners) candidate
    else abs(candidate - numberOfPrisoners)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nms = scan.nextLine().split(" ")

        val n = nms[0].trim().toInt()

        val m = nms[1].trim().toInt()

        val s = nms[2].trim().toInt()

        val result = saveThePrisoner(n, m, s)

        println(result)
    }
}
