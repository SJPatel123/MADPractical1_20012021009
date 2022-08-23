class Car(info:String,owner:String,miles:Int,ogPrice:Double,currentPrice:Double){
    lateinit var info : String
    lateinit var owner : String
    var miles:Int
    var ogPrice:Double
    var currentPrice:Double

    init{
        println("Object of class is created and Init is called")
        this.info = info
        this.owner = owner
        this.miles = miles
        this.ogPrice = ogPrice
        this.currentPrice = currentPrice
    }

    fun getCarInformation(): String{
        return info
    }

    fun getOriginalCarPrice(): Double{
        return ogPrice
    }

    fun getCurrentCarPrice(): Double{
        return currentPrice
    }

    fun displayCarInfo(){
        println("-----------")
        println("Car Information: ${getCarInformation()}")
        println("Car Owner: $owner")
        println("Miles Drive: $miles")
        println("Original Car Price: ${getOriginalCarPrice()}")
        println("Current Car Price: ${getCurrentCarPrice()}")
        println("-----------\n")
    }
}

fun main(){
    println("Create Car Class Object car1 in next line")
    val car1 = Car("BMW, 2018","Snej",110,100000.0,98950.0)
    car1.displayCarInfo()

    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW, 2019","Karan",20, 400000.0,399800.0)
    car2.displayCarInfo()

    println("\n********** ArrayList of Car **********")
    val carlist = ArrayList<Car>()
    carlist.add(Car("Toyota, 2017","KJS",100,1080000.0,1079000.0))
    carlist.add(Car("Maruti, 2020","NPP",200,4000000.0,3998000.0))
    carlist[0].displayCarInfo()
    carlist[1].displayCarInfo()
}