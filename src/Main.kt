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

    val contest = SortitionContest(candidates)
    val winner = contest.getWinner()

    println("The winner is: ${winner.name}")
}
