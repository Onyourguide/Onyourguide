#นับเวลา

def counttime():
    result = int(input())

    day = result // 86400
    hour = result % 86400 // 3600
    minute = result % 86400 % 3600 // 60
    second = result % 86400 % 3600 % 60 

    print(day , "วัน" , hour , "ชั่วโมง" , minute , "นาที" , second , "วินาที")

counttime()

# def counttime():
#     sec = int(input())

#     second = sec % 60
#     minute = sec//60
#     hour = minute//60
#     day = hour//24

#     print(day , "วัน" , hour% 24 , "ชั่วโมง" , minute% 60 , "นาที" , second , "วินาที")

# counttime()