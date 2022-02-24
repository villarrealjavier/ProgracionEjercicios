from random import randint

lista = []
numeropeque=99999
numeromax=0
resultado=0
contador=0
media=0

for i in range (10):
    lista.append(randint(0, 100))

    numerointr=int(input("Introduce el numero que quieras sustituir: "))
    numerosustituto=int(input("Introduce el numero que quieras insertar"))
    for j in range (len(lista)):
        if lista[j]<numeropeque:
            numeropeque=lista[j]
        if lista[j]>numeromax:
            numeromax=lista[j]
        if lista[j]>=0:
            resultado+=lista[j]
            contador=+1
        if lista[j]==numerointr:
            lista[j]=numerosustituto
    

        
print(resultado/contador)
print(numeropeque)
print(numeromax)
print (lista)

    

