package week1

fun main(){
    for(i in 4 downTo 1){
        for(k in i..4){
            print(" ")
        }
        for(j in 1..i){
            print("$j ")
        }
        println("")
    }
}