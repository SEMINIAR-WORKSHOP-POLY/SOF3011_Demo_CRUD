CREATE DATABASE SOF3011_CRUD;
GO
USE SOF3011_CRUD;
go
CREATE TABLE san_pham (
	id BIGINT IDENTITY NOT NULL,
	ten_san_pham nvarchar(100) NULL,
	loai nvarchar(100) NULL,
	so_luong_ton INTEGER NULL,
	gia float null ,
	mieu_ta nvarchar(100) NULL,
	CONSTRAINT san_pham_PK PRIMARY KEY (id)
)
SET IDENTITY_INSERT san_pham ON
INSERT INTO san_pham
(id, ten_san_pham, loai, so_luong_ton, gia, mieu_ta)
VALUES(1, N'Áo len', 'Áo', 100, 15000.0, N'Hàng đẹp');
INSERT INTO san_pham
(id, ten_san_pham, loai, so_luong_ton, gia, mieu_ta)
VALUES(3, N'Quần dài ', N'Quần', 1000, 300000.0, N'Phù hợp với những bạn cao');
INSERT INTO san_pham
(id, ten_san_pham, loai, so_luong_ton, gia, mieu_ta)
VALUES(4, N'Quần sooc', N'Quần ', 200, 50000.0, N'Phù hợp thời tiết mát mẻ');
INSERT INTO san_pham
(id, ten_san_pham, loai, so_luong_ton, gia, mieu_ta)
VALUES(5, N'Váy cưới', N'Váy', 100, 100000000, N'Phù hợp ');
INSERT INTO san_pham
(id, ten_san_pham, loai, so_luong_ton, gia, mieu_ta)
VALUES(2, 'Áo khoác ', 'Áo', 250, 250000.0, 'Áo khoác quảng châu');
