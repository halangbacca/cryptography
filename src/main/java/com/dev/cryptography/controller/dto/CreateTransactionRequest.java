package com.dev.cryptography.controller.dto;

public record CreateTransactionRequest(
        String userDocument,
        String creditCardToken,
        Long value) {
}
