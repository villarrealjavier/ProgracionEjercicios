'''. La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro
es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro,
los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del
décimo minuto, 50 céntimos. Además, se carga un impuesto de 3 % cuando es domingo, y si
es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para
determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.'''
print("Hola")
minutos=int(input("Introduce el numero de minutos que duro la llamada"))
diadesemana=str(input("Introduce el dia de la llamada, Domingo o Semana"))
turno=str(input("Introduce el turno en el cual se realizo la llamada (Mañana o Tarde)"))
resultado=0
if minutos<=5:
    resultado=minutos*1
elif minutos<=8:
    resultado=((minutos-5)*0.80)+5
elif minutos<=10:
    resultado=((minutos-8)*0.70)+7.4
elif minutos>10:
    resultado=((minutos-10)*0.50)+8.8
    
if diadesemana=="Domingo":
    print (("El precio total es de ") + str(round(resultado*0.03+resultado,2)) +  (". De impuesto deberá pagar ") + str(resultado*0.03))
elif diadesemana=="Semana" and turno=="Mañana":
    print(("El precio total es de ") + str(round(resultado*0.15+resultado,2)) + (". De impuesto deberá pagar ") + str(resultado*0.15))
elif diadesemana=="Semana" and turno=="Tarde":
    print(("El precio total es de ") + str(round(resultado*0.10+resultado,2)) + (". De impuesto deberá pagar ") + str(resultado*0.10))