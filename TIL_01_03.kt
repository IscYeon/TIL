// null 처리 관련

fun main() {
    
    //     var testStr1 : String = ""
    //     println(testStr1)
        
    //     var testStr2 = null
    //     println(testStr2)
        
    //     var testStr3 : String = "abcd"
        
    //     var testStr4 : String? = null
        
        println(findStringLength4(null))
        
    }
    
    // fun findStringLength1(str : String) : Int {
        
    //     return str.length
    // }
    
    // fun findStringLength2(str : String?) : Int? {
        
    //     return str?.length
    // }
    
    // fun findStringLength3(str : String?) : Int {
    //     var resultCount = 0
    //     if(str != null) {
    //         resultCount = str.length
    //     }
        
    //     return resultCount
    // }
    
    
    fun findStringLength4(str : String?) : Int {
        return str?.length ?: 0 // 원래 Int가 리턴값이어야 하지만 만약 리턴값 null 이면 에러 뱉지말고 0 뱉어라
    }
    
    

    
    
    
    
    
    