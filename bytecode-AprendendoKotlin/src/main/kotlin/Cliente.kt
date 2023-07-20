class Cliente(
    override val senha: Int,
    override val nome: String,
    override val cpf: String
):IAutenticavel, ICadastro {
    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

}