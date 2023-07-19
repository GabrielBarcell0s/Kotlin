fun testaContasDiferentes(){
    val contaCorrente: ContaCorrente = ContaCorrente("Gabriel", 9831)
    val contaPoupanca = ContaPoupanca("Gabriel", 9832)

    contaPoupanca.Depositar(1000.0)
    contaCorrente.Depositar(1000.0)

    println(contaPoupanca.Saldo)
    println(contaCorrente.Saldo)

    contaPoupanca.Sacar(100.0)
    contaCorrente.Sacar(100.0)

    println(contaPoupanca.Saldo)
    println(contaCorrente.Saldo)

    contaCorrente.Transferencia(100.0, contaPoupanca)

    println(contaPoupanca.Saldo)
    println(contaCorrente.Saldo)
}