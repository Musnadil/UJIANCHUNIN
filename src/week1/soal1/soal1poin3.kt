    package week1
    class smartphone(_merk: String, _tipe: String){
        val merk = _merk
        var tipe = _tipe

        fun tampilkan(){
            println("--- Smartphone ---")
            println("Nama : " + merk)
            println("Tipe : " + tipe)
        }
    }
    fun main() {
        val hp1 = smartphone("ASUS","ZEN 3")
        hp1.tampilkan()
    }
