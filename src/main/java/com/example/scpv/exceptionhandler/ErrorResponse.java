package com.example.scpv.exceptionhandler;

public record ErrorResponse(
        int status,
        String error,
        String message,
        long timestamp
) {
}
