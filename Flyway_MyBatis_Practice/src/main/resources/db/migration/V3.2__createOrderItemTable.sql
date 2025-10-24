CREATE TABLE order_item
(
    order_item_id INT PRIMARY KEY,
    orders_id      INT          NOT NULL, -- FK : Connect orders
    item_name     VARCHAR(100) NOT NULL,
    price         INT          NOT NULL,
    quantity      INT          NOT NULL DEFAULT 1,

    -- 외래키임을 알려주는거 / 필수는 아님 --
    FOREIGN KEY (orders_id) REFERENCES orders(orders_id)
);