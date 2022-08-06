fun main () {
    val likes = 31
    var peopemans = "людям"
    if ((likes % 10) == 1) {peopemans = "человеку"}
    println("Понравилось " + likes + " " + peopemans)
}