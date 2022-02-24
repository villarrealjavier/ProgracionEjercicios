print("Hola rellene los siguientes datos: ")
cantidad=int(input("Introduzca la cantidad deseada: "))
tipo=int(input("Introduce una opcion \n 1. Cambio de euros a dolares\n 2. Cambio de dolares a euros\n 3. Cambio de euros a libras\n 4. Cambio de libras a euros\n 5.Cambio de libras a dolares\n 6.Cambio de dolares a libras\n 7. Salir"))
resultado=0
if tipo==7:
    print("El programa se acabo")

if tipo==1:
    resultado=cantidad*1.15
    print("El cambio son ",resultado," dolares")
elif tipo==2:
    resultado=cantidad*0.87
    print("El cambio son ", resultado, "euros")
elif tipo==3:
    resultado=cantidad*0.85
    print("El cambio son ",resultado," libras")
elif tipo==4:
    resultado=cantidad*1.17
    print("El cambio son ",resultado," euros")
elif tipo==5:
    resultado=cantidad*1.34
    print("El cambio son ",resultado," dolares")
elif tipo==6:
    resultado=cantidad*0.75
    print("El cambio son ",resultado," libras")
if tipo<1 and tipo>7:
    print("Error")

