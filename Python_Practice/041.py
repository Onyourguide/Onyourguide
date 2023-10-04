def BootSequence():
    data = int(input())
    count = 0
    for count in range(data-1):
        print(count + 1, end="_")
    print(data)
BootSequence()

#Output data-1 = 10_ แล้ว print data = 10