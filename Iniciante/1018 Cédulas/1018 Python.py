X = int(input())
A1 =(X//100)
A2 =((X - A1*100)//50)
A3 =((X -(A1*100+A2*50) )//20)
A4 =((X -(A1*100+A2*50+A3*20) )//10)
A5 =((X -(A1*100+A2*50+A3*20+A4*10) )//5)
A6 =((X -(A1*100+A2*50+A3*20+A4*10+A5*5) )//2)
A7 =(X -(A1*100+A2*50+A3*20+A4*10+A5*5+A6*2) )
print(X);
print(A1 , "nota(s) de R$ 100,00" )
print(A2 , "nota(s) de R$ 50,00" )
print(A3 , "nota(s) de R$ 20,00" )
print(A4 , "nota(s) de R$ 10,00" )
print(A5 , "nota(s) de R$ 5,00" )
print(A6 , "nota(s) de R$ 2,00" )
print(A7 , "nota(s) de R$ 1,00" )
