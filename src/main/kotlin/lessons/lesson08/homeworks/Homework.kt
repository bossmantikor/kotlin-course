// №1
fun transformPhrase(phrase: String): String {
    var result = phrase.trim()
    
    val words = result.split("\\s+".toRegex())
    if (words.size == 1 && result.isNotBlank()) {
        return "Имeнно, ${result}, но не всегда"
            .replace("Имeнно,", "Иногда,")
    }
    
    if (result.contains("невозможно", ignoreCase = true)) {
        result = result.replace("невозможно", "совершенно точно возможно, просто требует времени")
    }
    
    if (result.startsWith("Я не уверен")) {
        result += ", но моя интуиция говорит об обратном"
    }
    
    if (result.contains("катастрофа", ignoreCase = true)) {
        result = result.replace("катастрофа", "интересное событие")
            .replace("Катастрофа", "Интересное событие")
    }
    
    if (result.endsWith("без проблем")) {
        result = result.removeSuffix("без проблем") + "с парой интересных вызовов на пути"
    }
    
    return result
}

// №2
fun extractDateAndTime(logEntry: String) {
    val arrowIndex = logEntry.indexOf("->")
    
    if (arrowIndex != -1) {
        val dateTimePart = logEntry.substring(arrowIndex + 2).trim()
        
        val parts = dateTimePart.split(" ")
        
        if (parts.size >= 2) {
            val date = parts[0]
            val time = parts[1]
            
            println("Дата: $date")
            println("Время: $time")
        }
    } else {
        println("Формат лога не распознан")
    }
}

// №3
fun maskCreditCard(cardNumber: String): String {
    val cleanNumber = cardNumber.replace(" ", "")
    
    val lastFour = if (cleanNumber.length >= 4) {
        cleanNumber.takeLast(4)
    } else {
        cleanNumber
    }
    
    val maskedCount = cleanNumber.length - 4
    
    val masked = "*".repeat(maxOf(0, maskedCount)) + lastFour
    
    return masked.chunked(4).joinToString(" ")
}

// №4
fun formatEmail(email: String): String {
    return email
        .replace("@", " [at] ")
        .replace(".", " [dot] ")
}

// №5
fun extractFileName(filePath: String): String {
    val lastSlash = maxOf(
        filePath.lastIndexOf('/'),
        filePath.lastIndexOf('\\')
    )
    
    return if (lastSlash != -1) {
        filePath.substring(lastSlash + 1)
    } else {
        filePath
    }
}

// №6
fun createAcronym(phrase: String): String {
    var acronym = ""
    val words = phrase.split(" ")
    
    for (word in words) {
        if (word.isNotEmpty()) {
            acronym += word.first().uppercaseChar()
        }
    }
    
    return acronym
}