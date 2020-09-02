package Adapter

fun main () {
    var drink : Drink = Cofee()
    drink.makeDrink()
    drink = DrinkAdapter(Tea())
    drink.makeDrink()
}