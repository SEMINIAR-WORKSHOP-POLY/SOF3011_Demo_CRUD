package com.poly.hangnt169.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author hangnt169
 */
@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_san_pham")
    private String tenSanPham;

    @Column(name = "loai")
    private String loai;
    @Column(name = "so_luong_ton")
    private Integer soLuongTon;
    @Column(name = "gia")
    private Double gia;
    @Column(name = "mieu_ta")
    private String mieuTa;

    public SanPham() {
    }

    public SanPham(Long id, String tenSanPham, String loai, Integer soLuongTon, Double gia, String mieuTa) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.loai = loai;
        this.soLuongTon = soLuongTon;
        this.gia = gia;
        this.mieuTa = mieuTa;
    }

    public SanPham(String tenSanPham, String loai, Integer soLuongTon, Double gia, String mieuTa) {
        this.tenSanPham = tenSanPham;
        this.loai = loai;
        this.soLuongTon = soLuongTon;
        this.gia = gia;
        this.mieuTa = mieuTa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getMieuTa() {
        return mieuTa;
    }

    public void setMieuTa(String mieuTa) {
        this.mieuTa = mieuTa;
    }
}
