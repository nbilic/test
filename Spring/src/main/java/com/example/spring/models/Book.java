package com.example.spring.models;

import lombok.NonNull;

public record Book(@NonNull String name, @NonNull String author) {
}
