/** Somebody who wants to be elected in a [contest]. */
class Candidate(val name: String) {}

/** A race to be elected to a position between some [candidates]. */
abstract class Contest(val candidates: Set<Candidate>) {
    private var winner: Candidate? = null
    abstract fun decideWinner(): Candidate

    fun getWinner(): Candidate {
        val winner = this.winner ?: this.decideWinner()
        if (this.winner == null) {
            this.winner = winner
        }
        return winner
    }
}

/**
 * A [contest] where a winner is randomly selected from the given
 * [candidates].
 */
class SortitionContest(candidates: Set<Candidate>) : Contest(candidates) {
    override fun decideWinner(): Candidate {
        /* declare a winner at random */
        return candidates.random()
    }
}
