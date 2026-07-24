package com.restaurante.reservas.model;

public enum OccupancyStatus {
    GREEN("Disponível", "#27ae60"),
    YELLOW("Quase cheio", "#f39c12"),
    RED("Crítico","#e74c3c");

    private final String displayName;
    private final String hexColor;

    OccupancyStatus(String displayName, String hexColor) {
        this.displayName = displayName;
        this.hexColor = hexColor;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getHexColor() {
        return hexColor;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
