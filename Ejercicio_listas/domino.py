
def Domino(fichaA,fichaB):
    Resultado=False
    for i in range (len(fichaA)):
        if fichaA[0]==fichaB[i]:
            Resultado=True
        if fichaA[2]==fichaB[i]:
            Resultado=True
    return Resultado
print (Domino("3,4", "2,4"))