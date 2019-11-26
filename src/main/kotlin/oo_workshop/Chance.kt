package oo_workshop

class Chance(private val probability: Double) {
    operator fun not(): Chance {
        return Chance(1 - probability)
    }

    override fun hashCode(): Int {
        return probability.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Chance) return false
        return this.probability == other.probability
    }
}
