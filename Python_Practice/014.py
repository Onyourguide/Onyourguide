"""Source code ' s docstring"""
def functionName ():
    """FunctionName's docstring"""

point=float(input())
    #กำหนดตัวแปรเป็น float (ทศนิยม)

if  0 <= point <= 60  :
    print("fail")
elif point > 60 :
    print("pass")
else :
    print("error")
    # ถ้าคะแนน 0-60 ไม่ผ่าน คะแนน 61-100 ผ่าน นอกจากนั้น error
    
functionName()