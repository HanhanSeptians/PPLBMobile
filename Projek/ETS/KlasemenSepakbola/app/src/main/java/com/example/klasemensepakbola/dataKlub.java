package com.example.klasemensepakbola;

import java.util.ArrayList;

public class dataKlub {
    private static String [] namaKlub ={
      "Bali United",
      "Persib",
        "Persebaya",
        "Bhayangkara",
        "Arema"
    };

    private static String[] poin = {
        69,66,59,59,58
    };

    static ArrayList<Klub> getListData(){
        ArrayList<Klub> list = new ArrayList<>();
        for(int index = 0; index < namaKlub.length; index ++){
            Klub klub = new Klub();
            klub.setNamaKlub(namaKlub[index]);
            klub.setPoin(poin[index]);
            list.add((klub));
        }
        return list;
    }
}
