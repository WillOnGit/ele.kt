fun main() {
    /* generate and print some candidates */
    val candidates = setOf(
        Candidate("Adam Aardvark"),
        Candidate("Barbara Brown"),
        Candidate("Carlos Clarke"),
    )

    println("The candidates are:")
    for (candidate in candidates) {
        println("- ${candidate.name}")
    }

    /* declare a winner at random */
    var winner = candidates.random()

    println("The winner is: ${winner.name}")
}
