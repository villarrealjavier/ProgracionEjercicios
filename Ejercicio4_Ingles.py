print("Hola rellene el siguiente cuestionario")
numero=int(input("Introduce un numero mayor que 0: "))
resultado=0
acumulador=0
while numero<0:
    print("El numero no es correcto, intentalo de nuevo: ")
    numero=int(input("Introduce un numero mayor que 0: "))
for i in range (1, numero +1):
    acumulador = acumulador+i
print("La suma de los numeros es" , acumulador)