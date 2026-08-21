package com.example.booking.domain;

import java.time.Instant;

// Record — immutable. Times always UTC (Instant). Local-timezone
// interpretation happens BEFORE construction, using the warehouse's ZoneId.
public record Slot(
        String slotId,
        String postcode,
        Instant startAt,
        Instant endAt,
        int totalCapacity,
        int remainingCapacity
) {
}
