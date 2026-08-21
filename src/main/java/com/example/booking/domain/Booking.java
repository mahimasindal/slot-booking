package com.example.booking.domain;

// Ambiguity to resolve yourself: on reschedule, does the same booking
// mutate to point at the new slot, or does the old one become RESCHEDULED
// and a new booking row get created? The RESCHEDULED state existing on its
// own hints at wanting an audit trail — worth deciding deliberately.
public record Booking(
        String bookingId,
        String orderId,
        String customerId,
        String slotId,
        BookingState state
) {
}
