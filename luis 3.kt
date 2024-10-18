//Exercício 1

fun main (){
    //crescente()
    print("\n")
    //decrescente()
    println()
    //excetoM5()
    //somaSequencia()
    escada(9)
    escadaInversa(9)
}

fun crescente() {
    for (i in 1..50) {
        print("$i ")
    }
}

//Exercício 2
fun decrescente () {
    for(i in 50 downTo 1){
        print("$i ")
    }

}

//Exercicio 3
fun excetoM5(){
    for(i in 1..50) {
        if (i % 5 != 0) {
        print("$i ")
        }
    }
}

//Exercicio 4
fun somaSequencia(){
    var soma = 0
    for(i in 1..500){

    }
}

//Exercicio 5
fun escada(n: Int){
    for (i in 1..n){
        for (i in 1..i){
            print("#.")
        }
        println()
    }
}

//Exercicio do Luisão
fun escadaInversa(n: Int) {
    for (i in n downTo 1) {
        for (i in 1..i) {
            print("#.")
        }
        println()
    }
}
