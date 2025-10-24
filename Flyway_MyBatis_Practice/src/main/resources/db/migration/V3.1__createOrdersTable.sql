CREATE TABLE orders
(
    orders_id      INT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    total_amount  INT,
    total_price   INT
);