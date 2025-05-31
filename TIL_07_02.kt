// object -> 싱글톤패턴 -> 디자인패턴 중 하나인데
// 디자인패턴 -> 코드를 어떻게 짜는게 더 좋고, 어떤 방식으로 구성해야 유지보수가 쉬운가
// 객체를 한개만 생성하도록 한다 / 전역으로 사용 가능


fun main() {
//     val test1 = TestClass()
//     val test2 = TestClass()
    
//     test1.count = 10
    
//     println(test1.count)
//     println(test2.count)
    
//     val test3 = TestObject
//     val test4 = TestObject
    
//     test3.count = 88
    
//     println(test3.count)
//     println(test4.count)
    
    var test5 = TestObjectClass()
    var test6 = TestObjectClass()
    
    test5.plusBtn()
    println(TestObjectClass.number)
    test5.plusBtn()
    println(TestObjectClass.number)
    test6.minusBtb()
    println(TestObjectClass.number)
    
    
}

class TestObjectClass {
    
    companion object {
        var number = 0
    }
    
    fun plusBtn() {
        number++
    }
    
    fun minusBtb() {
        number--
    }
}

object TestObject{
    
//     init {
//         println("testObject")
//     }
    
    var count = 0
}

class TestClass {
    
//     init {
//         println("testClass")
//     }
    
    var count = 0
}