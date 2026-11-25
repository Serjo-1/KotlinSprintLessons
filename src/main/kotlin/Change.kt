fun main() {
    val total = 1350
    val paid = 2000

    val change =  paid - total
    println("сдача : $change руб.")

    val count500 = change / 500   // 1
    val rest500 = change % 500    // 150
    println("Купюр по 500 : $count500 шт.")

    val count100 = rest500 / 100 //1
    println("Купюр по  $count100 шт.")
    val rest100 = rest500 % 100 //50

    val count50 = count100 % 50
    println("Купюр по 50 : $count50 шт.")

    val count10= count50 / 10
    println("КУпюр по 10 : $count10 шт.")
    val totalCount = (count500*500) + (count100*100) +  (count50* 50) + (count10*10) == change
    println(totalCount)







}

