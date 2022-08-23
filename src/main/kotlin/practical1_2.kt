fun main(){
    var iVal1 : Int = 25
    var dblVal1 : Double = iVal1.toDouble()
    println("Integer Value: $iVal1")
    println("Double Value (From Integer): $dblVal1")

    var strVal1 : String = "25"
    var iVal2 : Int = strVal1.toInt()
    println("String Value: $strVal1")
    println("Integer Value (From String): $iVal2")

    var strVal2 : String = "12.15"
    var dblVal2 : Double = strVal2.toDouble()
    println("String Value: $strVal2")
    println("Double Value (From String): $dblVal2")
}