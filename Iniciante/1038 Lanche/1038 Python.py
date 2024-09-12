c,q = list(map(int,input().split()))

if c==1: 
    print ("Total: R$ %.2f" %(q*4))
elif c == 2:
    print ("Total: R$ %.2f" %(q*4.50))
elif c == 3:
    print ("Total: R$ %.2f" %(q*5))
elif c == 4:
    print ("Total: R$ %.2f" %(q*2))
else: 
    print ("Total: R$ %.2f" %(q*1.50))
