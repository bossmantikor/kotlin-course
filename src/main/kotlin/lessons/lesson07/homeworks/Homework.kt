// №1
for (i in 1..5) {
    println(i)
}

// №2
for (i in 1..10 step 2) {
    println(i + 1)
}

// №3
for (i in 5 downTo 1) {
    println(i)
}

// №4
for (i in 10 downTo 1 step 2) {
    println(i)
}

// №5
for (i in 1 until 10 step 2) {
    println(i)
}

// №6
for (i in 1..20 step 3) {
    println(i)
}

// №7
val size = 10
for (i in 3 until size step 2) {
    println(i)
}

// №8
var i = 1
while (i <= 5) {
    println(i * i)
    i++
}

// №9
var j = 10
while (j >= 5) {
    println(j)
    j--
}

// №10
var k = 5
do {
    println(k)
    k--
} while (k >= 1)

// №11
var counter = 5
do {
    println(counter)
    counter++
} while (counter < 10)

// №12
for (i in 1..10) {
    if (i == 6) break
    println(i)
}

// №13
var m = 1
while (true) {
    println(m)
    if (m >= 10) break
    m++
}

// №12 - c continue
for (i in 1..10) {
    if (i % 2 == 0) continue
    println(i)
}


// №13 - c continue
var n = 1
while (n <= 10) {
    n++
    if (n % 3 == 0) continue
    println(n)
}