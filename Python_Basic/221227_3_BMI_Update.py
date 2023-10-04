#โปรแกรมคำนวณ BMI = weight/(high**high)
weight=int(input("your weight kg "))
high=int(input("your high cm "))

high = high/100 #cm--->m
bmi = weight/(high**high)
print("your BMI =", bmi )

# < 18.5 / underweigh , thin
# 18.5 - 22.9 / normal , healthy
# 23 - 24.9 / buxom
# 25 - 29.9 / fat
# > 30 / very fat

if  0 <= bmi <= 18.5  :
    print("underweigh")
elif 18.5 <= bmi <= 22.9 :
    print("normal")
elif 23 <= bmi <= 24.9 :
    print("buxom")
elif 25 <= bmi <= 29.0 :
    print("fat")
elif bmi > 30 :
    print("very fat")
else :
    print("error")