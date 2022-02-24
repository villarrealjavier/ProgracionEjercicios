print ("Hola rellene el siguiente cuestionario")
from math import sqrt
numero=float(input("Introduce un numero: "))
raiz_cuadrada=0
raiz_cubica=0
raiz_cubica= numero**(1/3)
raiz_cuadrada= sqrt(numero)
print ("La raiz cudrada es " + str(round(raiz_cuadrada,2)) + " y su raiz cubica es " + str(round(raiz_cubica,2)))