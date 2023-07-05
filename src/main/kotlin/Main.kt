fun main() {
    var banker=Banker("Ann",21 ,)
    banker.introduction()
    banker.eat()
    banker.sleep()
    banker.talk("my name is Agirl ")
       println(banker.countMoney(arrayOf(1000,500,200,100)))
    val doctor=Doctor("Nicholas",21)
    doctor.introduction()
    doctor.eat()
    doctor.sleep()
    doctor.talk("Hello,patient")
    doctor.treatPatient("Nicholas","Malaria")
    val farmer=Farmer("Steve",26)
    farmer.introduction()
    farmer.eat()
    farmer.sleep()
    farmer.talk("The farm has the best soil")
    farmer.cultivateLand()






}
 open class Person(var name:String,var age:Int ){
    fun talk(words:String){
        println(words)
    }
    open fun eat (){
        println("yum")

    }
    fun sleep(){
        println("zzzzz")
    }
   override fun introduction(){
         println("Hi, my name is Dr.$name")

     }
}
class Banker( name:String,age:Int):Person(name,age){
    fun countMoney(note:Array<Int>):Int{
        return note.sum()

    }
}
 open  class Doctor( name:String, age:Int):Person(name,age){
    fun treatPatient(patientName:String,disease:String){
        println("treating$patientName for $disease")
    }
}
 open class Farmer( name:String,age: Int ):Person(name,age,){
    fun cultivateLand(){
        println("dig dig dig")
    }

     override fun eat() {
      super.eat()
         println("I am eating cassava from my farm")
     }
}
