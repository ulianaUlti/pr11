import java.awt.Color
import java.math.RoundingMode.valueOf

fun main(){
    try {
        println("Выбор дня недели")

        println("Введите день недели ")
        val day = readLine()!!.toString()
        val dayy = Wek.valueOf(day)
        println("На английском: ${Wek(dayy)}")
        println("Рабочий или нет: ${Wek2(dayy)}")
        println("Номер кода: ${translate(dayy)}")
        println()
        println("Выбор цвета")

        println("Введите цвет ")
        val color= readLine()!!.toString()
        val color2 = Color.valueOf(color)

       // printAllValues&lt;ColorType&gt;()
        println("На английском: ${Color(color2)}")
        println("Номер цвета: ${translate2(color2)}")
    }
    catch (e:Exception){
        println("Неверный ввод")
        return
    }
}