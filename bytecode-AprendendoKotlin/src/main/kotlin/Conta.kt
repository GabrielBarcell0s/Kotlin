abstract class Conta(val titular: String, val numero: Int) {
    var Saldo = 0.0
        private set


    fun Depositar(valor: Double) {
        Saldo += valor
    }

    open fun Sacar(valor: Double) {
        if (Saldo > valor) {
            Saldo -= valor
        } else {
            print("saldo Insuficiente")
        }
    }

    fun Transferencia(valor: Double, destino: Conta) {
        if (Saldo > valor) {
            Sacar(valor)
            destino.Depositar(valor)

            println("Transferencia de $valor foi feita de ${titular} para ${destino.titular}")
        } else {
            print("saldo Insuficiente")
        }
    }


}
