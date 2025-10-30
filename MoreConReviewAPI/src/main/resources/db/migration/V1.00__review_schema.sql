DROP SCHEMA IF EXISTS レビュー CASCADE;
CREATE SCHEMA レビュー;

CREATE TABLE レビュー.レビュー
(
    レビュー識別番号          VARCHAR(36) PRIMARY KEY,
    会員識別番号        VARCHAR(36) NOT NULL,
    商品識別番号 VARCHAR(36) NOT NULL,
    レーティング             INTEGER     NOT NULL,
    レビュー内容             VARCHAR(3000),
    公開状態 VARCHAR(10) NOT NULL DEFAULT '非公開',
    登録日時                TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE レビュー.レビュー画像
(
    レビュー画像識別番号      VARCHAR(36) PRIMARY KEY,
    レビュー識別番号         VARCHAR(36) NOT NULL,
    画像url                VARCHAR(200) NOT NULL,
    表示順                 SMALLINT NOT NULL,
    公開状態 VARCHAR(10) NOT NULL DEFAULT '非公開',
    登録日時                TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    更新日時 TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE レビュー.レビューいいね
(
    レビューいいね識別番号      VARCHAR(36) PRIMARY KEY,
    レビュー識別番号           VARCHAR(36) NOT NULL,
    会員識別番号              VARCHAR(36) NOT NULL,
    登録日時                 TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE レビュー.レビュワー
(
    会員識別番号        VARCHAR(36) PRIMARY KEY,
    レビュワー名             VARCHAR(100) NOT NULL,
    プロフィール画像url       VARCHAR(200) NOT NULL,
    登録日時                TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);