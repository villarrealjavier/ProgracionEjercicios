'''. Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un
número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible
por 400.'''
print ("Hola rellene el siguiente cuestionario")
ano=int(input("Introduce el año: "))
if  ano %4==0 and ano %100!=0 :
    print ("Tu año es bisiesto")
elif ano %400==0:
    print ("Tu año es bisiesto")
else:
    print("Tu año no es bisiesto")

