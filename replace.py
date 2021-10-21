# string.replace() 메서드를 사용하여 Python의 문자열에서 특정 문자 제거 가능

string = input()
string = string.replace('c=', 'a')
string = string.replace('c-', 'a')
string = string.replace('dz=', 'a')
string = string.replace('d-', 'a')
string = string.replace('lj', 'a')
string = string.replace('nj', 'a')
string = string.replace('s=', 'a')
string = string.replace('z=', 'a')

print(len(string))
