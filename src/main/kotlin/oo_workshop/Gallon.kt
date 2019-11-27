package oo_workshop

class Gallon(amount: Int): Unit(amount * 768) {
    companion object {
        internal fun fromTableSpoons(amount: Int): Gallon {
            return Gallon(amount / 768)
        }
    }
}
