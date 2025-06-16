package com.example.scpv.common.exception;

public record ErrorResponse(
        int status,
        String error,
        String message,
        long timestamp
) {
}
