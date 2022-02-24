'''Diseñar un programa que pida dos números, la base y la potencia, y muestre el resultado de
elevar la base a la potencia sin usar el operador de potencia, es decir, sólo con
multiplicaciones. Hay que tener en cuenta que la potencia puede ser negativa.'''
print("Hola rellene el siguiente cuestionario: ")
base=int(input("Introduce la base: "))
potencia=int(input("Introduce el potencia: "))
resultado=1
for i in range (abs(potencia)) :
    resultado=base*resultado
if potencia<0:
    resultado=1/resultado
print(resultado)
    
    