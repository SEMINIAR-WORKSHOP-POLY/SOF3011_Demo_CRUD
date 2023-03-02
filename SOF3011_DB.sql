CREATE DATABASE SOF3011_CRUD;

USE SOF3011_CRUD;

CREATE TABLE SOF3011_CRUD.san_pham (
	id BIGINT auto_increment NOT NULL,
	ten_san_pham varchar(100) NULL,
	loai varchar(100) NULL,
	so_luong_ton INTEGER NULL,
	gia DOUBLE NULL,
	mieu_ta varchar(100) NULL,
	CONSTRAINT san_pham_PK PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO SOF3011_CRUD.san_pham
(id, ten_san_pham, loai, so_luong_ton, gia, mieu_ta)
VALUES(1, 'Áo len', 'Áo', 100, 15000.0, 'Hàng đẹp');
INSERT INTO SOF3011_CRUD.san_pham
(id, ten_san_pham, loai, so_luong_ton, gia, mieu_ta)
VALUES(3, 'Quần dài ', 'Quần', 1000, 300000.0, 'Phù hợp với những bạn cao');
INSERT INTO SOF3011_CRUD.san_pham
(id, ten_san_pham, loai, so_luong_ton, gia, mieu_ta)
VALUES(4, 'Quần sooc', 'Quần ', 200, 50000.0, 'Phù hợp thời tiết mát mẻ');
INSERT INTO SOF3011_CRUD.san_pham
(id, ten_san_pham, loai, so_luong_ton, gia, mieu_ta)
VALUES(5, 'Váy cưới', 'Váy', 100, 100000000, 'Phù hợp ');
INSERT INTO SOF3011_CRUD.san_pham
(id, ten_san_pham, loai, so_luong_ton, gia, mieu_ta)
VALUES(2, 'Áo khoác ', 'Áo', 250, 250000.0, 'Áo khoác quảng châu');
