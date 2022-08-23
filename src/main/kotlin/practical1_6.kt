fun arithmeticOprs(op : Char, vararg numbers : Int) : Int{
    when(op){
        '+'->{
            var add : Int = 0
            for (i : Int in numbers){
                add += i
            }
            return add
        }
        '-'->{
            var sub : Int = numbers[0]
            for(i : Int in 1 until numbers.size){
                sub -= numbers[i]
            }
            return sub
        }
        '*'->{
            var mult : Int = 1
            for (i : Int in numbers){
                mult *= i
            }
            return mult
        }
        '/'->{
            var div : Int = numbers[0]
            for (i : Int in 1 until numbers.size){
                div /= numbers[i]
            }
            return div
        }
        else->{
            return -1
        }
    }
    return 0
}

fun main(){
    var num1 : Int = 111
    var num2 : Int = 2222
    var num3 : Int = -222
    println("Addition of $num1, $num2, $num3 is  ${arithmeticOprs('+',num1,num2,num3)}")
    println("Subtraction of $num1, $num2, $num3 is ${arithmeticOprs('-',num1,num2,num3)}")
    println("Multiplication of $num1, $num2, $num3 is ${arithmeticOprs('*',num1,num2,num3)}")
    println("Division of $num1, $num2 is ${arithmeticOprs('/',num2,num1)}")
}