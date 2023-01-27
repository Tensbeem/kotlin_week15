
fun main() {
    var base = Child()
    base.displayName()

    println("Animal Make noise and goto Sleep")
    var animal = Animal()
    animal.makeNoise()
    animal.gotoSleep()

    println("Cat Make noise and goto Sleep")
    animal = Cat()
    animal.makeNoise()
    animal.gotoSleep()

    println("Dog Make noise and goto Sleep")
    animal = Dog()
    animal.makeNoise()
    animal.gotoSleep()

}