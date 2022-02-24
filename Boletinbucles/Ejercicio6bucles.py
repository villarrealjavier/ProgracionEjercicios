print("Hola")
ladoa=int(input("Introduce el lado a: "))
while ladoa<=0:
     ladoa=int(input("Error.Introduce el lado a: "))
ladob=int(input("Introduce el lado b: "))
while ladob<=0:
     ladob=int(input("Error.Introduce el lado b: "))
ladoc=int(input("Introduce el lado c: "))
while ladoc<=0:
     ladoc=int(input("Error.Introduce el lado c: "))
if (ladoa+ladob)>ladoc and (ladoa+ladoc)>ladob and (ladob+ladoc)>ladoa:
    print("Es un triangulo")
else:
    print("No es un triangulo")