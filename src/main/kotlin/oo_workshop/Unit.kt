package oo_workshop

internal enum class Unit {
    Teaspoon,
    Tablespoon(3, Teaspoon),
    Ounce(2, Tablespoon),
    Cups(8, Ounce),
    Pint(2, Cups),
    Quart(2, Pint),
    Gallon(4, Quart),
    ;

    private val baseUnitRatio: Double

    constructor() {
        baseUnitRatio = 1.0
    }

    constructor(relativeRatio: Number, relativeUnit: Unit) {
        baseUnitRatio = relativeRatio.toDouble() * relativeUnit.baseUnitRatio
    }

    override fun toString() = name

    internal fun ratio(other: Unit) = this.baseUnitRatio / other.baseUnitRatio
}

val Number.Teaspoons: Measurement get() = Measurement(this.toDouble(), Unit.Teaspoon)
val Number.Tablespoons: Measurement get() = Measurement(this.toDouble(), Unit.Tablespoon)
val Number.Ounces: Measurement get() = Measurement(this.toDouble(), Unit.Ounce)
val Number.Cups: Measurement get() = Measurement(this.toDouble(), Unit.Cups)
val Number.Pints: Measurement get() = Measurement(this.toDouble(), Unit.Pint)
val Number.Quarts: Measurement get() = Measurement(this.toDouble(), Unit.Quart)
val Number.Gallons: Measurement get() = Measurement(this.toDouble(), Unit.Gallon)
