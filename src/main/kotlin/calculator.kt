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

    var divide = num1 * num2
    return divide
}

fun main(args: Array<String>) {
    val result = divide()
    println("Result of the division: $result")
    val mul = multiply()
    println("Result of the division: $mul")
}
