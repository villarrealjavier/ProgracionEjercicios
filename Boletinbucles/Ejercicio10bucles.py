
def obtenerDivisores(numero):
    listadivisores = []
    for i in range (1,numero+1):
        if numero%i==0:
            listadivisores.append(i)
    return listadivisores
def esprimo (number):
    resultado=False
    if number<=0:
        resultado=False
    else:
        numdivisores=0
    for i in range (1,(numero+1)):
            if number%i==0:
                numdivisores+=1
            if numdivisores==2:
                resultado=True
    return resultado or number==1
print (obtenerDivisores(284))

def friends(numeroa,numerob):
    listadiva=[]
    listadivb=[]
    for i in range (1,numeroa):
        if (numeroa%i==0):
            listadiva.append(i)
    for j in range (1,numerob):
        if (numerob%j==0):
            listadivb.append(j)
    if sum(listadiva)==numerob and sum(listadivb)==numeroa:
        return True
    return False
print(friends(220, 284))