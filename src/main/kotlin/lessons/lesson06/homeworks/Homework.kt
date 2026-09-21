//№1
fun SeasonOfYear(Month : Byte) {
    when (Month) {
        1, 2, 12 -> println("Зима")
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        else -> println("Неверное значение месяца")
    }
}

//№2
fun DogAge(DogYears : Double) {
    if (DogYears < 0.0) {
        println("Неверное значение возраста собаки")
        return
    }
    var HumanYears : Double = 0.0
    when {
        DogYears in 0.0..2.0 -> HumanYears = DogYears * 10.5
        DogYears > 2.0 -> HumanYears = (2.0 * 10.5) + ((DogYears - 2.0) * 4)
    }
    println(HumanYears)
}

//№3
fun WhatTransport(Distance : Double) {
    if (Distance < 0.0) {
        println("Неверное значение расстояния")
        return
    }
    when {
        Distance <= 1.0 -> println("Пешком")
        Distance <= 5.0  -> println("Велосипед")
        else -> println("Автотранспорт")
    }
}

//№4
fun CalcBonus(Amount : Int) {
    if (Amount < 0) {
        println("Неверное значение стоимости")
        return
    }
    val BaseBonus : Int = (Amount - Amount % 100) /100
    var KBonus : Int = 0
    when {
        Amount in 0..1000 -> KBonus = 2
        Amount > 1000 -> KBonus = 3
    }
    val Bonus = BaseBonus * KBonus
    println(Bonus)
}

//№5
fun TypeOfFile(Extension : String) {
    when {
        Extension in listOf("txt", "doc", "docx", "odt") -> println("Текстовый документ")
        Extension in listOf("jpg", "jpeg", "png", "svg") -> println("Изображение")
        Extension in listOf("xls", "xlsx", "ods") -> println("Таблица")
        else -> println("Неизвестный тип файла")
    }
}

//№6
fun ConvertTemperature(StartTemperature : Double, StartGrade : Char) {
    if (!(StartGrade in listOf('C', 'F'))) {
        println("Неверное значение единицы измерения")
        return
    }
    var EndTemperature : Double = 0.0
    when (StartGrade) {
        'C' -> EndTemperature = StartTemperature * 9.0 /5.0 + 32.0
        else -> EndTemperature = (StartTemperature - 32) * 5.0 / 9.0
    }
    println(EndTemperature)
    if (StartGrade == 'C') {print("F")}
    else {print("C")}
}

//№7
fun WhatClothes(Temperature : Int) {
    when {
        Temperature < -30 -> println("Не выходите из дома")
        Temperature < 10 -> println("Куртка и шапка")
        Temperature <= 18  -> println("Ветровка")
        Temperature <= 35  -> println("Футболка и шорты")
        else -> println("Не выходите из дома")
    }
}

//№8
fun FilmLimit(Age : Int) {
    if (Age < 0) {
        println("Неверное значение возраста")
        return
    }
    when {
        Age <= 9 -> println("Детский фильм")
        Age < 18 -> println("Подростковый фильм")
        else -> println("Взрослый фильм")
    }
}