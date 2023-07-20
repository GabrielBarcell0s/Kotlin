class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), IAutenticavel {

    override val bonificacao: Double get() = (salario * .1) + salario + plr
    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

}