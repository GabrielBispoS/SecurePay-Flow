package com.securepay.transactionapi.controller;

import com.securepay.transactionapi.dto.TransactionRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    @PostMapping
    public ResponseEntity<String> processTransaction(@RequestBody @Valid TransactionRequest request) {
        return ResponseEntity.accepted().body("Transação recebida e enviada para processamento.");
    }
}