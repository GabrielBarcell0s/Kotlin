fun testaCondicoe(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }

//    if (saldo > 0.0){
//        println("conta é positiva")
//    }else if(saldo == 0.0){
//        println("conta é neutra")
//    }else{
//        println("conta é negativa")
//    }
}