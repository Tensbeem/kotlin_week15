open class Animal{
    open val count:Int = 0
    open fun gotoSleep(){
        println("Zzzzzz")
    }
    open fun makeNoise(){
        println("Wohhh")
    }
}

class Cat(override val count:Int = 100):Animal(){
//    override val count:Int = 100
    override fun makeNoise(){
        println("Moew!")
    }
}

class Dog:Animal(){
    override val  count:Int = 500
    override fun makeNoise() {
        println("Wooooof,$count")
    }
}
