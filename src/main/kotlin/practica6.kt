fun arithmaticOprs(vararg numbers : Int) : Int{
    print("Enter operator: ")
    var op : String? = readLine()
    when(op){
        "+"->{
            var add : Int = 0
            for (i : Int in numbers){
                add += i
            }
            return add
        }
//        "-"->{
//            for (i : Int in numbers){
//                var sub : Int = numbers[i]
//                sub =  sub - numbers[i+1]
//            }
//            return sub
//        }
        "*"->{
            var mult : Int = 1
            for (i : Int in numbers){
                mult += i
            }
            return mult
        }
        "/"->{
            var div : Int = numbers[0]
            for (i : Int in numbers){
                div /= i
            }
            return div
        }
    }
    return 0
}
fun main(){
    var num1 : Int = 111
    var num2 : Int = 2222
    var num3 : Int = -222
    println("Addition of $num1, $num2, $num3 is " + arithmaticOprs(num1,num2,num3))
//    println("Subtraction of $num1, $num2, $num3 is " + arithmaticOprs(num1,num2,num3))
    println("Multiplication of $num1, $num2, $num3 is " + arithmaticOprs(num1,num2,num3))
//    println("Division of $num1, $num2, $num3 is " + arithmaticOprs(num1,num2,num3))
}