package vn.huy.appbanhang.ultil;

import android.content.Context;

import java.util.ArrayList;

import vn.huy.appbanhang.R;
import vn.huy.appbanhang.model.SanPham;

public class ConstantsData {
    public static ArrayList<SanPham> getListSanPham(Context context){
        ArrayList<SanPham> arrayList = new ArrayList<>();
        arrayList.add(new SanPham(1, "Oppo Reno5 8GB - 128GB", 8690000, "https://images.fpt.shop/unsafe/fit-in/214x214/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2020/12/25/637445128012092437_oppo-reno5-dd.png", context.getString(R.string.mota_oppo_reno5)));
        arrayList.add(new SanPham(2, "iPhone 12 Pro Max 128GB", 29990000, "https://images.fpt.shop/unsafe/fit-in/214x214/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/2/3/637479614485943996_ip-12-pro-max-dd-2nam.jpg", context.getString(R.string.mota_iphone12_promax)));
        arrayList.add(new SanPham(3, "Xiaomi Redmi Note 9 4GB-128GB", 4190000, "https://images.fpt.shop/unsafe/fit-in/214x214/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2020/7/31/637318140211586419_xiaomi-redmi-note-9-xam-dd-bh.png", context.getString(R.string.mota_redmi_note9)));
        arrayList.add(new SanPham(4, "Samsung Galaxy A72", 10790000, "https://images.fpt.shop/unsafe/fit-in/214x214/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/11/637510730660770271_samsung-a72-tim-dd.jpg", context.getString(R.string.mota_ssgalaxy_a72)));
        arrayList.add(new SanPham(5, "Vivo Y51 8GB - 128GB", 5990000, "https://images.fpt.shop/unsafe/fit-in/214x214/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2020/12/23/637443322357700809_vivo-y51-bac-dd.png", context.getString(R.string.mota_vivo_y51)));
        arrayList.add(new SanPham(6, "Vsmart Active 3 6GB-64GB", 3390000, "https://images.fpt.shop/unsafe/fit-in/214x214/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2020/1/16/637147940925292086_Vsmart-active-3-green-dd-bh18.png", context.getString(R.string.mota_vsmart_active3)));

        return arrayList;
    }
}
