#โปรแกรมคำนวณ BMI = weight/(high**high)
weight=int(input("น้ำหนัก kg "))
high=int(input("ส่วนสูง cm "))

high=high/100 #cm--->m
bmi = weight/(high**high)

print("BMI ของคุณ =", bmi )
