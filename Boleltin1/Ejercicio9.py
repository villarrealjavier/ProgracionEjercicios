print ("Hola introduce los siguientes datos")
base=int(input("Introduce la base: "))
exponente=int(input("Introduce la exponente: "))
resultado=1
for i in range (abs(exponente)):
    resultado=base*resultado
        
if exponente < 0:
    resultado=1/(resultado)

print(resultado)
