package vn.huy.appbanhang.model;

import java.io.Serializable;

public class SanPham implements Serializable {
    public int id;
    public String tensp;
    public Integer giasp;
    public String hinhAnhsp;
    public String moTasp;

    public SanPham(int id, String tensp, Integer giasp, String hinhAnhsp, String moTasp) {
        this.id = id;
        this.tensp = tensp;
        this.giasp = giasp;
        this.hinhAnhsp = hinhAnhsp;
        this.moTasp = moTasp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public Integer getGiasp() {
        return giasp;
    }

    public void setGiasp(Integer giasp) {
        this.giasp = giasp;
    }

    public String getHinhAnhsp() {
        return hinhAnhsp;
    }

    public void setHinhAnhsp(String hinhAnhsp) {
        this.hinhAnhsp = hinhAnhsp;
    }

    public String getMoTasp() {
        return moTasp;
    }

    public void setMoTasp(String moTasp) {
        this.moTasp = moTasp;
    }
}
