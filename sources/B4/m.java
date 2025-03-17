package b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t3.N;

public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f45404b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f45405c;

    class a implements Parcelable.Creator<m> {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f45404b = str;
        this.f45405c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return N.d(this.f45404b, mVar.f45404b) && Arrays.equals(this.f45405c, mVar.f45405c);
    }

    public int hashCode() {
        String str = this.f45404b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f45405c);
    }

    public String toString() {
        return this.f45394a + ": owner=" + this.f45404b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45404b);
        parcel.writeByteArray(this.f45405c);
    }

    m(Parcel parcel) {
        super("PRIV");
        this.f45404b = (String) N.i(parcel.readString());
        this.f45405c = (byte[]) N.i(parcel.createByteArray());
    }
}
