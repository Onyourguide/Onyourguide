integer_a = int(input())
float_b = float(input())
string_c = str(input())

def regulation():
    print("%30.d" % (integer_a))
    print("%030.d" % (integer_a))
    print("%2f" % (float_b))
    print("%1.12f" % (float_b))
    print("%40s" % (string_c))

regulation()