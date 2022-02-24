print ("Hola")
from math import sqrt #Importando la raiz cuadrada
cateto_1= int(input("Introduce el cateto 1: "))
cateto_2= int(input("Introduce el cateto 2: "))
resultado=0
resultado=sqrt(cateto_1**2+cateto_2**2)
print ("La hipotenusa vale " + str(round(resultado,2)))
