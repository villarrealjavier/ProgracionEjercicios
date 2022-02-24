print("Hola introduzca los siguientes datos")
minimo=int(input("Intrduzca el minimo: "))
maximo=int(input("Introduzca el maximo: "))
contador=0
suma=0
limite=0

while minimo>maximo:
    print("Error introduce de nuevo los datos")
    minimo=int(input("Introduce el minimo: "))
    
numero=int(input("Introduce un numero"))    
while numero!=0:
    if numero>minimo and numero<maximo:
        suma=numero+suma
    elif numero<minimo or numero>maximo:
        contador=contador+1
    else:
        limite=limite+1
    numero=int(input("Introduce un numero"))
    
print("La suma de los numeros es ", (suma) )
print ("Los numeros que estan fuera son: ", (contador) )
print ("Los numeros iguales son:", (limite) )
    
    