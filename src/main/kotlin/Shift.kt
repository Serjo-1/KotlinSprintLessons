fun  main() {

    val shiftMinutes = 447
    val orders = 23
    val ratePerOrder = 85

    val hours = shiftMinutes / 60
    val minutes = shiftMinutes % 60
    println("Смена: $hours ч $minutes мин")
    println("Количесто заказов : $orders")

    val totalRate = ratePerOrder * orders
    println("Общая сумма : $totalRate руб.")

    val middleRateOrder = totalRate/ orders
    println("средняя выручка : $middleRateOrder руб.")

    val ratePerMinutes = shiftMinutes / orders
    println("Среднее время заказа : $ratePerMinutes мин.")


}

