from random import randint

lista = []
for i in range (10):
    lista.append(randint(1, 100))

print(lista)

def NumeroPeque (lista):
    numeropeque=9999999999
    for i in range (len(lista)):
        if lista[i]<numeropeque:
            numeropeque=lista[i]
    return numeropeque
print (NumeroPeque(lista))

def NumeroMayor (lista):
    numeromayor=0
    for i in range (len(lista)):
        if lista[i]>numeromayor:
            numeromayor=lista[i]
            
    return numeromayor
print (NumeroMayor(lista))

def Suma (lista):
    resultado=0
    for i in range (len(lista)):
        resultado+=lista[i]
    return resultado
print (Suma(lista))

def medianumeros(lista):
    media=0
    contador=0
    
    for i in range (len(lista)):
        contador+=1
    media=(Suma(lista))/contador
        
    return media

print (medianumeros(lista))

def sustituirnumero(lista):
    numeroigual=int(input("Introduce el numero que quieras cambiar (Numero incorrecto para dejarlo igual): "))
    numero_sustituido=int(input("Introduce el numero que quieras poner: "))
    for i in range (len(lista)):
        if numeroigual==lista[i]:
            lista[i]=numero_sustituido
        else:
            lista[i]=lista[i]
    return lista
print (sustituirnumero(lista))

def Mostrar(lista):
    for i in range (len(lista)):
        print(lista[i])
    
    return lista[i]
print(Mostrar(lista))
        
        
        
    

    

        




