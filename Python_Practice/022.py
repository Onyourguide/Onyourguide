data1 = int(input())
data2 = int(input())
data3 = int(input())
data4 = int(input())
datalist = [data1 , data2 , data3 , data4]
dataresult = data1 + data2 + data3 + data4

def WeightStation():
    if dataresult > 15000:
        print("Overweight")
    elif (dataresult / 4) / 2 > data1:
        print("Unbalance")
    elif (dataresult / 4) / 2 > data2:
        print("Unbalance")
    elif (dataresult / 4) / 2 > data3:
        print("Unbalance")
    elif (dataresult / 4) / 2 > data4:
        print("Unbalance")
    else:
        dataoverweight = max(datalist)
        print("Pass" , "%.2f" % (dataoverweight)) 
WeightStation()