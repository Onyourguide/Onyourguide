# data1 = int(input())
# data2 = int(input())
# data3 = int(input())
# data4 = int(input())
# data5 = int(input())
# data6 = int(input())
# data7 = int(input())
# data8 = int(input())

# alldata = [data1 , data2 , data3 , data4  , data5  , data6  , data7  , data8]

# def datamax():
#     print(max(alldata))

# datamax()

#------- ไม่ใช้ max ยังไง -------------#

# def DataSpike():
#     maxValue = int(input())
#     otherValue = int(input())
#     if otherValue > maxValue:
#         maxValue = otherValue
#     otherValue = int(input())
#     if otherValue > maxValue:
#         maxValue = otherValue
#     otherValue = int(input())
#     if otherValue > maxValue:
#         maxValue = otherValue
#     otherValue = int(input())
#     if otherValue > maxValue:
#         maxValue = otherValue
#     otherValue = int(input())
#     if otherValue > maxValue:
#         maxValue = otherValue
#     otherValue = int(input())
#     if otherValue > maxValue:
#         maxValue = otherValue
#     otherValue = int(input())
#     if otherValue > maxValue:
#         maxValue = otherValue
#     print(maxValue)

# DataSpike()

# alldata = []
# for _ in range(8):
#     alldata.append(int(input()))
# print(alldata)

#------- ใช้ for _ in range(n input)  -------------#

def DataSpike():
    maxValue = int(input())

    for _ in range(7):
        otherValue = int(input())
        if otherValue > maxValue:
            maxValue = otherValue

    print(maxValue)

DataSpike()