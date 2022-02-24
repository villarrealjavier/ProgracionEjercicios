print("Hola ")
numeroAlum=int(input("Introduce el numero de alumno"))
if numeroAlum>=100:
    print("El precio a total es " + str(numeroAlum*65) + (" Cada alumno debera pagar 65 euros."))
elif numeroAlum>=50:
    print("El precio a total es " + str(numeroAlum*70) + (" Cada alumno debera pagar 70 euros."))
elif numeroAlum>=30:
    print("El precio a total es " + str(numeroAlum*95) + (" Cada alumno debera pagar 95 euros."))
else:
    print("El precio a total es " + (" 4000 euros") + (" Cada alumno debera pagar " + str(round(4000/numeroAlum)) + (" euros")))