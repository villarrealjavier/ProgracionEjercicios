'''Diseñar un programa que calcule el perímetro de una figura geométrica. Para ello debemos
preguntar “¿Cuántos lados tiene la figura?”. Luego debemos pedir la longitud de cada uno
de los lados y mostrar el perímetro. Se debe garantizar que los datos son correctos.'''
print("Hola rellene el siguiente cuestionario: ")
numerolados=int(input("Cuantos lados tiene la figura: "))
resultado=0
while numerolados<0:
    numerolados=int(input("Error.Cuantos lados tiene la figura: "))
if numerolados>=0:
    for i in range (numerolados):
        lado=int(input("Introduce la longitud del lado: "))
        while lado<0:
            lado=int(input("Error.Introduce la longitud del lado: "))
        else:
            resultado=resultado+lado
        
    
print("El perímetro es ",resultado)
