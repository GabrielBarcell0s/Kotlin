class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun Sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.Saldo >= valorComTaxa){
            this.Saldo -= valorComTaxa
        }

    }
}
