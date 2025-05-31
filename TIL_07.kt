// 제네릭
// 타입을 신경쓸 필요가 없어 좋음
fun main() {
//     val box1 = Box1(10)
//     println(box1.value)
    
//     val box2 = Box2("숫자 10")
//     println(box2.value)
    
//     val box1_1 = Box1("10".toInt())
//     println(box1_1.value)
    
//     val box3 = Box3(10)
//     println(box3.value)
    
//     val box4 = Box3("문자열 10")
//     println(box4.value)
    
    testFun1("abc")
    testFun2("aaaaa")
    testFun2(123)
    testFun2("aaaaa123123123")
    testFun2(123333333333)
    
}

fun <T> testFun2(a : T) {
    println(a)
}

fun testFun1(a : String) {
    println(a)
}

fun <A> testFun3(a : A) {
    println(a)
}

class Box1(test : Int) {
	var value = test
}

class Box2(test : String) {
    var value = test
}

class Box3<T>(test : T) {
    var value = test
}