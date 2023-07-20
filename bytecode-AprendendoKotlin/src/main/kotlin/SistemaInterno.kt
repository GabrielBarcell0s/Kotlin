class SistemaInterno {
    fun entra(admin: IAutenticavel, senha: Int){
        if (admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        }
        else{
            println("Falha na autenticação")
        }
    }
}