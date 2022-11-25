fun main(args: Array<String>) {
    var input = readLine()!!.trim().toInt()
   println(input)
    var number = input.toDouble().times(7)
    println(number)

    var output = readLine() // read string with null
    println(output)
    var number1 = output?.toDouble()?.times(7)
    println(number1?.toString())

    // Elvis Operator -> It is used instead of returning null
    var catName: String?= null
    println(catName) // You will get null
    println(catName?:"This cat has no name")//?: elvis Operator -> will print the message instead of null
    catName = "Fofo"
    println(catName) // The name of cat is Fofo now ->It is assingned

    // read an array of string
    val a = readLine()!!.trimEnd().split(" ").map{ it }.toTypedArray()//Read a sentence and trim it with delimiter of white space
    //then map it to array of the same type
    a.forEach {
        println(it)
    }
}