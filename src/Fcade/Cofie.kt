package Fcade

data class Cofe constructor(val esspresso: Esspresso? =null , val suger: Suger? =null ,val  water: Water
            ,val beans: Beans){
    fun makeCofe(){
        println("your cofe is ready")
    }
    constructor(water: Water , beans: Beans):this(null,null,water,beans)
    constructor(suger: Suger?,water: Water , beans: Beans):this(null,suger,water,beans)
}