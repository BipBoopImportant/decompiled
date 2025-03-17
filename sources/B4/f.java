package b4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t3.N;

public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f45385b;

    /* renamed from: c  reason: collision with root package name */
    public final String f45386c;

    /* renamed from: d  reason: collision with root package name */
    public final String f45387d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f45388e;

    class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f45385b = str;
        this.f45386c = str2;
        this.f45387d = str3;
        this.f45388e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return N.d(this.f45385b, fVar.f45385b) && N.d(this.f45386c, fVar.f45386c) && N.d(this.f45387d, fVar.f45387d) && Arrays.equals(this.f45388e, fVar.f45388e);
    }

    public int hashCode() {
        String str = this.f45385b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45386c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45387d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Arrays.hashCode(this.f45388e);
    }

    public String toString() {
        return this.f45394a + ": mimeType=" + this.f45385b + ", filename=" + this.f45386c + ", description=" + this.f45387d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45385b);
        parcel.writeString(this.f45386c);
        parcel.writeString(this.f45387d);
        parcel.writeByteArray(this.f45388e);
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f45385b = (String) N.i(parcel.readString());
        this.f45386c = (String) N.i(parcel.readString());
        this.f45387d = (String) N.i(parcel.readString());
        this.f45388e = (byte[]) N.i(parcel.createByteArray());
    }
}
