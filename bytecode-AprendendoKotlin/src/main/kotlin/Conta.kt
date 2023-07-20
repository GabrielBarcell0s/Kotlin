abstract class Conta(val titular: String, val numero: Int) {
    var Saldo = 0.0
        protected set


    fun Depositar(valor: Double) {
        Saldo += valor
    }

    abstract fun Sacar(valor: Double)

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
