package b4;

import android.os.Parcel;
import android.os.Parcelable;
import t3.N;

public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f45409b;

    /* renamed from: c  reason: collision with root package name */
    public final String f45410c;

    class a implements Parcelable.Creator<o> {
        a() {
        }

        /* renamed from: a */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        /* renamed from: b */
        public o[] newArray(int i10) {
            return new o[i10];
        }
    }

    public o(String str, String str2, String str3) {
        super(str);
        this.f45409b = str2;
        this.f45410c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f45394a.equals(oVar.f45394a) && N.d(this.f45409b, oVar.f45409b) && N.d(this.f45410c, oVar.f45410c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f45394a.hashCode()) * 31;
        String str = this.f45409b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45410c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f45394a + ": url=" + this.f45410c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45394a);
        parcel.writeString(this.f45409b);
        parcel.writeString(this.f45410c);
    }

    o(Parcel parcel) {
        super((String) N.i(parcel.readString()));
        this.f45409b = parcel.readString();
        this.f45410c = (String) N.i(parcel.readString());
    }
}
