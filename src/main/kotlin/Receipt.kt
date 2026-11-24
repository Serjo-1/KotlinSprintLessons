fun main(){

    val mugPrice = 350
    val mugCount = 2
    val mugTotal = mugPrice * mugCount
    println("Кружка x$mugCount — $mugTotal руб.")

    val tShirtPrice = 1200
    val tShirtCount = 1
    val tShirtTotal = tShirtPrice * tShirtCount
    println("Футболка x$tShirtCount — $tShirtTotal руб. ")

    val stickPackPrice = 150
    val stickPackCount = 3
    val stickPackTotal = stickPackPrice * stickPackCount
    println("Стикерпак x$stickPackCount — $stickPackTotal руб. ")

    val totalCheckPrice = mugTotal + tShirtTotal + stickPackTotal
    println("Итого: $totalCheckPrice руб. ")

}
