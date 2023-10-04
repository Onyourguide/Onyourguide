def counttime():
    result = int(input())

    day = result // 86400
    hour = result % 86400 // 3600
    minute = result % 86400 % 3600 // 60
    second = result % 86400 % 3600 % 60 

    if result < 864000000 :
        print("%.4d" %day,":",hour,":", minute,":",second )
    else :
        print("ERR_:__:__:__")

counttime()

# ขั้น : ยังไง