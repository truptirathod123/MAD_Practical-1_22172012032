fun main()
{
    var a = 65
    var b = 56
    var add = add(a,b)
    println("Addition of ${a} and ${b} is : "+add)

    var sub = sub(a,b)
    println("Substractiob of ${a} and ${b} is : "+sub)

    var mul = mul(a,b)
    println("Multiplicatin of ${a} and ${b} is : "+mul)

    var div = div(a,b)
    println("Division of ${a} and ${b} is : "+div)
}


fun add(a:Int,b:Int):Int
{
    return a + b
}

fun sub(a:Int,b:Int):Int
{
    return a - b
}
fun mul(a:Int,b:Int):Int
{
    return a * b
}
fun div(a:Int,b:Int):Int {
    return a / b
}
