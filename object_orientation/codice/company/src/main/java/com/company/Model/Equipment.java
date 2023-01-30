package com.company.Model;

import org.jetbrains.annotations.Nullable;

public class Equipment {
    private final String name;
    private final String type;
    private final @Nullable String techSpecs;


    public Equipment(
            String name,
            String type,
            @Nullable String techSpecs
    ) {
        this.name = name;
        this.type = type;
        this.techSpecs = techSpecs;
    }


    /// GETTERS
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public @Nullable String getTechSpecs() {
        return techSpecs;
    }
}
