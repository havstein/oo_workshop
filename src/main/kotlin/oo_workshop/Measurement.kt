package oo_workshop

import kotlin.math.absoluteValue

class Measurement internal constructor(quantity: Number, private val unit: Unit) {

    private val quantity = quantity.toDouble()

    operator fun plus(other: Measurement): Measurement {
        return Measurement(
                quantity = this.convertedAmount(other.unit) + other.quantity,
                unit = unit
        )
    }

    operator fun compareTo(other: Measurement) =
            this.convertedAmount(other.unit).compareTo(other.quantity)

    private fun convertedAmount(other: Unit) =
            this.unit.ratio(other) * this.quantity

    override fun equals(other: Any?): Boolean {
        if (other !is Measurement) return false
        return (this.convertedAmount(other.unit) - other.quantity).absoluteValue < marginOfError
    }

    override fun toString(): String {
        return "Measurement(qty=$quantity, unit=${unit.javaClass.simpleName})"
    }

    override fun hashCode(): Int {
        var result = quantity.hashCode()
        result = 31 * result + unit.hashCode()
        return result
    }

    private val marginOfError = 0.000000001
}
