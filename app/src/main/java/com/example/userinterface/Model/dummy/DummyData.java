package com.example.userinterface.Model.dummy;

import com.example.userinterface.Model.Penjualan;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static List<Penjualan> getData() {
        List<Penjualan> list = new ArrayList<>();

        list.add(new Penjualan("Senin, 5 November 2018", "Ahmad Maulana", "2", "150000", "Irsyad", "10:12", "10000"));
        list.add(new Penjualan("Selasa, 8 November 2018", "Farel Alg", "1", "30000", "Irsyad", "10:12", "10000"));
        list.add(new Penjualan("Senin, 5 November 2018", "Ahmad Maulana", "2", "150000", "Irsyad", "10:12", "10000"));
        return list;
    }
}
