package rE;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rE.e  reason: case insensitive filesystem */
public final class C15000e extends C14997b {
    public static final Parcelable.Creator<C15000e> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public String f130669d;

    /* renamed from: e  reason: collision with root package name */
    public String f130670e;

    /* renamed from: f  reason: collision with root package name */
    public String f130671f;

    /* renamed from: rE.e$a */
    public static class a implements Parcelable.Creator<C15000e> {
        public Object createFromParcel(Parcel parcel) {
            return new C15000e(parcel);
        }

        public Object[] newArray(int i10) {
            return new C15000e[i10];
        }
    }

    public C15000e() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15000e.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C15000e eVar = (C15000e) obj;
        String str = this.f130669d;
        if (str == null ? eVar.f130669d != null : !str.equals(eVar.f130669d)) {
            return false;
        }
        String str2 = this.f130670e;
        if (str2 == null ? eVar.f130670e != null : !str2.equals(eVar.f130670e)) {
            return false;
        }
        String str3 = this.f130671f;
        String str4 = eVar.f130671f;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    public String g() {
        return this.f130669d;
    }

    public String h() {
        return this.f130671f;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f130669d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f130670e;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f130671f;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String i() {
        return this.f130670e;
    }

    public void j(String str) {
        this.f130669d = str;
    }

    public void k(String str) {
        this.f130670e = str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f130669d);
        parcel.writeString(this.f130670e);
        parcel.writeString(this.f130671f);
    }

    public C15000e(Parcel parcel) {
        super(parcel);
        this.f130669d = parcel.readString();
        this.f130670e = parcel.readString();
        this.f130671f = parcel.readString();
    }
}
