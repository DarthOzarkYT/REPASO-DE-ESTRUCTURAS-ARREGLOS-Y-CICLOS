import java.lang.Exception
import kotlin.math.roundToInt

var tarifa: Float = 2.25F
var precioFinal: Float = 0.0F
var precioConDescuento: Float = 0.0F
var km: Float = 0.0F

fun main(){
    try{
        print("Inserte la cantidad de kilometros: ")
        km = readLine()!!.toFloat()
    }catch (e: Exception){
        println("Se deben ingresar los kilómetros del trayecto")
    }finally {
        print("Cuenta con identificación que acredite ser mayor de 60 años: ")
        val edad = readLine()!!.toString()
        if(edad == "si" || edad == "1" || edad == "Si"){
            precioFinal = km * tarifa
            precioConDescuento = (precioFinal - (precioFinal * 0.45)).roundToInt().toFloat()
            println("Total a cobrar: $precioConDescuento")
        }else{
            precioFinal = (km * tarifa).roundToInt().toFloat()
            println("Total a cobrar: $precioFinal")
        }
    }
}