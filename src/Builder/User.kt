package Builder

data class User (val name  : String? ,val age :Int? , val address:String?,val phone :String?) {}
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

