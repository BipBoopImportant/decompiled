package b4;

import android.os.Parcel;
import android.os.Parcelable;
import t3.N;

public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f45382b;

    /* renamed from: c  reason: collision with root package name */
    public final String f45383c;

    /* renamed from: d  reason: collision with root package name */
    public final String f45384d;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f45382b = str;
        this.f45383c = str2;
        this.f45384d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return N.d(this.f45383c, eVar.f45383c) && N.d(this.f45382b, eVar.f45382b) && N.d(this.f45384d, eVar.f45384d);
    }

    public int hashCode() {
        String str = this.f45382b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45383c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45384d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f45394a + ": language=" + this.f45382b + ", description=" + this.f45383c + ", text=" + this.f45384d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45394a);
        parcel.writeString(this.f45382b);
        parcel.writeString(this.f45384d);
    }

    e(Parcel parcel) {
        super("COMM");
        this.f45382b = (String) N.i(parcel.readString());
        this.f45383c = (String) N.i(parcel.readString());
        this.f45384d = (String) N.i(parcel.readString());
    }
}
