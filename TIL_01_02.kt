fun main() {
    //     val sumValue = sum(20,40)
    //     println(sumValue)
        bobMaking(25)
    }
    
    fun bobMaking(time : Int){
        println("$time 분 후에 밥이 완료됩니다.")
    }
    
    fun sum(num1:Int, num2:Int) : Int{
        // println(num1+num2)
        val result = num1 + num2
        return result
    }
    
    fun abc2(){
        val a = 20
        val b = 40
        val c = a + b
        println(c)
    }
    
    fun abc(){	
        val a = 10
        val b = 20
        val c = a+b
        println(c)
    }
    
    fun testFun(){  
        println("a")
        println("b")
        println("c")
        println("d") 
    }

// 함수 뒤에있어도 main에서 실행되는건 컴파일러, 인터프리터 차이인듯 나중에알아보자