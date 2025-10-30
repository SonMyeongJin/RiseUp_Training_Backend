-- V2.00 테스트 데이터 삽입 (정상化 버전)
-- 리뷰어(レビュワー)
INSERT INTO レビュー.レビュワー (会員識別番号, レビュワー名, プロフィール画像url)
VALUES
    ('USR-0001', '山田太郎', 'https://example.com/profiles/yamada.png'),
    ('USR-0002', '佐藤花子', 'https://example.com/profiles/sato.png'),
    ('USR-0003', '鈴木一郎', 'https://example.com/profiles/suzuki.png');

-- 리뷰(レビュー) 공개/비공開 혼합
INSERT INTO レビュー.レビュー (レビュー識別番号, 会員識別番号, 商品識別番号, レーティング, レビュー内容, 公開状態)
VALUES
    ('REV-1001', 'USR-0001', 'item-1001', 5, '素晴らしい商品でした。品質がとても良いです。', '公開'),
    ('REV-1002', 'USR-0002', 'item-1001', 4, '期待以上ですが、配送が少し遅れました。', '公開'),
    ('REV-1003', 'USR-0003', 'item-1001', 2, '使い方が分かりにくく初心者には難しい。', '非公開'),
    ('REV-1004', 'USR-0002', 'item-1002', 5, 'コスパ最高。また購入したい。', '公開'),
    ('REV-1005', 'USR-0003', 'item-1001', 3, '普通です。使えるけど特別ではない。', '公開');

-- 리뷰이미지(レビュー画像) 공개/비공개 혼합 (컬럼명 정상화: レビュー識別番号)
INSERT INTO レビュー.レビュー画像 (レビュー画像識別番号, レビュー識別番号, 画像url, 表示順, 公開状態)
VALUES
    ('IMG-2001', 'REV-1001', 'https://example.com/images/rev1001-1.jpg', 1, '公開'),
    ('IMG-2002', 'REV-1001', 'https://example.com/images/rev1001-2.jpg', 2, '公開'),
    ('IMG-2003', 'REV-1002', 'https://example.com/images/rev1002-1.jpg', 1, '公開'),
    ('IMG-2004', 'REV-1003', 'https://example.com/images/rev1003-1.jpg', 1, '非公開');

-- 리뷰좋아요(レビューいいね) - item-1001 공개 리뷰들에 좋아요
INSERT INTO レビュー.レビューいいね (レビューいいね識別番号, レビュー識別番号, 会員識別番号)
VALUES
    ('LIKE-3001', 'REV-1001', 'USR-0002'),
    ('LIKE-3002', 'REV-1001', 'USR-0003'),
    ('LIKE-3003', 'REV-1002', 'USR-0001'),
    ('LIKE-3004', 'REV-1005', 'USR-0001');

-- 완료
