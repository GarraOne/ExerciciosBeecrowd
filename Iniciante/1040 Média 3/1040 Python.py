n1,n2,n3,n4 = list(map(float,input().split()))

n1 *= 2
n2 *= 3
n3 *= 4

o = (n1 + n2 + n3 + n4)/10

print ("Media: %.1f" %o)

if o > 7 or o == 7:
    print("Aluno aprovado.")
elif o < 5:  
    print("Aluno reprovado.")
else:
    print("Aluno em exame.")
    n5 = float(input())

    print("Nota do exame: %.1f" %n5)
    m2 = (o + n5)/2;
    if m2 <5:
        print("Aluno reprovado.")
    else:
        print("Aluno aprovado.")
    print("Media final: %.1f" %m2) 
