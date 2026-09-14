val v1 : Byte = 42
val v2 : Long = 98765432123456789L
val v3 : Float = 23.45f
val v4 : Double = 0.123456789
val v5 : String = "Kotlin & Java"

// написано капсом, поставил тип, в оригинале не было
//val v6 : Boolean = FALSE

val v7 : Char = 'c'
val v8 : Short = 500
val v9 : Long = 4294967296L
val v10 : Float = 18.0f
val v11 : Double = -0.001
val v12 : String = "OpenAI"

// наверное подразумевался boolean и без кавычек, тип не стал ставить, в текущем виде string
//val v13 = "true"

val v14 : List<Byte> = listOf(3, 14)
val v15 : Char = '9'
val v16 : Short = 2048
val v17 : Long = 10000000000L
val v18 : Set<String> = setOf("OpenAI", "Quantum Computing")
val v19 : Float = 5.75f

// наверное подразумевался double и без кавычек, тип не стал ставить, если кавычки сделать нормальными будет string
//val v20 = `1.414`

val v21 : String = "Artificial Intelligence"

// не знаю ошибка это или ловушка, может надо было догадаться до any а может должны были быть одинарные кавычки и char, второе наверное логичнее, но на всякий поставил any
//val v22 : Array<Any> = arrayOf('x', "A")

val v23 : String = "Android Studio"
val v24 : Char = '@'
val v25 : Short = 1024
val v26 : Long = 1234567890123L
val v27 : Float = 10.01f
val v28 : Double = -273.15
val v29 : String = "SpaceX"

// написано капсом, поставил тип, в оригинале не было
//val v30 : Boolean = FALSE

val v31 : Double = 0.007

// кавычки должны быть нормальные, обычно юникодовские смайлики это несколько печатных символов, так что предположу тут string
//val v32 = “🤯”

// аналогично с v22, не пойму ловушка или ошибка, догадаться до string или исправить на boolean, но здесь мне вероятнее кажется первое,  т.к. 
// даже если kotlin допускает булевы ключи, то это не интуитивно и я за string
//val v33 : Map<String, Byte> = mapOf("true" to 2, "false" to 34)

// кавычки должны быть нормальные если хотели строку, или вообще не быть если число
//val v34 = ‘65535’

val v35 : Long = 72057594037927935L
val v36 : Float = 2.71828f
val v37 : Double = 101.0101
val v38 : String = "Quantum Computing"

// тут всё не нравится, и числа в ключах, и строки в значениях просятся в boolean, но предположим вот так
//val v39 : Map<Byte, String> = mapOf(2 to "true", 34 to "false")

val v40 : Char = 'x'
val v41 : Short = 314
val v42 : Long = 123456789123456789L
val v43 : Float = 6.626f

// написано капсом, поставил тип, в оригинале не было
//val v44 : Boolean = TRUE