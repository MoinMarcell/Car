package de.neuefische.car.model;

import lombok.NonNull;

public record Car(
        @NonNull
        String id,
        String brand,
        int tires,
        boolean hasTuev
) {
}
