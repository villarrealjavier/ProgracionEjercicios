database = []
def CargaInicial():
    database.append(['alejandra', 'pass1',0])
    database.append(['daniel', 'pass2',0])
    database.append(['jm','pass3', 0])
    
def Login(usuario,password):
    existeUsuario = False
    
    for i in database:
        if i[0]==usuario and i[2]<3:
            
            if i[2]==3:
                print("Vuelve a intentarlo dentro de 20 min.")
                i[2]=0
            elif i[1]==password:
                existeUsuario=True
            else: 
                i[2]+=1
                
                
    return existeUsuario

def Interfaz():
    user=" "
    while user!="exit":
        user=input("usuario: ")
        password=input("Password: ")
        if Login(user,password):
            print("Usuario válido")
        else:
            print("Usuario no válido")
            
CargaInicial()
Interfaz()
            