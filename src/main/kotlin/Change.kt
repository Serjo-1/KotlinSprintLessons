fun main() {
    val total = 1350
    val paid = 2000

    println("Сумма к оплате : $total руб.")
println("Получено наличных : $paid руб.")
    val change =  paid - total
    println("сдача : $change руб.")

    val count500 = change / 500
    val rest500 = change % 500
    println("Купюр по 500 : $count500 шт.")

    val count100 = rest500 / 100
    println("Купюр по 100 $count100 шт.")
    val rest100 = rest500 % 100

    val count50 = rest100 / 50
    val rest50= rest100 % 50
    println("Купюр по 50 : $count50 шт.")

    val count10= rest50 / 10
    val rest10 = rest50 % 10
    println("Купюр по 10 : $count10 шт.")

    val totalBanknote= count500 + count100 + count50 + count10
    println("Купюр всего : $totalBanknote")
    val totalCount = (count500*500) + (count100*100) +  (count50* 50) + (count10*10) == change
    println("Результат при пересчете : $totalCount")







}

