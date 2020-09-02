package Adapter

class DrinkAdapter( val tea :Tea) : Drink {
    override fun makeDrink(){
            tea.makeTea()
    }
}