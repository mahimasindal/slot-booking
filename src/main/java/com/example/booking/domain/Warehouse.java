package com.example.booking.domain;

import java.time.ZoneId;

public enum Warehouse {
    NL_AMS("NL-AMS", "Amsterdam", ZoneId.of("Europe/Amsterdam")),
    DE_BER("DE-BER", "Berlin", ZoneId.of("Europe/Berlin")),
    FR_PAR("FR-PAR", "Paris", ZoneId.of("Europe/Paris"));
    // Deliberately not exhaustive of every warehouse you might ever add —
    // a reminder the design shouldn't assume the list is fixed forever.

    private final String code;
    private final String location;
    private final ZoneId zoneId;

    Warehouse(String code, String location, ZoneId zoneId) {
        this.code = code;
        this.location = location;
        this.zoneId = zoneId;
    }

    public String code() { return code; }
    public String location() { return location; }
    public ZoneId zoneId() { return zoneId; }
}
