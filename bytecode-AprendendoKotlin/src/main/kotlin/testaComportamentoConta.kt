    fun testaComportamentoConta(){
        val contaGabriel = ContaCorrente("Gabriel", 2004)
        val contaJunior = ContaCorrente("Junior", 5302)

        contaGabriel.Depositar(1500.0)
        contaGabriel.Sacar(15.0)

        contaGabriel.Transferencia(300.0, contaJunior)


        println(contaJunior.Saldo)
        println(contaJunior.numero)

        println(contaGabriel.Saldo)
    }
