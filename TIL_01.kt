fun main() {

// 오늘 공부 한줄요약 : 알던 내용이라 쉬웠다. 파이썬이 아닌 코틀린이었을 뿐. 자바 문법이랑 비슷한거 같다. 재밌었당

    var test3 : String = "c"
    var test4 : String? = "d"

    test3 = test4!!
    println(test3)

// 데이터 형식 처리에 대한 부분. 명확하게 해두지 않으면 나중에 코드가 작동하지 않는다.
// 추측 : () {} 이런 괄호가 상위객체or미리 짜여진 특정 기능을 소환하는 라이브러리리(이런표현이 맞나모르겠네) 같은데 나중에 더 알아보자

    val testList1 = listOf("a", "b", "c")
    println(testList1)
    println(testList1[0])


    val testList2 = mutableListOf("a","b","c")
    println(testList2)
    testList2.add("d")
    println(testList2)
    testList2.remove("a")
    println(testList2)


    val mutableList1 = mutableListOf<Int>()
    mutableList1.add(5)
    mutableList1.add(10)
    mutableList1.add(15)
    mutableList1.add(22)

    val mutableList2 = mutableListOf<String>()
    mutableList2.add("유리")
    mutableList2.add("철수")
    mutableList2.add("짱구")
    mutableList2.add("훈이")

    val findIndex = mutableList1.indexOf(10)
    println(findIndex)
    println(mutableList2[findIndex])


    val testMap1 = mutableMapOf<Int, String>()
    testMap1.put(2, "유리")
    testMap1.put(10, "철수")
    testMap1.put(15, "짱구")
    testMap1.put(22, "훈이")

    println(testMap1[10])

    val testSet1 = mutableSetOf("a","b","c")
    println(testSet1)

    testSet1.add("d")
    testSet1.add("e")

    println(testSet1)

    testSet1.add("e")
    testSet1.add("e")
    testSet1.add("e")

    println(testSet1)

    testSet1.remove("e")
    println(testSet1)

// set은 중복 불가 파이썬에서 튜플에 해당
// map 은 파이썬에서 딕셔너리에 해당하는것 같음

    val student = mutableMapOf<Int, String>()
    student[99] = "민지"
    student[20] = "철수"
    student[35] = "민수"
    student[48] = "가영"
    student[100] = "하영"
    student[22] = "수진"
    student[45] = "수달"
    student[88] = "캥거루"
    student[91] = "코알라"
    student[87] = "악어"
    student[54] = "코끼리"
    student[42] = "하마"

    //println(student)

    val testList = ArrayList<String>()

    for (i in student) {
    if(i.key >= 50){
        println(i.value)
        testList.add(i.value)
    }
    }
    println(testList)

// key값, value값 접근


}

