print ("Hola rellene el siguiente cuestionario")
from math import sqrt
x1=int(input("Introduce el x1: "))
x2=int(input("Introduce el x2: "))
y1=int(input("Introduce el y1: "))
y2=int(input("Introduce el y2: "))
resultado= sqrt ((x2-x1)**2+(y2-y1)**2)
print ("La distancia entre los dos puntos es de " + str(round(resultado, 2)))