    package week1
    fun ifelse(){
        val angka = 10
        if(angka>0 && angka<=10){
            println("angka "+angka+" kurang dari atau sama dengan 10")
        }else if(angka<=20){
            println("angka "+angka+" kurang dari atau sama dengan 20")
        }else{
            println("angka "+angka+" lebih dari 20")
        }
    }
    fun wheen(){
        val nilai = 80
        when{
            nilai >= 80 && nilai<=100 -> println("nilai kamu A")
            nilai >= 70 -> println("nilai kamu B")
            nilai >= 60 -> println("nilai kamu C")
            nilai >= 50 -> println("nilai kamu D")
            else -> println("REMIDI!")
        }
    }
    fun main(){
        ifelse()
        wheen()
    }

