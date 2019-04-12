package com.example.userinterface.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.userinterface.R;
import com.example.userinterface.Model.Penjualan;

import java.util.List;

public class ListPenjualanAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int SECTION_VIEW = 1;
    private static final int DESC_VIEW = 2;

    private List<Penjualan> mList;

    public ListPenjualanAdapter(List<Penjualan> list) {
        this.mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == SECTION_VIEW) {
            return new VHSectionView(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_penjualan, viewGroup, false));
        } else if (i == DESC_VIEW){
            return new VHDescription(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        Penjualan object = mList.get(position);
        if (viewHolder instanceof VHSectionView){
            ((VHSectionView) viewHolder).tanggalPenjualan.setText(object.getTanggal());
        }

        if (viewHolder instanceof VHDescription){
            ((VHDescription) viewHolder).namaPelanggan.setText(object.getPelanggan());
            ((VHDescription) viewHolder).mejaPelanggan.setText(object.getMeja());
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        Penjualan object = mList.get(position);
        if (object.getTanggal() == object.getTanggal()){
            return SECTION_VIEW;
        } else {
            return DESC_VIEW;
        }
    }

    private class VHSectionView extends RecyclerView.ViewHolder {
        private TextView tanggalPenjualan,totalHargaPenjualan;

        public VHSectionView(View itemView) {
            super(itemView);
            tanggalPenjualan = (TextView) itemView.findViewById(R.id.tanggal_penjualan);
            totalHargaPenjualan = (TextView) itemView.findViewById(R.id.total_penjualan);
         }
    }

    private class VHDescription extends RecyclerView.ViewHolder {
        private TextView namaPelanggan,mejaPelanggan,harga,jam;

        public VHDescription(View itemView) {
            super(itemView);
            namaPelanggan = (TextView) itemView.findViewById(R.id.nama_pelanggan);
            mejaPelanggan = (TextView) itemView.findViewById(R.id.meja_pelanggan);
        }
    }
}
