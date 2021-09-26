
import sys

input = sys.stdin.readline()
input = int(input)

for i in range(input):
    a, b = map(int,sys.stdin.readline().split())
    print(a + b)

# Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 .rstrip()을 추가로 해 주는 것이 좋다.

#sys.stdin.readline()은 우리의 입력과 함께 \n까지 받아들입니다. ( 뉴라인,엔터 ), 그렇기 때문에 숫자는 괜찮습니다. (ex) int()를 통해 온전한 숫자만 얻을 수 있음 ) 하지만 문자열의 경우엔 포함되어버리므로 문제가 된다. 따라서, 오른쪽의 \n을 없애주는 rstrip() 메소드가 필요한 것입니다! ( 양쪽은 strip() )

'''
import sys
str = sys.stdin.readline().rstrip()

if str  == "apple":                    # str은 apple이므로, if문을 통과합니다
    print("apple is right")
'''
