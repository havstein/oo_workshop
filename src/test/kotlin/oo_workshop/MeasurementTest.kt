package oo_workshop

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

internal class MeasurementTest {

    @Test
    internal fun equality() {
        assertEquals(Measurement(1.0, Unit.Gallon), Measurement(1.0, Unit.Gallon))
        assertNotEquals(Measurement(1.0, Unit.Gallon), Measurement(2.0, Unit.Gallon))

        assertEquals(Measurement(1.0, Unit.Gallon), Measurement(4.0, Unit.Quart))
        assertEquals(Measurement(4.0, Unit.Quart), Measurement(1.0, Unit.Gallon))
    }

    @Test
    internal fun convertion() {
        assertEquals(Measurement(2.0, Unit.Gallon), Measurement(32.0, Unit.Cups))
    }

    @Test
    internal fun `to string`() {
        assertEquals("Gallon", Unit.Gallon.toString())
    }
}
