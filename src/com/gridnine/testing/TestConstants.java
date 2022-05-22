package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.Arrays;

public class TestConstants {

    private static final LocalDateTime DEPARTURE1 = LocalDateTime.now().plusDays(1);
    private static final LocalDateTime ARRIVAL1 = DEPARTURE1.plusHours(2);
    private static final LocalDateTime DEPARTURE2 = ARRIVAL1.plusHours(1);
    private static final LocalDateTime ARRIVAL2 = DEPARTURE2.plusHours(3);
    private static final LocalDateTime DEPARTURE3 = ARRIVAL2.plusHours(2);
    private static final LocalDateTime ARRIVAL3 = DEPARTURE3.plusHours(1);
    public static final Segment SEGMENT1 = new Segment(DEPARTURE1, ARRIVAL1);
    public static final Segment SEGMENT2 = new Segment(DEPARTURE1.minusDays(2), ARRIVAL1.minusDays(2));
    public static final Segment SEGMENT3 = new Segment(DEPARTURE2, ARRIVAL2);
    public static final Segment SEGMENT4 = new Segment(DEPARTURE3, ARRIVAL3);
    public static final Segment SEGMENT5 = new Segment(ARRIVAL1, DEPARTURE1);
    //A normal flight
    public static final Flight FLIGHT1 = new Flight(Arrays.asList(SEGMENT1));
    //A flight departing in the past
    public static final Flight FLIGHT2 = new Flight(Arrays.asList(SEGMENT2));
    //A normal multi segment flight
    public static final Flight FLIGHT3 = new Flight(Arrays.asList(SEGMENT1, SEGMENT3));
    //A flight with more than two hours ground time
    public static final Flight FLIGHT4 = new Flight(Arrays.asList(SEGMENT1, SEGMENT3, SEGMENT4));
    //A flight that departs before it arrives
    public static final Flight FLIGHT5 = new Flight(Arrays.asList(SEGMENT5));
}
