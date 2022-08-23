fun main(){
    println("Create Array-1 by using arrayOf() method:")
    var arr1 = arrayOf(1,2,3,4,5)
    println(arr1.joinToString(prefix = "[", postfix = "]"))

    println("Create Array-2 by using Array<>():")
    var arr2 : Array<Int> = arrayOf<Int>(0,0,0,0,0)
    println(arr2.contentDeepToString())

    println("Create Array-3 by using Array<>() and lambda function:")
    var arr3 : Array<Int> = Array(8){i:Int->i}
    println(arr3.joinToString(prefix = "[", postfix = "]"))

    println("Create Array-4 by using IntArray():")
    var arr4 = IntArray(5){0}
    println(arr4.joinToString())

    println("Create Array-5 by using intArrayOf():")
    var arr5 = intArrayOf(10,25,20,30,28,11)
    println(arr5.joinToString())

    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    var arr6 = arrayOf(intArrayOf(1,2), intArrayOf(3,4,3))
    println(arr6.contentDeepToString())

    var a : Array<Int> = Array(5){i:Int->i}
    println("Please enter Array Value:")
    for(i in 0 until a.size){
        print("a[$i]: ")
        a[i] = readLine()!!.toInt()
    }
    println("Entered Array:")
    println(a.contentDeepToString())

    println("*************With Built-in Function***************")
    println("After sorting by built-in function:")
    a.sort()
    println(a.contentDeepToString())
    println("\n*************Without Built-in Function***************")
    println("Before Sorting:")
    println(arr5.joinToString())
    println("After Sorting without built-in function:")
    for(i in 0 until arr5.size){
        for(j in i+1 until arr5.size){
            if(arr5[i]>arr5[j]){
                var temp : Int = arr5[i]
                arr5[i] = arr5[j]
                arr5[j] = temp
            }
        }
    }
    println(arr5.joinToString())
}