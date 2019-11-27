package oo_workshop

abstract class Unit(private val tablespoons: Int) {
    fun asGallon(): Gallon {
        return Gallon.fromTableSpoons(tablespoons)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Unit) return false
        return this.tablespoons == other.tablespoons
    }

    override fun hashCode() = this.tablespoons.hashCode()

    override fun toString() = "T($tablespoons)"
}
