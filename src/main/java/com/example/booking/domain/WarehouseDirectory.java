package com.example.booking.domain;

import org.springframework.stereotype.Component;

// PLACEHOLDER — there's no real postcode -> warehouse rule defined yet.
// This is a stand-in so the rest of the code has something to call.
// Replace the logic below once you decide how routing should really work.
@Component
public class WarehouseDirectory {

    public Warehouse warehouseForPostcode(String postcode) {
        if (postcode == null || postcode.isBlank()) {
            throw new IllegalArgumentException("postcode must not be blank");
        }
        char first = Character.toUpperCase(postcode.charAt(0));
        return switch (first) {
            case '1' -> Warehouse.NL_AMS;
            case 'B' -> Warehouse.DE_BER;
            case 'P' -> Warehouse.FR_PAR;
            default -> throw new IllegalArgumentException(
                    "No warehouse mapped for postcode: " + postcode);
        };
    }
}
