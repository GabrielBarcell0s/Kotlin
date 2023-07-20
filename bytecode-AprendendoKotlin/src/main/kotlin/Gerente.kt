class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), IAutenticavel {
    override val bonificacao: Double get() = (salario * .1) + salario
    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}