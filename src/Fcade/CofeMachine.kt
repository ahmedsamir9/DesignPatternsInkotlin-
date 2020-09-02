package Fcade

class CofeMachine {
    fun makeCofee(){
        val beans =Beans()
        val water = Water()
        val suger =Suger()
        val cofe =Cofe(suger,water,beans)
        cofe.makeCofe()
    }
    fun makeEspressoCofe(){
        val beans =Beans()
        val water = Water()
        val suger =Suger()
        val esspresso =Esspresso()
        val cofe =Cofe(esspresso,suger,water,beans)
        cofe.makeCofe()
    }
}