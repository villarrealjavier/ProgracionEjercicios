print("Hola")
ano=int(input("Introduzca un año: "))
while ano<=0:
    ano=int(input("Error.Introduzca un año: "))
if ano%400==0:
    print("El año es bisiesto")
if ano%4==0 and ano%100!=0:
    print("El año es bisiesto")
else:
    print("El año no es bisiesto")