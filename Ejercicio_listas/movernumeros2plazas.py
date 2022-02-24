lista = []

for i in range (10):
    numero=int(input("Introduce un numero"))
    lista.append(numero)
print (lista)
def posicionnumeros(lista):
    lista2=[]
    for i in range (len(lista)):
        lista2.append(lista[i-2])
    return lista2
print (posicionnumeros(lista))