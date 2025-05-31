// 오버로딩 : 같은 이름 메서드가 여러개지만 그 각각이 파라미터가 다 달름

fun main() {
	val c = Calculator()
//     c.sumNumberTwo(1,2)
//     c.sumNumberThree(1,2,3)
    c.sumNumber(1,2)
    c.sumNumber(1,2,3)
    c.sumNumber("나는", "행복")
}

class Calculator(){
    fun sumNumberTwo(a : Int, b : Int){
        println(a+b)
    }
    
    fun sumNumberThree(a : Int, b : Int, c : Int){
        println(a+b+c)
    }
    
    fun sumNumber(a: Int, b : Int){
        println(a+b)
    }
    
    fun sumNumber(a: Int, b : Int, c : Int){
        println(a+b+c)
    }
    
    fun sumNumber(a : String, b : String) {
        println(a+b)
    }
}