def mostrarPares():
    lista=[]
    listapares=[]
    
    numero=int(input("Introduce un numero (Negativo si quieres terminar): "))
    while numero>=0:
        lista.append(numero)
        numero=int(input("Introduce un numero (Negativo si quieres terminar): "))
    if numero<0:
        print("Se acabo el programa")
    for i in range (len(lista)):
        if lista[i]%2==0:
            listapares.append(lista[i])

    return listapares

print (mostrarPares())


    
    

        
    