input1 = float(input())
input2 = float(input())
input3 = float(input())

def function1(x):
    print(x + 1)

def function2(y):
    print((7*y**3)+(2*y**2)-(31*y)+1)

def function3(z):
    print(-z)

def function4(x,y):
    print((x + y)*(x - y))

def function5(x,y,z):
    print((y-((y**2)-4*x*z)**0.5)/(2*x))

function1(input1)
function2(input2)
function3(input3)
function4(input1,input2)
function5(input1,input2,input3)