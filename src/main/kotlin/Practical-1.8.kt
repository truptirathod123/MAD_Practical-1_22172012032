fun main()
{
    println("Array-1 -> using arrayof() method")
    val a1 = arrayOf(26,85,96,16,43)
    println(a1.contentToString())
    println("Array-2 -> using Array<>()")
    val a2 = Array(5){0}
    println(a2.contentToString())
    println("Array-3 -> by using Array<>() and lamda function")
    val a3 = Array(7){i->i}
    println(a3.contentToString())
    println("Array-4 -> by using IntArray()")
    val a4 = IntArray(5)
    println(a4.joinToString(", "))
    println("2-D Array -> by using arrayof() and intArrayof()")
    val a6 = arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7))
    println(a6.contentToString())
    print("Enter number of Elements :")
    val size: Int = readLine()!!.toInt()
    val user= IntArray(size) {0}
    for(i in 0 until size) {
        print("Enter the Element : ")
        user[i] = readLine()!!.toInt()
    }
    println("Entered Array = ")
    println(user.contentToString())
    println("======================with In- BuiltFunction======================")
    println("Array Sorted by in-built Function = ")
    user.sort()
    println(user.contentToString())
    val a7 = intArrayOf(45,96,689,593,-45,-76,-453,-56)
    println("======================with In-Built Function======================")
    println("Array Sorted by in-built Function = ")
    println(user.contentToString())
    var temp:Int
    for (i in a7.indices)
    {
        for (j in a7.indices)
        {
            if (a7[j] > a7[i])
            {
                temp= a7[j]
                a7[j] = a7[i]
                a7[i] = temp
            }
        }
    }
    println("Array Sorted without in-built fuction = ")
    println(user.contentToString())
}
