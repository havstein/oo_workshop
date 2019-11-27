package oo_workshop

class Quart(amount: Int): Unit(amount * 192) {
    companion object {
        internal fun fromTableSpoons(amount: Int): Quart {
            return Quart(amount / 192)
        }
    }
}
