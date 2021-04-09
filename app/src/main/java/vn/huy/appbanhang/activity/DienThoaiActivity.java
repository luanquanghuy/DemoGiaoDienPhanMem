package vn.huy.appbanhang.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import vn.huy.appbanhang.R;
import vn.huy.appbanhang.adapter.DienThoaiAdapter;
import vn.huy.appbanhang.model.SanPham;
import vn.huy.appbanhang.ultil.ConstantsData;

public class DienThoaiActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<SanPham> mangDienThoai;
    DienThoaiAdapter dienThoaiAdapter;
    Toolbar toolbarDienThoai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dien_thoai);

        listView = findViewById(R.id.listviewDienThoai);
        dienThoaiAdapter = new DienThoaiAdapter(getApplicationContext(), ConstantsData.getListSanPham(this));
        listView.setAdapter(dienThoaiAdapter);
        toolbarDienThoai = findViewById(R.id.toolBarDienThoai);
        setSupportActionBar(toolbarDienThoai);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarDienThoai.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}