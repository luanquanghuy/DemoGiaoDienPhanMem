package vn.huy.appbanhang.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.ArrayList;

import vn.huy.appbanhang.R;
import vn.huy.appbanhang.activity.ChiTietSanPhamActivity;
import vn.huy.appbanhang.model.SanPham;

public class DienThoaiAdapter extends BaseAdapter {
    Context context;
    ArrayList<SanPham> arrayDienThoai;

    public DienThoaiAdapter(Context context, ArrayList<SanPham> arrayDienThoai) {
        this.context = context;
        this.arrayDienThoai = arrayDienThoai;
    }

    @Override
    public int getCount() {
        return arrayDienThoai.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayDienThoai.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder{
        public TextView txtTenDT, txtGiaDT, txtMoTaDT;
        public ImageView imgDT;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_dienthoai, null);
            viewHolder.txtTenDT = convertView.findViewById(R.id.textviewdienthoai);
            viewHolder.txtGiaDT = convertView.findViewById(R.id.textviewgiadienthoai);
            viewHolder.txtMoTaDT = convertView.findViewById(R.id.textviewMoTaDienThoai);
            viewHolder.imgDT = convertView.findViewById(R.id.imageviewdienthoai);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        SanPham sanPham = (SanPham) getItem(position);
        viewHolder.txtTenDT.setText(sanPham.getTensp());
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        viewHolder.txtGiaDT.setText("Giá: " + decimalFormat.format(sanPham.getGiasp()) + " Đ");
        viewHolder.txtMoTaDT.setMaxLines(2);
        viewHolder.txtMoTaDT.setEllipsize(TextUtils.TruncateAt.END);
        viewHolder.txtMoTaDT.setText(sanPham.getMoTasp());
        Picasso.get().load(sanPham.getHinhAnhsp()).into(viewHolder.imgDT);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ChiTietSanPhamActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("thongtinsanpham", sanPham);
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}
