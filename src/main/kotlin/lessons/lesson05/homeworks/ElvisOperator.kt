fun main(StartSound : Double?, KSound : Double?, StartPrice : Double?, Metrics : List<Short?>) {

    fun task1(StartSound : Double?, KSound : Double?) {
        val EndSound : Double = (StartSound ?: 0.0) * (KSound ?: 0.5)
        println(EndSound)
    }

    fun task2(StartPrice : Double?) {
        val Price : Double = StartPrice ?: 50.0
        val EndPrice : Double = Price + Price * 0.005
        println(EndPrice)
    } 

    fun task3(Metrics : List<Short?>) {
        for (metric in Metrics) {
            println(metric ?: "нет показаний!")
        }
    }

    task1(StartSound, KSound)
    task2(StartPrice)
    task3(Metrics)
}

main(
StartSound = 50.0,
KSound = 0.4,
StartPrice = 1544,
Metrics = listOf<Short?>(759,761,null,758,741,null)
)