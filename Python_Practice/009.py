inputa = float(input())
inputb = float(input())
inputc = float(input())
inputd = float(input())

def functionf(x):
    return 2*x

def functiong(x):
    return(3*x**4)-(x**3)+(2*x**2)+10

def functionh(x,y,z):
    return(z+x)**2-(x*y)+(y**2)

def functioni(a,b,c,d):
    return((a**2)+(b**2)-(c**2))/((d**2)-(2*a*d)+(2*a))

print(functionf(functionf(inputa)))
print(functiong(functionf(inputa - inputb)))
print(functionh(functionf(inputa + inputb),(functionf(inputa + inputc)),functiong(functionf(inputd**2))))
print(functioni(functionh(functionf(inputa + inputd),(functionf(inputa - inputc)),(functiong(functionf(inputd**2)))),(functiong(functionf(inputa-inputb))),(functionf(functionf(functionf(functionf(functionf(inputc)))))),inputd**8))