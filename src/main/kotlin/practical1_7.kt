fun factByGenReq(num : Int) : Int{
    return if(num == 1){
        num
    } else{
        num*factByGenReq(num-1)
    }
}

tailrec fun factByTailReq(num : Int, temp : Int = 1) : Int{
    return if(num == 1){
        temp
    } else{
        factByTailReq(num-1, temp*num)
    }
}

fun main(){
    print("Enter Number: ")
    var num : Int = readLine()!!.toInt()
    println("Factorial of $num = " + factByGenReq(num))
    println("By TailReq keyword, Factorial of $num = " + factByTailReq(num))
}