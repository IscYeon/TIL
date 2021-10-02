# 리스트 내 중복값 제거 두가지 방법
# for, if 사용하여 리스트 내 중복 값 제거. 순서가 유지된다
# set() 사용하여 리스트 내 중복 값 제거. 순서가 유지되지 않음

numList = list()
numList.append(int(input())%42)
numList.append(int(input())%42)
numList.append(int(input())%42)
numList.append(int(input())%42)
numList.append(int(input())%42)
numList.append(int(input())%42)
numList.append(int(input())%42)
numList.append(int(input())%42)
numList.append(int(input())%42)
numList.append(int(input())%42)

newList = []

for i in numList:
    if i not in newList:
        newList.append(i)

print(len(newList))

'''
numListSet = set(numList)
numList = list(numListSet)
print(len(numList))
'''
