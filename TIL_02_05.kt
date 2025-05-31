//데이터클래스
//서버에서 데이터 받아올때 주로 사용한다

fun main(){
    val justDog = JustDog("파트라슈", 21)
    println(justDog.name)
    println(justDog.age)
    println(justDog.toString())
    
    val dataDog = DataDog("파트라슈 친구", 15)
    println(dataDog.name)
    println(dataDog.age)
    println(dataDog.toString())
    
    val dataDog2 = dataDog.copy(name = "파트라슈 여자친구")
    println(dataDog2.toString())
}

class JustDog(var name : String, var age : Int)
data class DataDog(var name : String, var age : Int)