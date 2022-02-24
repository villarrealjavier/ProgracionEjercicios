def ContarPalabras (cadena):
    palabras=0
    for i in range (len(cadena)):
        if cadena[i]==" " and cadena[i+1]!=" ":
            palabras+=1
        if cadena[i]==".":
            palabras+=1
        
        
        
    return palabras
print (ContarPalabras("Hola me llamo Juan. "))