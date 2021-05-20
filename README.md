# Design Patterns In Kotlin
> Samples of design patterns in Kotlin.

> Defination : Gneral and reusable solution to common problems in software design (Not algorithm)
 
# Patterns :
## Creational : 
* ### Builder
* ### Prototype
## Creational:
> They are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation

* ### [Builder](https://github.com/ahmedsamir9/DesignPatternsInkotlin-/tree/master/src/Builder)
> Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

=> Uml : 

<img  src="/umls/builder.png">


1. builder interface 
```kotlin
interface UserBuilder {
    fun setName(_name:String):UserBuilder
    fun setAddress (_Address:String):UserBuilder
    fun setAge (_age:Int):UserBuilder
    fun setPhone (_phone:String):UserBuilder
    fun build():User
}
```
2. User Class 
``` kotlin
data class User (val name  : String? ,val age :Int? , val address:String?,val phone :String?) {}
```
3. User builder
```kotlin
 class UserBuilderImpl :UserBuilder {
    private var name  : String? =null
     private var age :Int? = null
     private  var address:String? = null
     private var phone :String? = null
        override fun setName(_name: String): UserBuilder {
            this.name =_name
            return this
        }

        override fun setAddress(_Address: String): UserBuilder {
            this.address =_Address
            return this
        }

        override fun setAge(_age: Int): UserBuilder {
            this.age =_age
            return this
        }

        override fun setPhone(_phone: String): UserBuilder {
            this.phone=_phone
            return this
        }

        override fun build(): User {
           return User(this.name, this.age, this.address, this.phone)
        }
    }
```
4. Using code in main 
```kotlin 
fun main(){
    val user =UserBuilderImpl().setName("ahmed")
            .setAge(15).build()
        print(user.toString())
}
```

