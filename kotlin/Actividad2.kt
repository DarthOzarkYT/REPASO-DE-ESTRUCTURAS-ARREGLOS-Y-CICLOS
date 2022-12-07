val alumno = arrayOf("Jose","Alberto","Laura","Noel","Erika","Daniel")
val calificaciones = arrayOf(31.0, 94.0, 98.5, 75.0, 46.5, 75.0)

fun main(){
    promedio()
    califAlta()
    califBaja()
    reprobados()
}

fun promedio(){
    var promedio = 0.0F
    for(element in calificaciones){
        promedio = (promedio + element).toFloat()
    }
    promedio /= calificaciones.size
    println("El promedio de las calificaciones es: $promedio")
}

fun califAlta(){
    var x = 0.0F
    for (element in calificaciones){
        if(element > x){
            x = element.toFloat()
        }
    }
    println("\nCalificación más alta: $x")
}

fun califBaja(){
    var x: Float = calificaciones[1].toFloat()
    for (element in calificaciones){
        if(element < x){
            x = element.toFloat()
        }
    }
    println("\nCalificación más baja: $x")
}

fun reprobados(){
    for ((i, element) in calificaciones.withIndex()){
        alumno[i]
        if(element < 60.0){
            println(alumno[i] + ", "+element)
        }
    }
}