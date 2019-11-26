package oo_workshop

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class ChanceTest {

    @ParameterizedTest
    @ValueSource(doubles = [0.0, 0.5, 1.0])
    internal fun `equals`(probability: Double) {
        Chance(probability).also {
            assertEquals(it, it)
        }
    }

    @Nested
    inner class Not {
        @Test
        internal fun `ikke 1 er 0`() {
            assertEquals(Chance(0.0), !Chance(1.0))
        }

        @Test
        internal fun `ikke 0 er 1`() {
            assertEquals(Chance(1.0), !Chance(0.0))
        }

        @Test
        internal fun `ikke 0,5 er 0,5`() {
            assertEquals(Chance(0.5), !Chance(0.5))
        }

        @ParameterizedTest
        @ValueSource(doubles = [0.0, 0.25, 1.0])
        internal fun `dobbel-ikke`(probability: Double) {
            Chance(probability).also {
                assertEquals(it, !!it)
            }
        }
    }
}
