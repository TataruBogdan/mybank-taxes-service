
CREATE TABLE tax (
    operation operation_type,
    type tax_type,
    amount NUMERIC(10,2) NOT NULL DEFAULT 0
);

