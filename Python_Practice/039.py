def table():
    number = int(input())
    count = 0
    for _ in range(number):
        if count <= number :
            count += 1
        print("15 x " , count , " = " , 15 * count)
table()