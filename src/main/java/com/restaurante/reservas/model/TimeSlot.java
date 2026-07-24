package com.restaurante.reservas.model;

public enum TimeSlot {
    MANHA("Manhã / Almoço", "Antes das 17:00"),
    JANTAR("Tarde / Jantar", "A partir das 17:00");

   private final String displayName;
   private final String description;

    TimeSlot(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }

    public static TimeSlot fromTime(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);

        if (hour < 17) {
            return MANHA;
        }else {
            return JANTAR;
        }
    }

    @Override
    public String toString() {
        return displayName;
    }
}
