package com.example;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Wrapper")
public record Wrapper<T>(
        @Schema(oneOf = {String.class, Integer.class, Boolean.class})
        T value
) {
}
