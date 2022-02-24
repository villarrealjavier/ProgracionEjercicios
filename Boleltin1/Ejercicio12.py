print ("Hola rellene el siguiente cuestionario")
iniciouva=int(input("Introduce el precio inicial de uva que desea "))
kilouva=int(input("Introduce el kilo de uvaa que desea "))
tipo= str(input("Indica si el tipo: (A o B) "))
claseuva= str(input("Indica el tamaño: (1 o 2) "))
resultado=0
if tipo=="A" and claseuva=="1":
    resultado= (iniciouva*0.20)
    print("El precio total es de " + str(resultado+iniciouva) + (" euros. La ganancia es de ") + str(resultado))
elif tipo=="A" and claseuva=="2":
    resultado= (iniciouva*0.30)
    print("El precio total es de " + str(resultado+iniciouva) + (" euros. La ganancia es de ") + str(resultado))
elif tipo=="B" and claseuva=="1":
    resultado= (iniciouva*0.30)
    print("El precio total es de " + str(iniciouva-resultado) + (" euros. La ganancia es de ") + str(resultado))
elif tipo=="B" and claseuva=="2":
    resultado= (iniciouva*0.50)
    print("El precio total es de " + str(iniciouva-resultado) + (" euros. La ganancia es de ") + str(resultado))
else:
    print ("Error") 

    
