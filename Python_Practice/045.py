def Sequence4():

    data = int(input())
    for i in range (data):
        count = i*data
        for j in range(data):
            metrix = j+1+count
            print(metrix , end=" ")
        print()

Sequence4()