def Grade3():
    subject = int(input())
    result = 0
    for _ in range(subject):
        data = float(input())
        if 100 >= data >= 95:
             data = 4
        elif 95 >= data >= 90:
             data = 3.5
        elif 90 >= data >= 85: 
             data = 3
        elif 85 >= data >= 80: 
             data = 2.5
        elif 80 >= data >= 75:
             data = 2
        elif 75 >= data >= 70: 
             data = 1.5
        elif 70 >= data >= 65: 
             data = 1
        elif 65 >= data >= 60: 
             data = 0.5
        elif 60 >= data >= 0:
             data = 0
        result += data
    print(result/subject)
Grade3()

# def functionName ():
#     """FunctionName's docstring"""

# a = int(input("Enter your score = "))
# if 100 >= a >= 96:
#  print("A")
# elif 95 >= a >= 89: 
#  print("B+")
# elif 90 >= a >= 86: 
#  print("B")
# elif 85 >= a >= 79: 
#  print("C+") 
# elif 80 >= a >= 76: 
#  print("C")
# elif 75 >= a >= 69: 
#  print("D+") 
# elif 70 >= a >= 64: 
#  print("D") 
# elif 65 >= a >= 61: 
#  print("D") 
# elif 60 >= a >= 0:
#  print("F") 
# else :
#  print("ERROR")

# functionName()