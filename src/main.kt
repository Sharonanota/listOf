fun main() {
name(listOf("Sharon","Anota","Lubembe","Siara","Matakwa","Musimbi","Jane","Aisha","Asha"))
var v =heightOfPeople(listOf(2, 3, 4, 5, 100))
    println(v)
    var q = Person("Siara", 34,6.0,65.0)
    var h = Person("Anota",45,2.0,54.0)
    var y = Person("Anota2",65,7.0,21.5)
    var list1= listOf(q,h,y)
    var ind = list1.sortedBy { person->person.age }
    println(ind)

    var t = Person("Lubembe",45,5.9,70.9)
    var b= Person("Matakwa",65,5.9,21.0)
    var list2= listOf(t,b)
    println(list1.plus (list2))

    var wargon = Cars("KDD2341",100)
    var Jeep = Cars("Kss768", 300)
    var Cars = listOf(wargon,Jeep)
    println(myCar(Cars))


}


fun name(names:List<String>):List<String>{
    names.forEachIndexed { index, s ->
       if(index%2==0){
           println(s)
       }
    }
    return names

}
fun heightOfPeople(numbs: List<Int>):String{
    var h = numbs.sum()
    var avr = numbs.average()
    var total= "$h, $avr"

    return total
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var name:String,var age:Int,var height:Double, var weight:Double)

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun add(nome:List<Any>):List<Any>{
    return listOf()
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list
data class Cars(var registration: String, var mileage:Int)
fun myCar(vehicles: List<Cars>):Int{
    var cas = 0
    vehicles.forEach{ cars -> cars.mileage
        cas+=cars.mileage

    }
    var avrg = cas/vehicles.count()
    return avrg
}