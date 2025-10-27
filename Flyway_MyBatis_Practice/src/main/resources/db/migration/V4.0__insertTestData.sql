INSERT INTO `dtb_maker` (maker_id, name, update_date, del_flg)
VALUES (4, 'makerA', NULL, 0),
       (5, 'makerB', CURRENT_TIMESTAMP, 0),
       (6, 'makerC', '2025-10-23 08:00:00', 0);

INSERT INTO `dtb_products` (product_id, name, name_kana, maker_id, status, price01)
VALUES (1006, 'apple', 'りんご', 1, 2, 10000),
       (1007, 'banana', 'バナナ', 2, 1, 25000),
       (1008, 'tomato', 'トマト', 3, 2, 2000);