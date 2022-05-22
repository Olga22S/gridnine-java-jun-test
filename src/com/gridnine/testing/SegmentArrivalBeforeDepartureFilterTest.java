package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import static com.gridnine.testing.TestConstants.FLIGHT1;
import static com.gridnine.testing.TestConstants.FLIGHT5;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SegmentArrivalBeforeDepartureFilterTest {

    private final SegmentArrivalBeforeDepartureFilter filter =
            new SegmentArrivalBeforeDepartureFilter();

    @Test
    void shouldReturnTrueWhenArrivalAfterDeparture() {
        assertTrue(filter.test(FLIGHT1));
    }

    @Test
    void shouldReturnFalseWhenArrivalBeforeDeparture() {
        assertFalse(filter.test(FLIGHT5));
    }
}
