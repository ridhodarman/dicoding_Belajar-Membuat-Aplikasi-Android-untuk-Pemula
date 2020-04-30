package com.example.visitsumbar;

import android.os.Parcel;
import android.os.Parcelable;

public class Wilayah implements Parcelable {
    private String nama_wilayah;
    private String detail_wilayah;
    private int photo;
    private String lokasi;

    public Wilayah() {

    }

    public String getNama_wilayah() {
        return nama_wilayah;
    }

    public void setNama_wilayah(String nama_wilayah) {
        this.nama_wilayah = nama_wilayah;
    }

    public String getDetail_wilayah() {
        return detail_wilayah;
    }

    public void setDetail_wilayah(String detail_wilayah) {
        this.detail_wilayah = detail_wilayah;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama_wilayah);
        parcel.writeString(detail_wilayah);
        parcel.writeInt(photo);
        parcel.writeString(lokasi);
    }

    protected Wilayah(Parcel in) {
        nama_wilayah = in.readString();
        detail_wilayah = in.readString();
        photo = in.readInt();
        lokasi = in.readString();
    }

    public static final Creator<Wilayah> CREATOR = new Creator<Wilayah>() {
        @Override
        public Wilayah createFromParcel(Parcel in) {
            return new Wilayah(in);
        }

        @Override
        public Wilayah[] newArray(int size) {
            return new Wilayah[size];
        }
    };
}
