fun main() {
    println(getString(listOf("Promise","Marie","Gerardine","Dina","Belyse","Divine","Ketty","Diana","John","Andrew","Jelly")))

    getPerson()
    var personHeight=averagetotal(listOf(1.90,1.68,1.73,1.53))
    println(personHeight.average)
    println(personHeight.total)



    getPeople()
    var  car= listOf(
        Car("RAE201F",400),
        Car("KDA904M",900)

    )
    println(car(listOf(400,900)))

}
fun getString(people:List<String>):List<String>{
    var a= mutableListOf<String>()
    for (person in people){
        if (people.indexOf(person)%2==0){
            a.add(person)
        }
    }
    return a
}
data class PeopleListAvarage(var average:Double,var total:Double)
fun averagetotal(hieght:List<Double>):PeopleListAvarage{
    var sum=hieght.sum()
    var average=hieght.average()
    var averagesum=PeopleListAvarage(average,sum)
    return averagesum
}





data class Person(var name:String, var age:Int,var hieght:Double,var weight:Double)
fun getPerson() {
    var person = listOf(
        Person("Funy", 20, 1.54, 50.3),
        Person("Mun", 19, 1.60, 50.1),
        Person("Jonh", 50, 1.78, 70.1)
    )
    var descendingPerson = person.sortedByDescending { person -> person.hieght }
    println(descendingPerson)
}

data class People(var name:String, var age:Int,var hieght:Double,var weight:Double)
fun getPeople() {
    var human = mutableListOf(
        People("Funy", 20, 1.54, 50.3),
        People("Mun", 19, 1.60, 50.1),
        People("Jonh", 50, 1.78, 70.1)
    )
    human.addAll(
        listOf(
            People("Jane", 19, 1.56, 40.3),
            People("Mary", 30, 1.76, 50.8)
        )
    )
    println(human)
}
data class Car(var registration:String,var mileage:Int)
fun car(mileage: List<Int>):Int{
    var mile=mileage.average().toInt()
    return mile
}
