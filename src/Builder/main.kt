package Builder

fun main(){
    val user =UserBuilderImpl().setName("ahmed")
            .setAge(15).build()
        print(user.toString())
}