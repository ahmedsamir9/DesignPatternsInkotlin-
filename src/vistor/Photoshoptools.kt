package vistor

class Photoshoptools {
    private val excuters = ArrayList<Excuter>()
    fun addExcuter (excuter: Excuter){
        excuters.add(excuter)
    }
    fun invokeOperations(operation: Operation){
        excuters.forEach{
            if (it is Selection)
            it.execute(operation)
        }
    }
}