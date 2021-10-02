array1 = [i for i in range(10)]
array2 = [i for i in range(20) if i % 2 == 1]
array3 = [i * i for i in range(1,10)]

print(array1)
print(array2)
print(array3)


# 리스트 컴프리헨션(2차원리스트 생성)

n = 4
m = 3
array = [[0] * m for _ in range(n)]
print(array)
