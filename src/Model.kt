/** Somebody who wants to be elected in a contest. */
class Candidate(val name: String) {}

/**
 * A contest where a single winner is randomly selected from the given
 * [candidates].
 */
class SortitionContest(val candidates: Set<Candidate>) {
    private var winner: Candidate? = null

    fun getWinner(): Candidate {
        /* declare a winner at random */
        val winner = this.winner ?: candidates.random()
        if (this.winner == null) {
            this.winner = winner
        }
        return winner
    }
}
