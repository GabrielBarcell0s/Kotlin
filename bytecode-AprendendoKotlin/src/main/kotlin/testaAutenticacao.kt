fun testaAutenticao(){
    val gerente = Gerente(
        nome = "Gabriel",
        cpf = "123.123.123-52",
        salario = 1500.0,
        senha = 1515
    )

    val diretor = Diretor(
        nome = "Leticia",
        cpf = "123.123.123-62",
        salario = 1500.0,
        senha = 2121,
        plr = 300.0
    )

    val cliente = Cliente(
        nome = "Junior",
        cpf = "123.123.123-64",
        senha = 2324
    )

    val sistema = SistemaInterno()

    sistema.entra(admin = diretor,senha = 2121)
    sistema.entra(admin = gerente,senha = 1515)
    sistema.entra(admin = cliente,senha = 2324 )
}