X = int(input())
A = (X//3600 )
B = ((X - (A*3600))//60 )
C = (X -( A*3600 + B*60))
print('{}:{}:{}'.format(A, B, C))
