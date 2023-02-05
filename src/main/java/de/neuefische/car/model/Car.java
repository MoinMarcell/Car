package de.neuefische.car.model;

/**
 * Erstelle eine Klasse ```Car``` mit den folgenden Eigenschaften:
 * - Name des Herstellers,
 * - Anzahl der Reifen,
 * - hat eine TÜV Plakette
 */
public record Car(
        String brand,
        int tires,
        boolean hasTuev
) {
}
