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
        mangSpMoiNhat.add(new SanPham(1, "Oppo Reno5 8GB - 128GB", 8690000, "https://images.fpt.shop/unsafe/fit-in/214x214/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2020/12/25/637445128012092437_oppo-reno5-dd.png", "OPPO Reno5 không chỉ là một chiếc điện thoại thời trang mà còn là cả thế giới giải trí ngay trên tay, nơi bạn được tận hưởng màn hình tuyệt mỹ, hiệu suất đỉnh cao và camera xuất sắc vượt sức tưởng tượng.\n" +
                "\n" +
                "Đánh giá chi tiết OPPO Reno5 và Reno5 5G\n" +
                "\n" +
                "Vẻ đẹp độc đáo, bền bỉ theo thời gian\n" +
                "OPPO Reno5 sở hữu kiểu dáng đẹp mắt với thiết kế thanh mảnh 7,8mm, trọng lượng siêu nhẹ 171 gram. Điểm nhấn trong thiết kế đến từ chất lượng hoàn thiện cao và mặt lưng độc đáo. Phiên bản màu Bạc đa sắc sử dụng lớp phủ PICASUS, vừa cho vẻ đẹp lấp lánh huyền ảo lại vừa không bám bẩn, mồ hôi hay dấu vân tay. Trong khi đó bản màu Đen huyền bí mang dáng vẻ cổ điển, thâm trầm nhưng vẫn rất mạnh mẽ. Reno5 được chế tác để hoàn hảo trong lòng bàn tay bạn, cầm nắm chắc chắn và thao tác dễ dàng.\n" +
                "\n" +
                "OPPO Reno5 - Reno5 5G | Thiết kế hiện đại, sang trọng\n" +
                "\n" +
                "Màn hình AMOLED 90Hz, không chỉ đẹp mà còn mượt\n" +
                "Màn hình Reno5 có kích thước lớn 6,4 inch, độ phân giải Full HD+ sắc nét và công nghệ AMOLED cao cấp. Viền màn hình siêu mỏng cho trải nghiệm thị giác tối ưu, với màn hình chiếm tới 91,7% mặt trước. Một màn hình chất lượng không chỉ hiển thị đẹp mà còn bảo vệ mắt của bạn khi có độ sáng tối đa tới 600 nits dưới trời nắng gắt và trở nên dịu nhẹ vào buổi tối. Màn hình OPPO Reno5 và Oppo Reno5 5G được chứng nhận bảo vệ mắt Eye Care, ánh sáng xanh dưới 12,5%, không gây mỏi mắt và khó ngủ."));
        mangSpMoiNhat.add(new SanPham(2, "iPhone 12 Pro Max 128GB", 29990000, "https://images.fpt.shop/unsafe/fit-in/214x214/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/2/3/637479614485943996_ip-12-pro-max-dd-2nam.jpg", getString(R.string.mota_iphone12_promax)));

    }

    private void AddDuLieuLoaisp(){
        mangloaisp.add(new Loaisp(1, "Trang chủ", "https://www.freeiconspng.com/uploads/home-button-icon-png-23.png"));
        mangloaisp.add(new Loaisp(2, "Điện thoại", "https://www.freeiconspng.com/uploads/mobile-phone-cell-icon-25.png"));
        mangloaisp.add(new Loaisp(3, "Laptop", "http://icons.iconarchive.com/icons/custom-icon-design/flatastic-7/512/Laptop-icon.png"));
        mangloaisp.add(new Loaisp(4, "Liên hệ", "https://www.freeiconspng.com/uploads/phone-call-icon-16.png"));
        mangloaisp.add(new Loaisp(5, "Thông tin", "https://www.freeiconspng.com/uploads/info-icon--delikate-iconset--kyo-tux-20.png"));
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