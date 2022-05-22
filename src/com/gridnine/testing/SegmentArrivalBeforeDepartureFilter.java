package com.gridnine.testing;

public class SegmentArrivalBeforeDepartureFilter implements FlightFilter {

    @Override
    public boolean test(Flight flight) {
        return flight.getSegments().stream()
                .noneMatch(segment -> segment.getArrivalDate().isBefore(segment.getDepartureDate()));
    }
}
