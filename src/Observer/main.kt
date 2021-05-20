package Observer

fun main(){
        val firstCar = Hundai()
        val secondCar= Mazda()
        val masrRoad= MasrRoad("masr/alex path")
    masrRoad.registerObserver(firstCar)
    masrRoad.registerObserver(secondCar)
    masrRoad.updatePath()
    masrRoad.path = "fayoum path"
    masrRoad.updatePath()
    masrRoad.removeObserver(secondCar)
    masrRoad.updatePath()
}