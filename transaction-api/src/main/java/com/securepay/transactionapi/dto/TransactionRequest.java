package com.securepay.transactionapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.math.BigDecimal;

public record TransactionRequest(
        @NotBlank(message = "O número do cartão é obrigatório")
        @CreditCardNumber(message = "Número de cartão inválido") // Valida o algoritmo de Luhn do cartão
        String cardNumber,

        @NotBlank(message = "O nome do titular é obrigatório")
        String cardHolder,

        @NotNull(message = "O valor da transação é obrigatório")
        @Positive(message = "O valor deve ser maior que zero")
        BigDecimal amount
) {
}