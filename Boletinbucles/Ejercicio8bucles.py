'''. Realizar un programa que pregunte el número de partidos jugados en esta jornada. Luego
para cada uno de las jornadas debe preguntar el número de goles del equipo local y del
equipo visitante y el programa debe determinar el resultado de la quiniela. Debe asegurarse
que los valores son correctos.'''
print("Hola")
numero_partidos=int(input("Introduzca el numero de partidos jugados en la jornada: "))
while numero_partidos<=0:
    numero_partidos=int(input("Error.Introduzca el numero de partidos jugados en la jornada: "))
lista=[]
for i in range (numero_partidos):
    print("Partido numero", i+1)
    goleslocal=int(input("Introduzca el numero de goles del equipo local: "))
    while goleslocal<=0:
        goleslocal=int(input("Error.Introduzca el numero de goles del equipo local: "))
    
    goles_visitante=int(input("Introduzca el numero de goles del equipo visitante: "))
    while goles_visitante<=0:
        goles_visitante=int(input("Error.Introduzca el numero de goles del equipo visitante: "))
    if goleslocal==goles_visitante:
        lista.append('X')
    elif goleslocal>goles_visitante:
        lista.append(1)
    elif goleslocal<goles_visitante:
        lista.append(2)
for i in range(len(lista)):
    print(lista[i])