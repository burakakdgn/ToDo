package com.example.kisileruygulamasi.data.repo

import com.example.kisileruygulamasi.data.datasource.KisilerDataSource
import com.example.kisileruygulamasi.data.entity.Kisiler

class KisilerRepository(var kds:KisilerDataSource) {

    suspend fun kaydet(kisi_ad:String) = kds.kaydet(kisi_ad)

    suspend fun guncelle(kisi_id:Int,kisi_ad:String) = kds.guncelle(kisi_id,kisi_ad)

    suspend fun sil(kisi_id:Int) = kds.sil(kisi_id)

    suspend fun kisileriYukle() : List<Kisiler> = kds.kisileriYukle()

    suspend fun ara(aramaKelimesi:String): List<Kisiler> = kds.ara(aramaKelimesi)
}