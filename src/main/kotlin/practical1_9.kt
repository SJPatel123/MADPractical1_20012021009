fun main(){
    var arr : Array<Int> = Array(5){i:Int->i}
    for(i in 0 until arr.size){
        print("a[$i]=")
        arr[i] = readLine()!!.toInt()
    }
    var max : Int = arr[0]
    for(i in 0 until arr.size){
        if(arr[i]>max){
            max = arr[i]
        }
    }
    println("Largest element = $max")
}