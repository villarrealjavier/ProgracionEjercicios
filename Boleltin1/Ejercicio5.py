print ("Hola rellene el siguiente cuestionario")
numero1=int(input("Introduce el numero 1: "))
numero2=int(input("Introduce el numero 2: "))
valorA=0
if numero1 > numero2:
    valorA=numero1-numero2
else:
    valorA=numero2-numero1
print ("La distancia entre ellos es de " + str(valorA) + " numeros.")
