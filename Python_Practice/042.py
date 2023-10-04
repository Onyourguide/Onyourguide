# def Sequence():
#     data = int(input())
#     count = 0
#     for count in range(data):
#         print(count)
# Sequence()

def Sequence():
    data = int(input())
    count = 0
    for _ in range(data):
        for count in range(1, data+1):
            print(count, end=" ")
        print()
Sequence()

# def Sequence():
#     data = int(input())
#     count = 0
#     for i in range(data):
#         for j in range(1, data+1):
#             print("i = " + str(i) + ", j =" + str(j-1), end=" | ")
#         print()
# Sequence()