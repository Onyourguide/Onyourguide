def Sequence3():

    data = int(input())
    for i in range (data):
        count = i 
        for j in range(data):
            metrix = j+2+count
            print(metrix , end=" ")
        print()

Sequence3()