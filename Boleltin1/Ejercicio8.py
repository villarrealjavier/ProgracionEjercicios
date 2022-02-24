print ("Hola introduce los siguientes datos")
monedas2eu=int(input("Introduce la cantidad de monedas de 2 euros que contienes: "))
monedas1eu=int(input("Introduce la cantidad de monedas de 1 euros que contienes: "))
monedas50cent=int(input("Introduce la cantidad de monedas de 50 centimos que contienes: "))
monedas20cent=int(input("Introduce la cantidad de monedas de 20 centimos que contienes: "))
monedas10cent=int(input("Introduce la cantidad de monedas de 10 centimos que contienes: "))
euros=(monedas1eu*1)+(monedas2eu*2)
centimos=(monedas10cent*10)+(monedas20cent*20)+(monedas50cent*50)
while centimos>=100 :
    euros= euros+1
    centimos= centimos-100
    
    
print ("Tienes " + str(euros) + " monedas" + " y " + str(centimos) + " centimos")
