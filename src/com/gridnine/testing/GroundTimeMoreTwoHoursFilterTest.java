package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import static com.gridnine.testing.TestConstants.FLIGHT3;
import static com.gridnine.testing.TestConstants.FLIGHT4;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GroundTimeMoreTwoHoursFilterTest {

    private final GroundTimeMoreTwoHoursFilter filter =
            new GroundTimeMoreTwoHoursFilter();

    @Test
    void shouldReturnTrueWhenGroundTimeLessTwoHours() {
        assertTrue(filter.test(FLIGHT3));
    }

    @Test
    void shouldReturnFalseWhenGroundTimeMoreTwoHours() {
        assertFalse(filter.test(FLIGHT4));
    }
}
