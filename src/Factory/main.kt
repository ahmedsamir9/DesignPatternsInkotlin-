package Factory

fun main (){
    var vichle = VichleFactory.CreatVichle(VichleType.Car)
    vichle!!.drive()
    vichle = VichleFactory.CreatVichle(VichleType.Boat)
    vichle!!.drive()

}