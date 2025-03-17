package b4;

import android.os.Parcel;
import android.os.Parcelable;
import t3.N;

public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f45396b;

    /* renamed from: c  reason: collision with root package name */
    public final String f45397c;

    /* renamed from: d  reason: collision with root package name */
    public final String f45398d;

    class a implements Parcelable.Creator<k> {
        a() {
        }

        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(String str, String str2, String str3) {
        super("----");
        this.f45396b = str;
        this.f45397c = str2;
        this.f45398d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return N.d(this.f45397c, kVar.f45397c) && N.d(this.f45396b, kVar.f45396b) && N.d(this.f45398d, kVar.f45398d);
    }

    public int hashCode() {
        String str = this.f45396b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45397c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45398d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f45394a + ": domain=" + this.f45396b + ", description=" + this.f45397c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45394a);
        parcel.writeString(this.f45396b);
        parcel.writeString(this.f45398d);
    }

    k(Parcel parcel) {
        super("----");
        this.f45396b = (String) N.i(parcel.readString());
        this.f45397c = (String) N.i(parcel.readString());
        this.f45398d = (String) N.i(parcel.readString());
    }
}
