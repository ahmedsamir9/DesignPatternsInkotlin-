package Observer

class MasrRoad (var path:String):Subject {
        val cars = mutableListOf<Observerr>()
    override fun registerObserver(car: Observerr) {
      cars.add(car)
    }

    override fun removeObserver(car:Observerr) {
        cars.remove(car)
    }

    override fun notifyObservers() {
      cars.forEach{ car ->
        car.update(path)
      }
    }
    fun updatePath(){
        notifyObservers()
    }
}