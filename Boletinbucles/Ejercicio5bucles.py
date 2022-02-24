print("Hola")
CoordenadaX=int(input("Introduzca la cordenada X: "))
CoordenadaY=int(input("Introduzca la cordenada Y: "))

if CoordenadaX>=0:
    if CoordenadaY>=0:
        print("Cuadrante 2")
    else:
        print("Cuadrante 4")
if CoordenadaX<=0:
    if CoordenadaY>=0:
        print("Cuadrante 1")
    else:
        print("Cuadrante 3")