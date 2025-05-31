fun main() {
// 	println(Test2("abcd").b)
//     Test3().test3Fun()
    
//     val myinfo = MyInfo()
//     println(myinfo.getMyAge())
//     println(myinfo.getMyName())
//     println(myinfo.getMyLocation())
    
//     val dog = Dog("리트리버", 8)
//     println(dog.getMyDogInfo())
// 	initTest().testInitFun()
    InitialValue("개복치",30)
    InitialValue("개복치")
}

class InitialValue(name : String, age : Int = 20) {
    init {
        println(name)
        println(age)
    }
}

class initTest(){
    
    init {
        println("여기에서 뭔가 해주고싶음")
    }
    
    fun testInitFun(){
        println("testInitFun")
    }
    
}

class Dog(name : String, age : Int){
    
    val dogName = name
    val dogAge = age
    
    fun getMyDogInfo() : String {
        return "$dogName : $dogAge"
    }
}

class MyInfo(){
    
    fun getMyAge() : Int {
        return 20
    }
    
    fun getMyName() : String {
        return "MyNameisBokchi"
    }
    
    fun getMyLocation() : String {
        return "Seoul"
    }
    
}

class Test3(){
    
    fun test3Fun(){
        println("test3Fun 출력")
    }
    
}


class Test2(str : String) {
    val b = str
}

class Test{
    
    val a = "abc"
    
}

// 클래스 관련 내용