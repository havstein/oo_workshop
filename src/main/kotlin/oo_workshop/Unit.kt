package oo_workshop

class Unit {

    private val name: String
    private val baseUnitRatio: Double

    private constructor(name: String) {
        this.name = name
        baseUnitRatio = 1.0
    }

    private constructor(name: String, relativeRatio: Number, relativeUnit: Unit) {
        this.name = name
        baseUnitRatio = relativeRatio.toDouble() * relativeUnit.baseUnitRatio
    }

    companion object {
        val Teaspoon = Unit("Teaspoon")
        val Tablespoon = Unit("Tablespoon", 3, Teaspoon)
        val Ounce = Unit("Ounce", 2, Tablespoon)
        val Cups = Unit("Cups", 8, Ounce)
        val Pint = Unit("Pint", 2, Cups)
        val Quart = Unit("Quart", 2, Pint)
        val Gallon = Unit("Gallon", 4, Quart)
    }

    override fun toString(): String {
        return name
    }

    internal fun ratio(other: Unit) =
            this.baseUnitRatio / other.baseUnitRatio
}
