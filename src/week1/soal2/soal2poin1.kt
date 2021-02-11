package week1
fun main() {
    var nilai:Boolean=true
    while (nilai) {
        print("Masukan nilai bahasa Indonesia : ")
        var indo = readLine()
        print("Masukan nilai bahasa Inggris : ")
        var inggris = readLine()
        print("Masukan nilai bahasa Matematika : ")
        var mat = readLine()
        print("Masukan nilai bahasa IPA : ")
        var ipa = readLine()

        if (indo!!.length == 0 || inggris!!.length == 0 || mat!!.length == 0 || ipa!!.length == 0) {
            println("Masukkan semua nilai")
        }
        val n_indo = indo.toString().toInt()
        val n_inggris = inggris.toString().toInt()
        val n_mat = mat.toString().toInt()
        val n_ipa = ipa.toString().toInt()
        val rata:Double = (n_indo.toDouble() + n_inggris.toDouble() + n_ipa.toDouble() + n_mat.toDouble())/4
        println("Nilai rata rata kamu adalah : " + rata)

        if (rata>=90 && rata<=100){
            println("nilai rata-rata kamu adalah : "+rata+" dan grade kamu adalah A")
        }else if(rata>=80 && rata<=89){
            println("nilai rata-rata kamu adalah : "+rata+" dan grade kamu adalah B")
        }else if(rata>=70 && rata<=79){
            println("nilai rata-rata kamu adalah : "+rata+" dan grade kamu adalah C")
        }else if(rata>=60 && rata<=69){
            println("nilai rata-rata kamu adalah : "+rata+" dan grade kamu adalah D")
        }else if(rata>=0 && rata<=59){
            println("nilai rata-rata kamu adalah : "+rata+" dan grade kamu adalah E")
        }else{
            print("nilai diluar batas")
        }
    }
}

