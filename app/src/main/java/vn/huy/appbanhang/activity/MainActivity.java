package vn.huy.appbanhang.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import vn.huy.appbanhang.R;
import vn.huy.appbanhang.adapter.LoaispAdapter;
import vn.huy.appbanhang.adapter.SanPhamAdapter;
import vn.huy.appbanhang.model.Loaisp;
import vn.huy.appbanhang.model.SanPham;
import vn.huy.appbanhang.ultil.ConstantsData;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerView;
    NavigationView navigationView;
    ListView listView;
    DrawerLayout drawerLayout;

    ArrayList<Loaisp> mangloaisp;
    LoaispAdapter loaispAdapter;
    
    ArrayList<SanPham> mangSpMoiNhat;
    SanPhamAdapter sanPhamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();
        actionBar();
        actionViewFlipper();
        AddDuLieuLoaisp();
        loaispAdapter.notifyDataSetChanged();
        AddDuLieuSpMoiNhat();
        sanPhamAdapter.notifyDataSetChanged();
        
        catchOnItemListView();

    }

    private void catchOnItemListView() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, DienThoaiActivity.class);
                        startActivity(intent1);
                        drawerLayout.closeDrawer(GravityCompat.START);
                }
            }
        });
    }

    private void AddDuLieuSpMoiNhat() {
        mangSpMoiNhat.add(new SanPham(1, "Oppo Reno5 8GB - 128GB", 8690000, "https://images.fpt.shop/unsafe/fit-in/214x214/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2020/12/25/637445128012092437_oppo-reno5-dd.png", "OPPO Reno5 kh??ng ch??? l?? m???t chi???c ??i???n tho???i th???i trang m?? c??n l?? c??? th??? gi???i gi???i tr?? ngay tr??n tay, n??i b???n ???????c t???n h?????ng m??n h??nh tuy???t m???, hi???u su???t ?????nh cao v?? camera xu???t s???c v?????t s???c t?????ng t?????ng.\n" +
                "\n" +
                "????nh gi?? chi ti???t OPPO Reno5 v?? Reno5 5G\n" +
                "\n" +
                "V??? ?????p ?????c ????o, b???n b??? theo th???i gian\n" +
                "OPPO Reno5 s??? h???u ki???u d??ng ?????p m???t v???i thi???t k??? thanh m???nh 7,8mm, tr???ng l?????ng si??u nh??? 171 gram. ??i???m nh???n trong thi???t k??? ?????n t??? ch???t l?????ng ho??n thi???n cao v?? m???t l??ng ?????c ????o. Phi??n b???n m??u B???c ??a s???c s??? d???ng l???p ph??? PICASUS, v???a cho v??? ?????p l???p l??nh huy???n ???o l???i v???a kh??ng b??m b???n, m??? h??i hay d???u v??n tay. Trong khi ???? b???n m??u ??en huy???n b?? mang d??ng v??? c??? ??i???n, th??m tr???m nh??ng v???n r???t m???nh m???. Reno5 ???????c ch??? t??c ????? ho??n h???o trong l??ng b??n tay b???n, c???m n???m ch???c ch???n v?? thao t??c d??? d??ng.\n" +
                "\n" +
                "OPPO Reno5 - Reno5 5G | Thi???t k??? hi???n ?????i, sang tr???ng\n" +
                "\n" +
                "M??n h??nh AMOLED 90Hz, kh??ng ch??? ?????p m?? c??n m?????t\n" +
                "M??n h??nh Reno5 c?? k??ch th?????c l???n 6,4 inch, ????? ph??n gi???i Full HD+ s???c n??t v?? c??ng ngh??? AMOLED cao c???p. Vi???n m??n h??nh si??u m???ng cho tr???i nghi???m th??? gi??c t???i ??u, v???i m??n h??nh chi???m t???i 91,7% m???t tr?????c. M???t m??n h??nh ch???t l?????ng kh??ng ch??? hi???n th??? ?????p m?? c??n b???o v??? m???t c???a b???n khi c?? ????? s??ng t???i ??a t???i 600 nits d?????i tr???i n???ng g???t v?? tr??? n??n d???u nh??? v??o bu???i t???i. M??n h??nh OPPO Reno5 v?? Oppo Reno5 5G ???????c ch???ng nh???n b???o v??? m???t Eye Care, ??nh s??ng xanh d?????i 12,5%, kh??ng g??y m???i m???t v?? kh?? ng???."));
        mangSpMoiNhat.add(new SanPham(2, "iPhone 12 Pro Max 128GB", 29990000, "https://images.fpt.shop/unsafe/fit-in/214x214/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/2/3/637479614485943996_ip-12-pro-max-dd-2nam.jpg", getString(R.string.mota_iphone12_promax)));

    }

    private void AddDuLieuLoaisp(){
        mangloaisp.add(new Loaisp(1, "Trang ch???", "https://www.freeiconspng.com/uploads/home-button-icon-png-23.png"));
        mangloaisp.add(new Loaisp(2, "??i???n tho???i", "https://www.freeiconspng.com/uploads/mobile-phone-cell-icon-25.png"));
        mangloaisp.add(new Loaisp(3, "Laptop", "http://icons.iconarchive.com/icons/custom-icon-design/flatastic-7/512/Laptop-icon.png"));
        mangloaisp.add(new Loaisp(4, "Li??n h???", "https://www.freeiconspng.com/uploads/phone-call-icon-16.png"));
        mangloaisp.add(new Loaisp(5, "Th??ng tin", "https://www.freeiconspng.com/uploads/info-icon--delikate-iconset--kyo-tux-20.png"));
    }

    private void actionViewFlipper() {
        ArrayList<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("https://images.fpt.shop/unsafe/fit-in/385x100/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/31/637528276050533862_94764899-9A87-4150-AE6C-7D9B8BCEFBF6.png");
        mangquangcao.add("https://images.fpt.shop/unsafe/fit-in/385x100/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/31/637528276050533862_94764899-9A87-4150-AE6C-7D9B8BCEFBF6.png");
        mangquangcao.add("https://images.fpt.shop/unsafe/fit-in/385x100/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/31/637528276050533862_94764899-9A87-4150-AE6C-7D9B8BCEFBF6.png");
        mangquangcao.add("https://images.fpt.shop/unsafe/fit-in/385x100/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/31/637528276050533862_94764899-9A87-4150-AE6C-7D9B8BCEFBF6.png");
        for(int i = 0; i < mangquangcao.size(); i++){
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.get().load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        Animation animation_slide_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        Animation animation_slide_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        viewFlipper.setInAnimation(animation_slide_in);
        viewFlipper.setOutAnimation(animation_slide_out);

    }

    private void anhXa(){
        toolbar = findViewById(R.id.toolBarManHinhChinh);
        viewFlipper = findViewById(R.id.viewlipper);
        recyclerView = findViewById(R.id.recyclerview);
        navigationView = findViewById(R.id.navigationView);
        listView = findViewById(R.id.listview);
        drawerLayout = findViewById(R.id.drawerlayout);
        mangloaisp = new ArrayList<>();
        loaispAdapter = new LoaispAdapter(mangloaisp, getApplicationContext());
        listView.setAdapter(loaispAdapter);
        mangSpMoiNhat = new ArrayList<>();
        sanPhamAdapter = new SanPhamAdapter(getApplicationContext(), ConstantsData.getListSanPham(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        recyclerView.setAdapter(sanPhamAdapter);
    }

    private void actionBar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
}