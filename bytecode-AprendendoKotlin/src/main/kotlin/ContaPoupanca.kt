class ContaPoupanca(
    titular: String,
    numero: Int
) :Conta(
    titular = titular,
    numero = numero
) {
    override fun Sacar(valor: Double) {
        if(this.Saldo >= valor){
            this.Saldo -= valor
        }
    }
}
