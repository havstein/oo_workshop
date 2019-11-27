package oo_workshop

class Measurement(private val quantity: Double, private val unit: Unit) {
    operator fun plus(other: Measurement): Measurement {
        return Measurement(
                quantity = this.convertTo(other.unit) + other.quantity,
                unit = unit
        )
    }

    private fun convertTo(other: Unit): Double {
        return this.unit.ratio(other) * this.quantity
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Measurement) return false
        return this.convertTo(other.unit) == other.quantity
    }

    override fun toString(): String {
        return "Measurement(qty=$quantity, unit=${unit.javaClass.simpleName})"
    }

    override fun hashCode(): Int {
        var result = quantity.hashCode()
        result = 31 * result + unit.hashCode()
        return result
    }
}
