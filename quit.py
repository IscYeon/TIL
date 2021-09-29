num_qty = int(input())
if num_qty <= 0 or num_qty > 1000000:
    quit()

num_list = list(input().split())
for i in num_list:
    if int(i) < -1000000 or int(i) > 1000000:
        quit()

max = -1000000
min = 1000000

if num_qty == len(num_list):
    for i in num_list:
        if int(i) > max:
            max = int(i)
        if int(i) < min:
            min = int(i)
    print(min, max)

# quit() 를 이용해서 실행중인 프로그램을 종료 시킬수 있다.
