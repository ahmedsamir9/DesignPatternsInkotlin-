package Builder

interface UserBuilder {
    fun setName(_name:String):UserBuilder
    fun setAddress (_Address:String):UserBuilder
    fun setAge (_age:Int):UserBuilder
    fun setPhone (_phone:String):UserBuilder
    fun build():User
}