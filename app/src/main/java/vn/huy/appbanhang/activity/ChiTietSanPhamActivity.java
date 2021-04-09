package vn.huy.appbanhang.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;

import vn.huy.appbanhang.R;
import vn.huy.appbanhang.model.SanPham;

public class ChiTietSanPhamActivity extends AppCompatActivity {

    Toolbar toolbarChiTiet;
    ImageView imageViewChiTiet;
    TextView txtTen, txtGia, txtMoTa;
    Spinner spinner;
    Button btnDatMua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_san_pham);
        AnhXa();
        ActionToolBar();
        GetInfomation();
        CatchEventSpinner();
    }

    private void CatchEventSpinner() {
        Integer[] soluong = new Integer[]{1, 2, 3,4 ,5, 6, 7, 8, 9, 10};
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, soluong);
        spinner.setAdapter(arrayAdapter);

    }

    private void GetInfomation() {
        int id = 0;
        String TenChiTiet = "";
        int GiaChiTiet = 0;
        String HinhAnhChiTiet = "";
        String MoTaChiTiet = "";
        int IdSanPham = 0;
        SanPham sanPham = (SanPham) getIntent().getSerializableExtra("thongtinsanpham");
        id = sanPham.getId();
        TenChiTiet = sanPham.getTensp();
        GiaChiTiet = sanPham.getGiasp();
        HinhAnhChiTiet = sanPham.getHinhAnhsp();
        MoTaChiTiet = sanPham.getMoTasp();
        txtTen.setText(TenChiTiet);
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        txtGia.setText("Giá: " + decimalFormat.format(GiaChiTiet) + " Đ");
        txtMoTa.setText(MoTaChiTiet);
        Picasso.get().load(HinhAnhChiTiet).into(imageViewChiTiet);
    }

    private void ActionToolBar() {
        setSupportActionBar(toolbarChiTiet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarChiTiet.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void AnhXa() {
        toolbarChiTiet = findViewById(R.id.toolBarChiTietSanPham);
        imageViewChiTiet = findViewById(R.id.imageviewChiTietSP);
        txtTen = findViewById(R.id.textviewTenChiTietSP);
        txtGia = findViewById(R.id.textviewGiaChiTietSP);
        txtMoTa = findViewById(R.id.textviewMoTaChiTietSP);
        spinner = findViewById(R.id.spinner);
        btnDatMua = findViewById(R.id.buttonDatMua);
    }
}