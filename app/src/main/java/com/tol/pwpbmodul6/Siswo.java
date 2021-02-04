package com.tol.pwpbmodul6;

import android.os.Parcel;
import android.os.Parcelable;

public class Siswo implements Parcelable {

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Siswo createFromParcel(Parcel in) {
            return new Siswo(in);
        }

        public Siswo[] newArray(int size) {
            return new Siswo[size];
        }
    };

    private long nik;
    private String jeneng;
    private String kelas;

    public Siswo(long nik, String jeneng, String kelas) {
        this.nik = nik;
        this.jeneng = jeneng;
        this.kelas = kelas;
    }

    public long getNik() {
        return nik;
    }

    public void setNik(long nik) {
        this.nik = nik;
    }

    public String getJeneng() {
        return jeneng;
    }

    public void setJeneng(String jeneng) {
        this.jeneng = jeneng;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public Siswo(Parcel in) {
        this.nik = in.readLong();
        this.jeneng = in.readString();
        this.kelas = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.nik);
        dest.writeString(this.jeneng);
        dest.writeString(this.kelas);
    }
}
