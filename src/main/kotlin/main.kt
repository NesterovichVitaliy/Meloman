fun main () {
    val discountStart1 = 1_000
    val discountStart2 = 10_000
    val discount = 100
    val discountPercent = 0.95
    val discountRegular = 0.99

    val isRegular = true
    val totalPrice = 1000

    val result = if (isRegular) {
        if (totalPrice <= discountStart1) totalPrice * discountRegular
        else if ((totalPrice > discountStart1) && (totalPrice > discountStart2)) (totalPrice * discountPercent) * discountRegular
        else (totalPrice - discount) * discountRegular
    } else {
        if (totalPrice <= discountStart1) totalPrice
        else if ((totalPrice > discountStart1) && (totalPrice > discountStart2)) totalPrice * discountPercent
        else totalPrice - discount
    }

    println("Итоговая цена в рублях: $result")
}