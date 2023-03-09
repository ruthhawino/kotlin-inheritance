import kotlin.time.Duration.Companion.hours

fun main(){

    var myCar =Car("Nissan","Sedans",5,"Brilliant Silver Metallic")
     println(myCar.people)
    println(myCar.carry(11))
    println(myCar.identity())

}

open class Car(val make:String,val  model:String,val people:Int,val color:String){
    fun carry(people:Int) {
        if (people == 5) {
            println("carry $people passengers")
        }
        else if(people==11){
            println("Over capacity by six people")
        }
    }
    fun identity(){
        println("I am $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        val  calc= hours * 20
        return calc

    }
}
class Bus( make:String,  model:String, people: Int, color:String):Car(make,model,people,color) {
    fun maxTripFare(fare: Double): Double {
        var calculate = people * fare
        return calculate

    }
    override fun calculateParkingFees(hours: Int): Int {
        var fees = hours * people
        return fees
    }
}
