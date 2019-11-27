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
        internal val Teaspoon = Unit("Teaspoon")
        internal val Tablespoon = Unit("Tablespoon", 3, Teaspoon)
        internal val Ounce = Unit("Ounce", 2, Tablespoon)
        internal val Cups = Unit("Cups", 8, Ounce)
        internal val Pint = Unit("Pint", 2, Cups)
        internal val Quart = Unit("Quart", 2, Pint)
        internal val Gallon = Unit("Gallon", 4, Quart)
    }

    override fun toString(): String {
        return name
    }

    internal fun ratio(other: Unit) =
            this.baseUnitRatio / other.baseUnitRatio
}

val Number.Teaspoons: Measurement get() = Measurement(this.toDouble(), Unit.Teaspoon)
val Number.Tablespoons: Measurement get() = Measurement(this.toDouble(), Unit.Tablespoon)
val Number.Ounces: Measurement get() = Measurement(this.toDouble(), Unit.Ounce)
val Number.Cups: Measurement get() = Measurement(this.toDouble(), Unit.Cups)
val Number.Pints: Measurement get() = Measurement(this.toDouble(), Unit.Pint)
val Number.Quarts: Measurement get() = Measurement(this.toDouble(), Unit.Quart)
val Number.Gallons: Measurement get() = Measurement(this.toDouble(), Unit.Gallon)
