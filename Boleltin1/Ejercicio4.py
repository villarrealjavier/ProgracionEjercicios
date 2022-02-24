print ("Hola rellene el siguiente cuestionario")
Precio_producto=float(input("Introduce el valor del producto: "))
Descuento= (15*Precio_producto)/100
Precio_final= (Precio_producto-Descuento)
print ("Finalmente debera pagar: " + str(Precio_final) + " euros.")