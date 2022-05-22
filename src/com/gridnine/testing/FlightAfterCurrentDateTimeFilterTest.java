package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import static com.gridnine.testing.TestConstants.FLIGHT1;
import static com.gridnine.testing.TestConstants.FLIGHT2;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FlightAfterCurrentDateTimeFilterTest {

    private final FlightAfterCurrentDateTimeFilter filter = new FlightAfterCurrentDateTimeFilter();

    @Test
    void shouldReturnTrueWhenDepartureAfterNow() {
        assertTrue(filter.test(FLIGHT1));
    }

    @Test
    void shouldReturnFalseWhenDepartureBeforeNow() {
        assertFalse(filter.test(FLIGHT2));
    }
}
