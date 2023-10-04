AorD = str(input())
data1 = float(input())
data2 = float(input())
data3 = float(input())
datalist = [data1 , data2 , data3]

def PlanA_Z(x):
    if x == "Ascend":
        datalist.sort()
    elif x == "Descend":
        datalist.sort()
        datalist.reverse()
    print("%.2f" % datalist[0] + ", " + "%.2f" % datalist[1] + ", " + "%.2f" % datalist[2])

PlanA_Z(AorD)

# #ถ้าไม่ใช้ list 

# def PlanA_Z():
#     how = str(input())
#     data1 = float(input())
#     data2 = float(input())
#     data3 = float(input())
#     ans1 = 0
#     ans2 = 0
#     ans3 = 0
#     if how == "Ascend":
#         if(data1 < data2 and data1 < data3):
#             ans1 = data1
#             if(data2 < data3):
#                 ans2 = data2
#                 ans3 = data3
#             elif(data3 < data2):
#                 ans2 = data3
#                 ans3 = data2
#         if(data2 < data1 and data2 < data3):
#             ans1 = data2
#             if(data1 < data3):
#                 ans2 = data1
#                 ans3 = data3
#             elif(data3 < data1):
#                 ans2 = data3
#                 ans3 = data1
#         if(data3 < data1 and data3 < data2):
#             ans1 = data3
#             if(data1 < data2):
#                 ans2 = data1
#                 ans3 = data2
#             elif(data2 < data1):
#                 ans2 = data2
#                 ans3 = data1
#     elif how == "Descend":
#         if(data1 > data2 and data1 > data3):
#             ans1 = data1
#             if(data2 > data3):
#                 ans2 = data2
#                 ans3 = data3
#             elif(data3 > data2):
#                 ans2 = data3
#                 ans3 = data2
#         if(data2 > data1 and data2 > data3):
#             ans1 = data2
#             if(data1 > data3):
#                 ans2 = data1
#                 ans3 = data3
#             elif(data3 > data1):
#                 ans2 = data3
#                 ans3 = data1
#         if(data3 > data1 and data3 > data2):
#             ans1 = data3
#             if(data1 > data2):
#                 ans2 = data1
#                 ans3 = data2
#             elif(data2 > data1):
#                 ans2 = data2
#                 ans3 = data1
#     print("%.2f" % ans1 + ", " + "%.2f" % ans2 + ", " + "%.2f" % ans3)
# PlanA_Z()