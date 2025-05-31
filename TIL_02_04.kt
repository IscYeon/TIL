// 인터페이스(interface)
// 설명 참 어렵게 하는데 걍 나중에 괄호놀이임 그 연관성만 잘 알면 됨 () {} 어떻게 서로 타고 들어가서 소환하고 어디서 잘못되서 에러 뱉는지 체크 잘 하면 됨.

fun main(){
	BMW().autoParking()
}

interface CarAutoDriving{
    fun autoDriving()
}

interface CarAutoParking{
    fun autoParking()
}


abstract class Car {
    abstract fun wheel()
    
    abstract fun engine()
}


class BMW() : Car(), CarAutoDriving, CarAutoParking {
    
    override fun wheel(){
        println("BMW 굴러감")
    }
    override fun engine(){
    	println("BMW 엔진시동")
    }
 	override fun autoDriving() {
        println("BMW 자율 주행")
    }
    override fun autoParking(){
    	println("BMW 자동 주차")
    }
    
}

class Benz() : Car(), CarAutoParking {
    
    override fun wheel(){
        println("Benz 굴러감")
    }
    override fun engine(){
    	println("Benz 엔진시동")
    }
        
    override fun autoParking(){
        println("Benz 자동 주차")
    }
}
