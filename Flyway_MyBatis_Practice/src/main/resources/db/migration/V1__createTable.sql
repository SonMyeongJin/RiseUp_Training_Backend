CREATE TABLE `dtb_products` (
                                `product_id` int NOT NULL,
                                `name` text COLLATE utf8mb3_unicode_ci NOT NULL,
                                `name_kana` text COLLATE utf8mb3_unicode_ci NOT NULL,
                                `maker_id` int DEFAULT NULL,
                                `status` smallint NOT NULL DEFAULT '2',
                                `price01` decimal(10,0) DEFAULT NULL,
                                PRIMARY KEY (`product_id`)
)
;

CREATE TABLE `dtb_maker` (
                             `maker_id` int NOT NULL,
                             `name` text COLLATE utf8mb3_unicode_ci NOT NULL,
                             `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
                             `update_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                             `del_flg` smallint NOT NULL DEFAULT '0',
                             PRIMARY KEY (`maker_id`)
)
;