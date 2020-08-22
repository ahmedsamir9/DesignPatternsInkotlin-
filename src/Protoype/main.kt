package Protoype

fun main(){
    val firstSuit = FirstSuit()
    firstSuit.name = "LL1"
    val firstSuitClone = firstSuit.clone()
    println(firstSuitClone.name)
    val secondSuit = SecondSuit()
    val secondSuitCloneable = secondSuit.clone()
    secondSuitCloneable.properties()

}