package oo_workshop

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

internal class MeasurementTest {

    @Test
    internal fun equality() {
        assertEquals(Gallon(1), Gallon(1))
        assertEquals(Gallon(1), Gallon(1).asGallon())
        assertNotEquals(Gallon(1), Gallon(2))
    }

    @Test
    internal fun gallonsAsQuarts() {
        assertEquals(Gallon(1), Quart(4))
    }

    @Test
    internal fun hashcode() {
        assertEquals(Gallon(1).hashCode(), Gallon(1).hashCode())
        assertNotEquals(Gallon(1).hashCode(), Gallon(2).hashCode())
    }
}
