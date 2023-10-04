def Gift3():
    count = int(input())
    max_weight = float(input())
    ans = -99999
    for _ in range(1, count):
        weight = float(input())
        if weight > max_weight:
            ans = max_weight
            max_weight = weight
        elif weight > ans:
             ans = weight
    print(ans)
Gift3()
