# Rise Up.Inc Training Backend

-------------------------------------------

## 1. Purpose
- Hands-on backend training project developed during the Rise Up training period to practice end‑to‑end backend development fundamentals: REST API design, layered architecture (Controller / Service / Repository / Domain), testing, dependency management, and iterative refactoring.

## 2. Training Period
- October 2025

## 3. Tech Stack
- Language: Java (Toolchain: Java 25)
- Framework: Spring Boot 3.5.6
- Build Tool: Gradle
- Packaging: JAR
- Dependency Management: Spring Dependency Management Plugin
- Test Framework: JUnit 5 (JUnit Platform)
- Database: Dockerized MySQL

## 4. Learning Resources (Books Used)
- "Becoming a Professional Java Developer" (Japanese title: プロになるJava)
- "This Is Backend Development" (Korean title: 이것이 백엔드 개발이다)

## 5. Product Domain Spec
### 필드 정의
| 한글 | 필드명 | 타입 | 제약 조건 |
|------|--------|------|-----------|
| 상품번호 | id | Long | 1부터 시작, 자동 증가, 중복 불가 (PK) |
| 상품 이름 | name | String | 길이 1~100, 공백 불가, 중복 허용 |
| 가격 | price | Integer | 0 이상 1,000,000 이하 |
| 재고 | amount | Integer | 0 이상 9,999 이하 |

### ビルド定義 (日本語対応表)
| 日本語 | フィールド | 型 | 制約 |
|--------|-----------|----|------|
| 商品番号 | id | Long | 1から開始・自動採番・重複不可 (PK) |
| 商品名 | name | String | 1～100文字・空白不可・重複許可 |
| 価格 | price | Integer | 0以上 1,000,000以下 |
| 在庫数 | amount | Integer | 0以上 9,999以下 |

### 비즈니스 규칙 (KO)
1. 상품번호(id)는 1부터 시작하여 신규 상품 추가 시 1씩 증가한다.
2. 동일한 상품 이름(name)은 존재할 수 있다 (유니크 아님).
3. 가격(price)은 0 이상 1,000,000 이하만 허용한다.
4. 재고(amount)는 0 이상 9,999 이하만 허용한다.

### ビジネスルール (JA)
1. 商品番号(id)は1から開始し、新規追加のたびに1ずつ増加する。重複不可。
2. 同一の商品名(name)は存在してよい（ユニーク制約なし）。
3. 価格(price)は0以上1,000,000以下のみ許容。
4. 在庫(amount)は0以上9,999以下のみ許容。

### 검증 애노테이션 예시 (KO / JA)
```java
// KO: 이름은 1~100 글자, 공백 불가
// JA: 商品名は1～100文字、空白不可
@NotBlank
@Size(min = 1, max = 100)
private String name;

// KO: 0 ~ 1,000,000
// JA: 0 ～ 1,000,000
@Min(0) @Max(1_000_000)
private Integer price;

// KO: 0 ~ 9,999
// JA: 0 ～ 9,999
@Min(0) @Max(9_999)
private Integer amount;
```

### 조회 기능 (Read Use Cases KO)
| 기능 | 설명 | 엔드포인트(예시) | 비고 |
|------|------|------------------|------|
| 단건 조회 | 상품번호로 조회 | GET /products/{id} | 존재하지 않을 경우 404 |
| 전체 목록 | 모든 상품 리스트 | GET /products | 페이지네이션 추후 적용 가능 |
| 이름 부분검색 | 이름에 특정 문자열 포함 | GET /products?nameContains=연필 | 대소문자 처리 전략 추후 결정 |

### 検索機能 (JA)
| 機能 | 説明 | エンドポイント例 | 備考 |
|------|------|-----------------|------|
| 単体取得 | 商品番号で取得 | GET /products/{id} | 見つからない場合 404 |
| 一覧取得 | 全商品リスト | GET /products | ページング後で検討 |
| 部分一致検索 | 名前に文字列を含む商品 | GET /products?nameContains=鉛筆 | 大文字小文字ポリシー後決定 |

### 예시 요청/응답 (KO)
요청 (생성):
```http
POST /products
Content-Type: application/json
{
  "name": "연필",
  "price": 300,
  "amount": 10
}
```
응답 (성공):
```json
{
  "id": 1,
  "name": "연필",
  "price": 300,
  "amount": 10
}
```
유효성 실패 (예: name 누락):
```json
{
  "errors": [ "name : must not be blank" ]
}
```
큰 숫자 오류 (price 초과):
```json
{
  "errors": [ "price : must be less than or equal to 1000000" ]
}
```

### サンプルリクエスト/レスポンス (JA)
リクエスト (作成):
```http
POST /products
Content-Type: application/json
{
  "name": "鉛筆",
  "price": 300,
  "amount": 10
}
```
レスポンス (成功):
```json
{
  "id": 1,
  "name": "鉛筆",
  "price": 300,
  "amount": 10
}
```
バリデーション失敗 (例: name欠如):
```json
{
  "errors": [ "name : must not be blank" ]
}
```
数値範囲エラー (price超過):
```json
{
  "errors": [ "price : must be less than or equal to 1000000" ]
}
```

---

