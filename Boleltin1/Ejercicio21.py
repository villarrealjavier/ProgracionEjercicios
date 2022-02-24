print("Hola rellene el siguiente cuestionario: ")
numero=int(input("Introduce la cantidad de numeros primos que quieres mostrar: "))
for i in range (1,numero):
    if numero%2!=0:
        print(i , "es primo. ")
    elif i%2==0:
        print(i , "no es primo. ")
    
        