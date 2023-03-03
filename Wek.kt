import java.awt.Color

enum class Wek {понедельник,вторник,среда,четверг,пятница,суббота,воскресенье;
}
fun Wek(day:Wek):String{
    return when(day){
        Wek.понедельник->"monday"
        Wek.вторник->"tuesday"
        Wek.среда->"wednesday"
        Wek.четверг->"thursday"
        Wek.пятница->"friday"
        Wek.суббота->"saturday"
        Wek.воскресенье->"sunday"

    }
}
fun translate(day: Wek):Int{
    return when(day){
        Wek.понедельник->1
        Wek.вторник->2
        Wek.среда->3
        Wek.четверг->4
        Wek.пятница->5
        Wek.суббота->6
        Wek.воскресенье->7
    }
}
fun  Wek2(day: Wek):String{

    return if (day==Wek.суббота || day==Wek.воскресенье)
        "выходной"
    else
       "рабочий день"
}