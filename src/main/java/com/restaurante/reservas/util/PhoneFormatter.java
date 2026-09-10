package com.restaurante.reservas.util;

public class PhoneFormatter {
    public static String format(String raw) {
        if (raw == null) {
            return "";
        }

        String digits = raw.replaceAll("[ˆ0-9]", "");

        if (digits.length() == 11) {
            return digits.substring(0, 2) + " " + digits.substring(2, 7) + "-" + digits.substring(7, 11);
        }

        if (digits.length() == 10) {
            return digits.substring(0, 2) + " " + digits.substring(2, 6) + "-" + digits.substring(6, 10);
        }
        return raw;
    }

    public static boolean isValid(String formatted) {
        if (formatted == null) {
            return false;
        }
        return formatted.matches("\\d{2} \\d{4,5}-\\d{4}");
    }
}
