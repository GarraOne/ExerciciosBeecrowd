a, b, c = map(float, input().split())

D = ((b**2)-4*a*c)

if( (D < 0) or a == 0):
	print( "Impossivel calcular")
	
elif ( D == 0 ):
	r1 = (-b + D **(1/2))/(2*a)
	r2 = r1
	print("R1 = %.5f" %(r1))
	print("R2 = %.5f" %(r2))

else:
	r1 = (-b + D **(1/2))/(2*a)
	r2 = (-b - D **(1/2))/(2*a)
	print("R1 = %.5f" %(r1))
	print("R2 = %.5f" %(r2))
