CREATE TABLE transactions (
                              id UUID PRIMARY KEY,
                              masked_card_number VARCHAR(19) NOT NULL,
                              card_holder VARCHAR(100) NOT NULL,
                              amount DECIMAL(19, 2) NOT NULL,
                              status VARCHAR(20) NOT NULL,
                              created_at TIMESTAMP NOT NULL
);