fun divide(): Double {
    print("Enter the first number: ")
    var num1: Double = readLine()!!.toDouble()

    print("Enter the second number: ")
    var num2: Double = readLine()!!.toDouble()

    var divide = num1 / num2
    return divide
}
fun multiply(): Double {
    print("Enter the first number: ")
    var num1: Double = readLine()!!.toDouble()

    print("Enter the second number: ")
    var num2: Double = readLine()!!.toDouble()

    var multipli = num1 * num2
    return multipli
}
fun subtract(): Double {
    print("Enter Num1: ")
    var numa: Double = readLine()!!.toDouble()

    print("Enter Num2: ")
    var numb: Double = readLine()!!.toDouble()

    var sub = numa - numb
    return sub
}

fun main(args: Array<String>) {
    val result = divide()
    println("Result of the division: $result")
    val mul = multiply()
    println("Result of the division: $mul")
    val sub = subtract()
    println("Result of the division: $sub")
}
