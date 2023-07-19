class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double get() = (salario * .1) + salario


    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}