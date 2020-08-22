package Protoype

 class FirstSuit :Cloneable {
    var name = "XR8"
    fun properties(){
        println("flying")
    }

     public override fun clone(): FirstSuit {
         return super.clone()as FirstSuit
     }
 }