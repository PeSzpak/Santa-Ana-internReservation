package com.restaurante.reservas.model;

public enum Salon {
    DECK("DECK / TOLDO", 50),
    FUNDOS("Fundos", 40),
    LATERAL("Lateral", 45);

    private final String displayName;
    private final int capacity;

    Salon(String displayName, int capacity){
        this.displayName = displayName;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getYellowThrehold() {
        return (int) Math.ceil(capacity * 0.70);
    }

    public int getRedThrehold() {
        return (int) Math.ceil(capacity * 0.90);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
