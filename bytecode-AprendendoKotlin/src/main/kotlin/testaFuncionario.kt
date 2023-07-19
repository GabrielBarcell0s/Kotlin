fun testaFuncionario(){
    val gabriel = Analista(
        nome = "Gabriel",
        cpf = "111.111.111-64",
        salario = 1050.0
    )
    val junior = Gerente(
        nome = "junior",
        cpf = "111.112.222-22",
        salario = 2500.0,
        senha = 1515
    )

    val fran = Diretor(
        nome = "Francisco",
        cpf = "152.152.152-15",
        salario = 5000.0,
        senha = 2115,
        plr = 400.0
    )

    val leticia = Analista(
        nome = "leticia",
        cpf = "152.152.152-23",
        salario = 3000.0
    )

    println("nome:${gabriel.nome}")
    println("cpf:${gabriel.cpf}")
    println("salario:${gabriel.salario}")
    println("bonificação: ${gabriel.bonificacao}\n")

    println("nome:${junior.nome}")
    println("cpf:${junior.cpf}")
    println("salario:${junior.salario}")
    println("bonificação: ${junior.bonificacao}")
    println("Autenticado: ${junior.autentica(2030)}\n")

    println("nome:${fran.nome}")
    println("cpf:${fran.cpf}")
    println("salario:${fran.salario}")
    println("bonificação: ${fran.bonificacao}")
    println("Autenticado: ${fran.autentica(2115)}\n")

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(gabriel)
    calculadora.registra(fran)
    calculadora.registra(junior)
    calculadora.registra(leticia)

    print("total de bonificação: ${calculadora.total}")
}