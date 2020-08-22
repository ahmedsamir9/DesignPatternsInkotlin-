package Protoype

class SecondSuit:Cloneable {

    fun properties(){
        print("can dive")
    }

    public override fun clone(): SecondSuit {
        return super.clone() as SecondSuit
    }
}