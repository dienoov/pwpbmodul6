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

    private String nik;
    private String jeneng;
    private String jenes;

    public Siswo(String nik, String jeneng, String jenes) {
        this.nik = nik;
        this.jeneng = jeneng;
        this.jenes = jenes;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getJeneng() {
        return jeneng;
    }

    public void setJeneng(String jeneng) {
        this.jeneng = jeneng;
    }

    public String getJenes() {
        return jenes;
    }

    public void setJenes(String jenes) {
        this.jenes = jenes;
    }

    public Siswo(Parcel in) {
        this.nik = in.readString();
        this.jeneng = in.readString();
        this.jenes = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nik);
        dest.writeString(this.jeneng);
        dest.writeString(this.jenes);
    }
}
