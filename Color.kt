 enum class Color { красный,желтый,зеленый,голубой,синий,черный,коричневый,фиолетовый, оранжевый;
 }
 fun Color(color: Color):String {
     return when (color){
     Color.красный->"red"
     Color.голубой->"blue"
     Color.желтый->"yellow"
     Color.зеленый->"green"
     Color.оранжевый->"orange"
     Color.синий->"dark blue"
     Color.черный->"black"
     Color.коричневый->"brown"
     Color.фиолетовый->"violet"
 }
 }
 fun translate2(color: Color):Int{
     return when (color) {
         Color.красный -> 1
         Color.голубой -> 2
         Color.желтый -> 3
         Color.зеленый -> 4
         Color.оранжевый -> 5
         Color.синий -> 6
         Color.черный -> 7
         Color.коричневый -> 8
         Color.фиолетовый->9
     }
 }