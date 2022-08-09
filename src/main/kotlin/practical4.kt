fun main(){
    print("Enter Number: ")
    var num : Int = readLine()!!.toInt()
    println(if(num % 2 == 1){
        ("$num is odd")
    }
    else{
        ("$num is even")
    })
}