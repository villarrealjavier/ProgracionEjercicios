'''Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los
lados de un triángulo. El programa debe determinar que tipo de triangulo es, teniendo en
cuenta los siguiente:
◦ Si se cumple Pitágoras entonces es triángulo rectángulo
◦ Si sólo dos lados del triángulo son iguales entonces es isósceles.
◦ Si los 3 lados son iguales entonces es equilátero.
◦ Si no se cumple ninguna de las condiciones anteriores, es escaleno.'''
print ("Hola rellene el siguiente cuestionario")
entradaA=int(input("Introduce el lado 1"))
entradaB=int(input("Introduce el lado 2"))
entradaC=int(input("Introduce el lado 3"))
if (entradaA**2+entradaB**2== entradaC**2) or (entradaB**2+entradaC**2==entradaA**2) or (entradaA**2+entradaC**2==entradaB**2):
    print ("el triangulo es rectangulo")

if entradaA==entradaB and entradaA==entradaC:
    print ("Tu triangulo es equilatero")

elif entradaA==entradaB or entradaA==entradaC or entradaB==entradaC:
    print ("El triangulo es isosceles")

else:
    print("El triangulo es escaleno")