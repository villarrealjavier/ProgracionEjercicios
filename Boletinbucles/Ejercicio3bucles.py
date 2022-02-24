print("Hola rellene el siguiente cuestionario: ")
numero=int(input("Introduce un numero, (0 cuando quieras terminar): "))
resultado=0
contador=0
media=0
numero_minimo=numero
numero_maximo=numero
while numero>0:
    contador=contador+1
    resultado=resultado+numero
    if numero<numero_minimo:
        numero_minimo=numero
    if numero>numero_maximo:
        numero_maximo=numero
    numero=int(input("Introduce un numero, (0 cuando quieras terminar): "))
media=resultado/contador

    


print("La media es ", media, " y el numero menor introducido es ", numero_minimo, " y el numero mayor es ", numero_maximo)





    