package Factory

import java.lang.Exception
import java.lang.NullPointerException

class VichleFactory {
    companion object{
        fun CreatVichle(vichleType: VichleType):Vichle?{
            val vichle = when(vichleType){
                VichleType.Car -> Car()
                VichleType.Boat->Boat()
                else -> null
            }
            return vichle
        }
    }
}