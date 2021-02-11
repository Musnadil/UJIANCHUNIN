# UJIANCHUNIN
Soal 1

1.	- Variable merupakan sebuah wadah untuk menampung data
	- Tipe data merupakan jenis dari data yang akan ditampung dalam variable
	
		Tipe data Integer Number : Byte,Short,Int,Long
  	
		Tipe data Decimal Number : Float, Double
  	
		Tipe data character : Char
  
		Tipe data Boolean : True/False
  
		Tipe data String : String
  
		Tipe data Array : Array< String >, Array< Int >
  
		Tipe data Range : dalam kotlin untuk membuat sebuah range cukup mudah yaitu dengan tanda .. 
  	contoh: 1..100 = range dari 1 sampai 100

	
		Variable Immuteble (tidak bisa dirubah) : val
	
		Variable Mutable (bisa dirubah) : var
	
		Nullable, nullable bukan tipe data ataupun variable melainkan value dari sebuah variable, karena pada kotlin jika sebuah variable tidak memiliki nilai akan error, maka dari itu diperlukan nilai null




2.	if-else dan switch-case merupakan kode program untuk melakukan percabangan, dalam 	kotlin switch-case biasa disebut dengan when. Perbedaan dari kedua kode program tersebut 
	adalah :
	
	- if-else akan menjalankan perintah ketika statement terpenuhi. Apabila if expression statement belum terpenuhi dan kita ingin menjalankan perintah lain di kondisi yang berbeda maka menggunakan else expression, dan apabila ingin menambahkan percabangan lain maka bisa menggunakan else-if expression. 
	  
	- when akan menjalankan perintah yang berbeda berdasarkan nilai dari agrument variable

	- when expression hanya bisa dinyatakan dengan bilangan bulat/string sedangkan if-else bisa 	  menggunakan operasi (<,>,<=,>=,==,!=)

	- berbeda dengan switch case when expression tidak menggunakan break untuk mengakhiri 	  program percabangannya, sedangkan pada if-else menggunakan else expression
>
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



3.  Fungsi dari method dan function sama yaitu sekumpulan baris kode yang dapat di panggil hanya dengan menyebutkan nama functionnya tanpa harus menulis ulang kodenya. Bedanya adalah apabila blok perintah ada di dalam class merupakan method sedangkan jika blok perintah di luar class merupakan function. Method merupakan istilah yang dipakai untuk pemrograman OOP, sedangkan Function merupakan istilah yang digunakan untuk pemrograman struktural
>
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
