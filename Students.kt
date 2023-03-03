import java.io.Console
import java.io.StringReader

class Student {
    try
    {
        println("Введите имя студента")
        val name: String = Console.Readln()
        println("Введите фамилию студента")
        val fame: String = Console.Readln()
        println("Введите отчество студента")
        val otech: String = Console.Readln()

        println("Введите пол студента")
        val gender: String = Console.Readln()
        println("Введите группу студента")
        val group: String = Console.Readln()

        println("Введите вес")
        val massa: Double = Console.Readln()
        println("Введите рост")
        val height: Double = Console.Readln()
        println("Введите увлечение")
        val xobby: String = Console.Readln()
        println("Введите дату рождения")
        val databorn: String = Console.Readln()
    }
    catch(e:Expastion)
    {

    }

}

fun main() {


}