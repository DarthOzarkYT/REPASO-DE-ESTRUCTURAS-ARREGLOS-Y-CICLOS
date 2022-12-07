var numero: Double = 0.0
var i: Double = 0.0
var promedio: Double = 0.0
var suma: Double = 0.0

fun main(){
    do{
        print("Ingresa numero ${i+1}: ")
        numero = readLine()!!.toDouble()
        i++
        suma += numero
    }while (numero != 0.0)
    println("La sumatoria es: $suma")
    var i2 = i-1
    promedio = suma/i2
    println("El promedio es: $promedio")
}